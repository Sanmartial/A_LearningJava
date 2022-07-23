package LessonsJava.ReflectionEx;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionEx2 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class empClass = EmployeeRef.class;

        Constructor<EmployeeRef> consEmp = empClass.getConstructor(); //создание конструктора без параметров
        EmployeeRef emp = consEmp.newInstance(); //создание объекта


        Constructor constructor = empClass.getConstructor(int.class, String.class, String.class);
        Object obj1 = constructor.newInstance(115, "Roman", "IT");

        Method method = empClass.getMethod("setSalary", double.class);
        method.invoke(obj1, 888.88);

        System.out.println(obj1);
    }
}
