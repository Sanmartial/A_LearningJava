package LessonsJava.Collections.Stack;

import java.util.*;

public class StackTest {
    public static void main(String[] args) {
        Cat barsik = new Cat("Барсик", 4);
        Cat murzik = new Cat("Мурзик", 6);
        Cat vaska = new Cat("Васька", 9);

        Stack<Cat> catStack = new Stack<>();
        catStack.push(barsik); catStack.push(murzik); catStack.push(vaska);

        System.out.println("Текущий стек: " + catStack); System.out.println("Брысь " + catStack.pop());
        System.out.println("Кто последний? " + catStack.peek().toString()); System.out.println("Брысь " + catStack.pop());
        System.out.println("Кто последний? " + catStack.peek().toString()); System.out.println("Брысь " + catStack.pop());
        System.out.println("Никого? " + catStack.empty());
        try { System.out.println("Кто последний? " + catStack.peek().toString());
        }catch (EmptyStackException e)
        { System.out.println("Пустой стек. Некого прогонять");}
        System.out.println("Текущий стек: " + catStack);

        Stack<Integer> stack = new Stack<>();
        List<Integer>list = new Stack<>();
        new StackTest().addElement(stack);
        new StackTest().addElement(list);

        System.out.println(stack);
        System.out.println(list);

        while(!stack.isEmpty()){

            System.out.println(stack.peek());
            stack.pop();
        }
        System.out.println(stack);

    }

   public void addElement (Collection collection){
        collection.add(1);
        collection.add(4);
        collection.add(3);
        collection.add(2);

    }
}

class Cat {
    private String mName;
    private int mAge;

    public Cat(String name, int age) {
        mName = name;
        mAge = age;
    }

    @Override
    public String toString() {
        return this.mName;
    }
}