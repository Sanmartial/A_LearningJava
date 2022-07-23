package LessonsJava.lambdaExpressionsTest.LambdaExpressionU0;//package ua.java_Dev.udemy.lessons.LessonsAndHomework.Lessons_U0.Lesson_30;
//
//import java.util.ArrayList;
//
//public class Test30 {
////    public static void main(String[] args) {
////        ArrayList <Student> list = new ArrayList<>();
////        Student st1 = new Student("Ivan", 'm', 22, 3, 8.3);
////        Student st2 = new Student("Roman", 'm', 21, 4, 6.3);
////        Student st3 = new Student("Stepan", 'm', 21, 1, 7.5);
////        Student st4 = new Student("Vladimir", 'm', 22, 2, 5.9);
////        Student st5 = new Student("Maria", 'f', 26, 5, 9.5);
////
////        list.add(st1); list.add(st2); list.add(st3); list.add(st4); list.add(st5);
////
////        StudentInfo si1 = new StudentInfo();
////        si1.printStudentOverGrage(list, 8);
////        System.out.println();
////        si1.printStudentUnderGrage(list, 8);
//
//
////class Student{
////    String name;
////    char sex1;
////   int age;
////    int course;
////    double averadge = 0.00;
////
////    public Student(String name, char sex, int age, int course, double averadge) {
////        this.name = name;
////        this.sex1 = sex;
////        this.age = age;
////        this.course = course;
////        this.averadge = averadge;
////    }
////
////    @Override
////    public String toString() {
////        return "Student{" +
////                "name='" + name + '\'' +
////                ", sex=" + sex1 +
////                ", age=" + age +
////                ", course=" + course +
////                ", averadge=" + averadge +
////                '}';
////    }
////}
////
////class StudentInfo{
////    void printStudent(Student st){
////        System.out.println(st.toString());
////    }
////
////    void printStudentOverGrage(ArrayList<Student> aL, double avgGrade){
////        for(Student s:aL){
////            if (s.averadge > avgGrade)
////                printStudent(s);
////        }
////    }
////
////
////    void printStudentUnderGrage(ArrayList<Student> aL, double avgGrade){
////        for(Student s:aL){
////            if (s.averadge < avgGrade)
////                printStudent(s);
////        }
////    }
////
////
////    void printStudentOverAge(ArrayList<Student> aL, int age){
////        for(Student s:aL){
////            if (s.age > age)
////                printStudent(s);
////        }
////    }
////
////    void printStudentUnderAge(ArrayList<Student> aL, int age){
////        for(Student s:aL){
////            if (s.age < age)
////                printStudent(s);
////        }
////    }
////
////    void printStudentBySex(ArrayList<Student> aL, char sex){
////        for(Student s:aL){
////            if (s.sex1 == sex)
////                printStudent(s);
////        }
////    }
////
////    void printStudentMixCondition(ArrayList<Student> aL, double avGrade, int age, char sex){
////        for(Student s:aL){
////            if (s.averadge > avGrade && s.age < age && s.sex1 == sex)
////                printStudent(s);
////        }
////    }
////
////
////}