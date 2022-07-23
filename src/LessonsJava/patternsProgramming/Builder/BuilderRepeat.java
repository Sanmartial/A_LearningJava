package LessonsJava.patternsProgramming.Builder;

import LessonsJava.Encapsulation_SuperProtected.HomeWork.Student.Animal.Dog;
import com.sun.source.tree.Tree;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BuilderRepeat {
    public static void main(String[] args) {
        Plane plane = new Plane.Builder("MRIYA")
                .setLength(100)
                .setColor("White")
                .setLengthWing(75)
                .builder();

        System.out.println(plane);

}


}

