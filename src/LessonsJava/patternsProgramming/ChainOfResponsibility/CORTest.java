package LessonsJava.patternsProgramming.ChainOfResponsibility;

public class CORTest {
    public static void main(String[] args) {
    MessagePrinter messagePrinter = new ConsoleMessagePeinter();
    FileMessegePrinter fileMessegePrinter = new FileMessegePrinter();
    messagePrinter.setNextMessagePrinter(fileMessegePrinter);
    fileMessegePrinter.setNextMessagePrinter(new DbMessagePrint());
    messagePrinter.print("Hello! I am programmer");
    }
}

abstract class MessagePrinter{
    MessagePrinter nextMessagePrinter;

    void setNextMessagePrinter(MessagePrinter messagePrinter){
        nextMessagePrinter = messagePrinter;
    }

    void print(String message){
        this.printMessage(message);
        if(nextMessagePrinter != null){
            nextMessagePrinter.print(message);
        }
    }

    abstract  void  printMessage(String message);
}

class ConsoleMessagePeinter extends MessagePrinter{
    @Override
    void printMessage(String message) {
        System.out.println("print to console: " + message);
    }
}

class FileMessegePrinter extends MessagePrinter{
    @Override
    void printMessage(String message) {
        System.out.println("print to file: " + message);
            }
}

class DbMessagePrint  extends MessagePrinter{
    @Override
    void printMessage(String message) {
        System.out.println("print to file: " + message);
    }
}