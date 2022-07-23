package LessonsJava.Collections.Enum;

public enum Season {
    WINTER("Зима"), SPRING("Весна"), SUMMER("Лето"), AUTUMN("Осень");

    private String translation;

    Season(String translation){
        this.translation = translation;
    }

    public String getTranslation() {
        return translation;
    }


}
