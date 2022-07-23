package LessonsJava.ReflectionEx;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class AnnotationTest1 {
    public static void main(String[] args) {

    }
}


@MyAnnotation
class EmployeeAnnot {
    String name;
   //@MyAnnotation
    double salary;

    public EmployeeAnnot(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
@MyAnnotation
    public void  increaseSalary(){
        salary *= 2;
    }

    @Override
    public String toString() {
        return "EmployeeAnnot{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.SOURCE)
@interface MyAnnotation{

}