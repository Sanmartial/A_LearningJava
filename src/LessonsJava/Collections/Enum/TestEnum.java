package LessonsJava.Collections.Enum;

public class TestEnum {

    public static void main(String[] args) {

        Animal animal= Animal.DOG;

        switch (animal){
            case DOG -> {
                System.out.println("It's a DOG");
                      break; }
            case CAT -> {
                System.out.println("It's a CAT");
                break;
            }
            case COW -> {
                System.out.println("It's a COW");
            }
        }

    }
}
