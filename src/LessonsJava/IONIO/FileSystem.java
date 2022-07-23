package LessonsJava.IONIO;

import java.io.File;
import java.io.FilenameFilter;

public class FileSystem {
    public static void main(String[] args) {

        File f = new File("D:/Test");
        String [] l = f.list(new FilenameFilter() {
            @Override
            public boolean accept(File file, String s) {
                return s.startsWith("");
            }
        });

        for(String k: l){
            System.out.println(k);
        }
    }
}
