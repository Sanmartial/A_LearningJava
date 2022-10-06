package ApplicationReZerV.PasswordGen;

import ApplicationReZerV.CommonMethods.CommonMethods;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PasswordBody {
    private String password;
    private int countChar;
    private String keyWordOne;
    private String keywordTwo;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setCountChar(int countChar) {
        this.countChar = countChar;
    }

    public void setKeyWordOne(String keyWordOne) {
        this.keyWordOne = keyWordOne;
    }

    public void setKeywordTwo(String keywordTwo) {
        this.keywordTwo = keywordTwo;
    }

    public void getSimpleResult() throws InterruptedException, IOException {
        List<String> list = new ArrayList<>();
        System.out.print("Generating 10 results");
        for (int i = 0; i < 10; i++) {
            addPoint();
            list.add(generationPassword());
        }
        System.out.println();
        list.forEach(System.out::println);
        CommonMethods.writeList(list, "D:\\Java\\A_LearningJava\\src\\ApplicationReZerV\\PasswordGen\\result.txt");
    }

    private void addPoint() throws InterruptedException {
        Thread.sleep(200);
        System.out.print(" . ");
    }

    private String generationPassword() {
        StringBuilder sb1 = new StringBuilder();
        for (int i = 0; i < countChar; i++) {
            sb1.append(getChar());
        }
        return sb1.substring(0);
    }

    private char getChar() {
        char ch = (char) (Math.random() * 122);
        while (!Character.isLetterOrDigit(ch))
            ch = (char) (Math.random() * 122);
        return ch;
    }

    public void getResultKeywords() throws InterruptedException, IOException {
        List<String> list = new ArrayList<>();
        System.out.print("Generating results ");
        for (int i = 0; i < 10; i++)
            addPoint();
        System.out.println();
        list.add(getMethodOne());
        list.add(getMethodTwo());
        list.add(getMethodThree());
        list.add(getMethodFour());
        list.add(getMethodFive());
        list.add(getMethodFive());
        list.add(getMethodFive());
        list.add(getMethodSix());
        list.add(getMethodSeven());
        list.add(getMethodSeven());
        list.forEach(System.out::println);
        CommonMethods.writeList(list, "D:\\Java\\A_LearningJava\\src\\ApplicationReZerV\\PasswordGen\\result.txt");
    }

    private String getMethodSeven() {
        StringBuilder sb1 = new StringBuilder();
        char[] ch = getVariuosDigit().toCharArray();
        return sb1.append(keyWordOne).append(ch[0]).append(ch[1]).append(getVariuosWord()).append(ch[2]).append(ch[3]).append(getVariuosWord()).append(ch[4] + ""+ ch[0]).substring(0);
    }

    private String getMethodSix() {
        StringBuilder sb1 = new StringBuilder();
        return sb1.append(keywordTwo).append(getVariuosDigit()).append(getVariuosDigit()).substring(0);
    }

    private String getMethodFive() {
        StringBuilder sb1 = new StringBuilder();
        return sb1.append(keyWordOne).append("_").append(getVariuosWord()).append("_").append(getVariuosWord()).
                substring(0);
    }

    private String getMethodFour() {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        char[] ch = sb1.append(keyWordOne).append(keywordTwo).substring(0).toCharArray();
        for (int i = 0; i < ch.length; i++) {
            sb2.append(ch[(int) (Math.random() * ch.length)]);
        }
        return sb2.substring(0);
    }

    private String getMethodThree() {
        StringBuilder sb1 = new StringBuilder();
        char[] chOne = keyWordOne.toCharArray();
        char[] chTwo = keywordTwo.toCharArray();
        int dec = chOne.length - 1;
        for (int i = 0; i < chOne.length; i++) {
            if (dec >= 0)
                sb1.append(chOne[dec--]);
            if (i < chTwo.length)
                sb1.append(chTwo[i]);
        }
        return sb1.substring(0);
    }

    private String getMethodTwo() {
        StringBuilder sb1 = new StringBuilder();
        char[] chOne = keyWordOne.toCharArray();
        char[] chTwo = keywordTwo.toCharArray();
        int dec = chTwo.length - 1;
        for (char c : chOne) {
            sb1.append(c);
            if (dec >= 0)
                sb1.append(chTwo[dec--]);
        }
        return sb1.substring(0);
    }

    private String getMethodOne() {
        StringBuilder sb1 = new StringBuilder();
        if (keyWordOne.isEmpty()) keyWordOne = getVariuosWord();
        if (keywordTwo.isEmpty()) keywordTwo = getVariuosDigit();
        char[] chOne = keyWordOne.toCharArray();
        char[] chTwo = keywordTwo.toCharArray();
        for (int i = 0; i < chOne.length; i++) {
            if (i < chTwo.length)
                sb1.append(chOne[i]).append(chTwo[i]);
            else
                sb1.append(chOne[i]);
        }
        return sb1.substring(0);
    }

    private String getVariuosWord() {
        List<String> list = readerListAll("D:\\Java\\A_LearningJava\\src\\ApplicationReZerV\\PasswordGen\\randomWords.txt");
        StringBuilder sb1 = new StringBuilder();
        sb1.append(list.get((int) (Math.random() * list.size())));
        return sb1.substring(0);
    }

    private String getVariuosDigit() {
        List<String> list = readerListAll("D:\\Java\\A_LearningJava\\src\\ApplicationReZerV\\PasswordGen\\randomDigital.txt");
        StringBuilder sb1 = new StringBuilder();
        sb1.append(list.get((int) (Math.random() * list.size())));
        return sb1.substring(0);
    }

    private List<String> readerListAll(String path) {
        List<String> list = new ArrayList<>();
        try (BufferedReader bf = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = bf.readLine()) != null) {
                list.add(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return list;
    }
}