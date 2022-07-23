package LessonsJava.patternsProgramming.Composite;

import java.util.*;

public class CompositeTest {
    public static void main(String[] args) {
        Date date = new Date();
        //date.setTime(1025468812588L);
        String dataLine = String.valueOf(new Formatter().format(new Locale ("ru"), "Data: %td %tB %tY\n", date, date, date));
        System.out.printf(dataLine);
        //DateFormat dateFormat = new DateFormat().format(date);
Folder folder = new Folder("folder", date);
List<Folder>list = new ArrayList<>();
list.add(folder);
        System.out.println(folder);
    }
}

class File{
    private String nameFile;
}

class Folder{
    private String name;
    private Date createDate;
    List<Folder> folders = new ArrayList<>();
    List<File> files =new ArrayList<>();

    public Folder(String name, Date data) {
        this.name = name;
        this.createDate =  data;
    }
    public void addFolder(Folder folder){
        folders.add(folder);
    }

    public void removeFolder(Folder folder){
        folders.remove(folder);
    }

    public List<Folder> getFolders(){
        return folders;
    }

    public void addFiles(File file){
        files.add(file);
    }

    public void removeFiles(File file){
        files.remove(file);
    }

    public List<File> getFiles(){
        return files;
    }

    @Override
    public String toString() {
        return "Folder{" +
                "name='" + name + '\'' +
                ", createDate=" + createDate +
                ", folders=" + folders +
                ", files=" + files +
                '}';
    }
}