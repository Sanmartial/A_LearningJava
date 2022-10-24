package ApplicationReZerV.ErdrPlus.ERDRPlusSOLID;

public class Launcher {
    public static void main(String[] args) {
        Procedure procedure = new Procedure(new UserChoice(), new ReadWriteInf(), new StorageMemory(), new SingleFormat(), new ListCompare());
        procedure.start();
    }
}
