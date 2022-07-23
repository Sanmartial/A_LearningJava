package LessonsJava.RegularExpressions.VideoLessonJava;


//youtube.com/watch?v=WOYyYwNj7TU&list=PL786bPIlqEjQsE_WAcKpkZ-Q4T-A8j1D2
public class TestLess246 {
    public static void main(String[] args) {
        String matchesString = "globaroman@gmail.com";
        String pattern1 = "[A-Za-z0-9._%%+-]+@[A-Za-z]+\\.[A-Za-z]+";
        System.out.println(matchesString.matches(pattern1));

        String pattern = "[A-Za-z0-9]+@[A-Za-z]+\\.[com]+";

            if(matchesString.matches(pattern)) {
                System.out.println("true");
            }
            else {
                System.out.println("Wrong email. Try again");

            }
        }
    }

