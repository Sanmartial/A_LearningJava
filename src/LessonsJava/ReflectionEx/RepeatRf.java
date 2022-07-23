package LessonsJava.ReflectionEx;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class RepeatRf {
    public static void main(String[] args) {
        Class emplClass = EmployeeRef.class;
        Class stringClass = String.class;
        Field [] fields = emplClass.getDeclaredFields();

        for(Field field: fields)
        System.out.println(field.getName() + " ##### " + field.getType() + " ###### " + field.getModifiers());

        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        Method [] methods = stringClass.getDeclaredMethods();
        for(Method method: methods)
        System.out.println(method.getName() + " ##### " + method.getReturnType() + " ###### " + method.getModifiers()+ " ###### " + Arrays.toString(method.getParameterTypes()));
    }
}
