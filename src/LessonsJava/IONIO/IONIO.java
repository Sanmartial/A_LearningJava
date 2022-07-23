package LessonsJava.IONIO;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;
import java.nio.file.FileSystem;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class IONIO {
    static String path1 = "D:/Test/text1.txt";
    static String path = "D:/Test/text.txt";
    static String path2 = "D:/Test/text2.txt";
    static String gmail = "D:/Test/gmail.txt";
    static String gmail1 = "D:/Test/gmail1.txt";
    static List<String> list = new ArrayList<>();
    static final int SIZE = 1024 * 8;
    static String file = "D:\\Test\\";
    static StringBuilder sb = new StringBuilder();
    private static java.lang.Object Object;

    public static void main(String[] args) throws Exception {
        //SerialDemo serialDemo = new SerialDemo("name", "Code");
        //serialDemoWrite(serialDemo);
        SerialDemo serialDemo = (SerialDemo) serialDemoRead();
        System.out.println(serialDemo.code);


    }

    public static void DemoInputOutput(){
        String pathIS = "D:/Test/logo.mp4";
        String pathOS = "D:/Test/logo1.mp4";
        try(
                InputStream inputStream = new FileInputStream(pathIS);
                OutputStream outputStream = new FileOutputStream(pathOS)) {

            byte[] buffer = new byte[4096];
            int read;
            while ((read = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer);
            }
            }

        catch (Exception e){
            e.printStackTrace();
        }

    }
    public static void DemoReadWrite() throws IOException {
        Reader reader = new FileReader("D:/Test/text.txt");
        Writer writer = new FileWriter("D:/Test/text1.txt");

        int r = reader.read();
        while ( r != -1){
            r = reader.read();
            writer.write(r);
        }
        reader.close();
        writer.close();
    }
    public static void encodeDemo() throws IOException {
        FileInputStream fis = new FileInputStream("D:/Test/text.txt");
        Reader fr = new InputStreamReader(fis, StandardCharsets.UTF_8);
        BufferedReader br = new BufferedReader(fr);

        String line;
        while((line = br.readLine()) != null){
            System.out.println(line);
            list.add(line);
        }

        for(int i = 0; i < list.size(); i++){
            if(i % 100 == 0)
            System.out.println(list.get(i));
        }

        fis.close();
        fr.close();
        br.close();
    }
    public static void demoMemory(){
        ByteArrayInputStream bais = new ByteArrayInputStream(new byte[10]);
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
    }
    public static void channelExample() throws IOException {
        FileInputStream fis = new FileInputStream("D:/Test/logo.mp4");
        FileInputStream fis1 = new FileInputStream("D:/Test/logo1.mp4");
        FileOutputStream fos = new FileOutputStream("D:/Test/logo11.mp4");
        FileChannel inChannel = fis.getChannel();
        FileChannel outChanel = fos.getChannel();

        ByteBuffer inbb = ByteBuffer.allocate(4096);
        ByteBuffer outbb = ByteBuffer.allocate(4096);
        int r = inChannel.read(inbb);
        while( r != -1){
            inbb.flip();

            while (inbb.hasRemaining()){
                byte get = inbb.get();
                outbb.put(get);
                System.out.println(get);
            }
            //outbb.flip();
            outChanel.write(outbb);
            inbb.clear();
            outbb.clear();
            r = inChannel.read(inbb);

        }
        fis.close();
        fos.close();
    }//методы создания КАНАЛОВ
    public static void demoChanel() throws Exception{
        FileInputStream fis = new FileInputStream(gmail);
        FileInputStream fis1 = new FileInputStream("D:/Test/logo1.mp4");
        FileOutputStream fos = new FileOutputStream(path1);
        FileChannel inChannel = fis.getChannel();
        FileChannel outChanel = fos.getChannel();

        inChannel.transferTo(0, inChannel.size(), outChanel);
        fis.close();
        fos.close();
    }//методы создания КАНАЛОВ
    public static void DataIOStreamRider(){
        try (DataInputStream dis = new DataInputStream(new FileInputStream(path))){
           String line =  dis.readUTF();
            System.out.println(line);
            }
        catch (IOException e){
        e.printStackTrace();}
    }
    public static void DataIOStreamWriter(){
        try
                (DataOutputStream dos = new DataOutputStream(new FileOutputStream(path1))){
            String line = "Hello me friend!";
            dos.writeUTF(line);
            dos.flush();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
    public static void BufferedReaderTest(){
        System.out.println("readering file " + path);

        try (BufferedReader br = new BufferedReader(new FileReader(path))){

            String text; //по строчно
            while((text = br.readLine()) != null){
                System.out.print(text + "\n");
            }

            int text1; //по символьно
            while((text1 = br.read()) != -1){
                System.out.print((char) text1);
                if((char) text1 == ' '){
                    System.out.print(" ");
                }
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }

    }
    public static void BufferedWriterTest(){
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path2))){
            bw.write("Hello my brother");
        }
        catch (IOException e){
            e.printStackTrace();
        }

    }
    public static void BufferedRiderWriterConcole(){
        System.out.println("Метод читает текст с консоли и записывает в файл техт1");
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
            String text;
            while (!(text = br.readLine()).equals("##")) {
                bw.write(text + "\n");
                bw.flush();
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }

    }
    public static void BufferedInputStreamTest(){
        try(BufferedInputStream bis = new BufferedInputStream(new FileInputStream(gmail))){
            byte [] data = new byte[SIZE]; // класс имеет собственный буфер
            int amountData = bis.read(data, 0, SIZE);
            while(amountData != -1 ){
                sb.append(new String(data, StandardCharsets.UTF_8));
                amountData = bis.read(data, 0, SIZE);
            }

            //System.out.println(sb);
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
    public static void BufferedInputOutputStreamTest(){
        try(BufferedInputStream bis = new BufferedInputStream(new FileInputStream(gmail));
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(gmail1))){
            byte [] data = new byte[SIZE];// класс имеет собственный буфер
            int amountData = bis.read(data, 0, SIZE);
            while(amountData != -1 ){
                bos.write(data);
                bos.flush();
                amountData = bis.read(data, 0, SIZE);
            }

            //System.out.println(sb);
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
    public static void printStreameTest(List list){
        try(PrintStream printStream = new PrintStream(new FileOutputStream(gmail1))){
            for(int i = 0; i < list.size(); i++){
                //String s = (String) list.get(i);
                //if(s.contains("roman")){
                printStream.println(list.get(i));
                //System.out.println("   " + i);
                //}
            }
            System.out.println("Write completed");
            //fos.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
    public static void printWriterTest(){
        try(PrintWriter printWriter = new PrintWriter(new FileWriter(path1))) {
            printWriter.println("Hello word");
            Random r = new Random();
            for(int i = 0; i < 5; i++){
                printWriter.println(r.nextInt(2000));}
        } catch (IOException  e) {
            e.printStackTrace();
        }
    }
    public static void PipedIOstreamTest1(){
        try(PipedInputStream in = new PipedInputStream();
            PipedOutputStream out = new PipedOutputStream(in)){
            out.write( "Привет!".getBytes(StandardCharsets.UTF_8));
            out.flush();

            byte[] res = new byte[in.available()];
            in.read(res);

            System.out.println(new String(res));
        }
        catch (IOException e ){
            e.printStackTrace();
        }
    }
    public static void PipedIOstreamTest2() {
        StringBuilder sb = new StringBuilder();
        List list = new ArrayList();
        try (PipedInputStream in = new PipedInputStream();
             PipedOutputStream out = new PipedOutputStream(in);
             BufferedReader br = new BufferedReader(new FileReader(path))){
            String s = br.readLine();
            out.write(s.getBytes(StandardCharsets.UTF_8));
            out.flush();
            int data;
            while(in.available() > 0){
                data = in.read();
                list.add((char)data);
            }
            System.out.println(list);

        }
        catch (IOException e){
            e.printStackTrace();
        }

    }
    public static void randomAccessFileTest(){
        File file = new File(path);
        try(RandomAccessFile raf = new RandomAccessFile(file, "rw")){
            int data = raf.read();
            while (data != -1){
                System.out.print((char)data);
                if(Character.isSpaceChar(data))
                    System.out.println();
                data = raf.read();
            }

            //raf.seek(1000);

            raf.write("Forward Roman!!!".getBytes(StandardCharsets.UTF_8));


        }
        catch (IOException e){e.printStackTrace();}
    }
    public static void fileTest1() throws IOException, InterruptedException {
        File file = new File("C:\\Users");
        String[] fileName = file.list();//возвращает массив файлов и подкаталогов, которые находятся в определенном каталоге
        File[] files = file.listFiles();//возвращает массив файлов и подкаталогов, которые находятся в определенном каталоге

        System.out.println(file.listRoots());//Возвращает корневые точки системы (С://)

        System.out.println(fileName[1]);
        for(String s: fileName)
            System.out.println(s);

        File file1 = new File("D:\\Test\\test11");
        System.out.println(file1.exists()); //проверяет, существует ли по указанному в конструкторе пути файл или каталог

        try{
            boolean createDir = file1.mkdirs();
            boolean create = file1.createNewFile();//создает новый файл по пути, который передан в конструктор
            if(create && createDir)
                System.out.println("create");}
        catch (IOException e){e.printStackTrace();}

        file1.setReadOnly();

        System.out.println(file1.exists());
        Thread.sleep(10000);
        //file1.delete();
        System.out.println(file1.exists());



    }//класс File
    public static void fileTest2() throws IOException, InterruptedException {
        File f = new File("D:\\Test");
        System.out.println(f.canRead() + " " + f.canWrite() + " "+ f.canExecute());
        String[] l = f.list(new FilenameFilter() {
            @Override
            public boolean accept(File file, String s) {
                return s.startsWith("g");
            }
        });

        for(String s: l){
            System.out.println(s);
        }

    }//методы File
    public static void pathFilesTest() throws IOException {
        FileSystem fs = FileSystems.getDefault();
        Path p = fs.getPath(file);
//       try(OutputStream out = Files.newOutputStream(p)){
//           out.write("Hello java".getBytes(StandardCharsets.UTF_8));
//       }
//       catch (IOException e){e.printStackTrace();}
        Path ff = Paths.get("D:\\Test\\test1.txt");
        Path gg = Paths.get("D:\\Test\\test2.txt");

//       try {
//           Files.move(ff, ff.resolveSibling("test3.txt"));
//       } catch (IOException e) {
//           e.printStackTrace();
//       } /*move

//       Iterator<Path> it = ff.iterator();
//       while(it.hasNext())
//           System.out.println(it.next());

        //СОЗДАЕМ ФАЙЛЫ И ПАПКИ
        //System.out.println(ff.getRoot() + " " + ff.getParent() + " " + ff.getFileName() + " " + ff.getName(1) + " " + ff.getFileSystem() + " " + ff.getNameCount());
        //System.out.println(ff.endsWith("test1.txt"));
        //System.out.println(ff.startsWith("D:/"));
//          System.out.println(gg.toString());

        //Files.createTempFile(Paths.get("D:/Test"), "test", ".txt");
//
//       Path dirr = Files.createDirectories(Paths.get("D:/Test/tt"));
//       Files.createFile(Paths.get("D:/Test/tt/test.txt"));
//       Path dirN = Paths.get("D:/Test/tt2");
//       try{
//            Files.createDirectory(dirN);}
//       catch (FileAlreadyExistsException a){
//           a.printStackTrace();
//       }
//       finally {
//           Path newF = Files.createFile(dirN.resolve("text1.txt"));
//       }

        //ЧИТАЕМ И ЗАПИСЫВАЕМ
//       String ss = "My computer was turnoff";
//       Path pathWr = Files.write(Paths.get("D:\\Test\\test2.txt"), ss.getBytes());
//       try(BufferedReader br = Files.newBufferedReader(pathWr)){
//           //br.lines().forEach(System.out::println);
//       }
//       catch (IOException e){
//           e.printStackTrace();
//       }
//
//       byte[] data = Files.readAllBytes(pathWr);
//       System.out.println(new String(data));

        //отображение содержания папки(Директории)
//       String pathstr = "D:\\Test";
//       Path pathDir = Paths.get(pathstr);
//       try(DirectoryStream<Path> ds = Files.newDirectoryStream(pathDir)){
//           Iterator<Path> it = ds.iterator();
//           int i = 0;
//           while(it.hasNext() && i < 10){
//               Path pp = it.next();
//               System.out.println(pp);
//               i++;
//           }

//       String pathstr = "D:\\Test";
//       Path pathDir = Paths.get(pathstr);
//       try(DirectoryStream<Path> ds = Files.newDirectoryStream(fs.getPath(pathstr, "*.txt"))){
//
//           for(Path po: ds){
//               System.out.println(po);
//           }
//       }
//       catch (IOException i){i.printStackTrace();}

        //ПРОДОЛЖЕНИЕ МЕТОДОВ ПЕРЕБОРА ДЕРЕВА ПАПОК
//        List<Path> list = new ArrayList<>();
//       Files.walkFileTree(fs.getPath("D:\\Мои документы"), new SimpleFileVisitor<Path>(){
//           public FileVisitResult visitFile(Path file, BasicFileAttributes attrs){
//               list.add(file);
//               return FileVisitResult.CONTINUE;
//           }
//       });
//
//       //list.forEach(System.out::println);
//
//       try(PrintWriter print = new PrintWriter(new FileWriter("D:\\Test\\mydoc.txt"))){
//           for(int i = 0; i < list.size(); i++)
//               print.println(list.get(i));
//           print.println("The end!!!");
//       }




//




    }//методы Path Files
    public static List<String>filesReadLines(String s){
        try{
            return Files.readAllLines(Paths.get(s));
        }
        catch (IOException e){
            e.printStackTrace(System.out);
        }
        return Collections.EMPTY_LIST;
    }
    public static void serialDemoWrite(Object object) throws IOException {
        try(FileOutputStream fos = new FileOutputStream("D:\\Test\\out.data");
        ObjectOutputStream oos = new ObjectOutputStream(fos)){
            oos.writeObject(object);
        }
    }//СЕРИАЛИЗАЦИЯ
    public static Object serialDemoRead() throws IOException {
        try(FileInputStream fis = new FileInputStream("D:\\Test\\out.data");
            ObjectInputStream ois = new ObjectInputStream(fis)){
            return ois.readObject();
        }
        catch (IOException e){e.printStackTrace();}
        catch (ClassNotFoundException c){c.printStackTrace();}
    return Object;}//СЕРИАЛИЗАЦИЯ
}



