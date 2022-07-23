package LessonsJava.ReflectionEx;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class ReflectionTest1 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException {
        //Class employeeClass = Class.forName("ReflectionEx.EmployeeRef");
       Class employeeClass2 = EmployeeRef.class;
//
//        EmployeeRef emp = new EmployeeRef();
//        Class employeeClass3 = emp.getClass();

        Field fieldsEmployee = employeeClass2.getField("ID");
        System.out.println("Type is field = " + fieldsEmployee.getType());

        Field [] fields = employeeClass2.getDeclaredFields();

        for(Field s: fields)
            System.out.println(s.getName() + " type is " + s.getType() + " G " + s.getModifiers());

        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");

        Method method = employeeClass2.getMethod("setSalary", double.class);
        System.out.println("return type " + method.getName() + " is " + method.getReturnType() + " and " + Arrays.toString(method.getParameterTypes()));

        Method [] methods = employeeClass2.getDeclaredMethods();

        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");

        for(Method method1: methods) {

          if(Modifier.isPrivate(method1.getModifiers()))
                System.out.println("return type " + method1.getName() + " is " + method1.getReturnType() + " and " + Arrays.toString(method1.getParameterTypes()));
        }

        System.out.println("\nGET INFORMATION ABOUT CONSTRUCTOR");

        Constructor constructor = employeeClass2.getConstructor();

        System.out.println("Constructor has " + constructor.getParameterCount() + " parameters, their types are: " + Arrays.toString(constructor.getParameterTypes())) ;
        System.out.println("!!!!!!!!!!");
        Constructor constructor2 = employeeClass2.getConstructor(int.class, String.class, String.class);

        System.out.println("Constructor has " + constructor2.getParameterCount() + " parameters, their types are: " + Arrays.toString(constructor2.getParameterTypes())) ;
        
        Constructor [] constructors = employeeClass2.getConstructors();

        for (Constructor c :
                constructors) {
            System.out.println("Constructor " + c.getName() + " has " + c.getParameterCount() + " parameters, their types are: " + Arrays.toString(c.getParameterTypes())) ;
        }

        

    }

}
