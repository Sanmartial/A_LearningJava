package LessonsJava.IONIO.SerialVersionUIDTest;

import LessonsJava.IONIO.SerialDemo;

import java.io.*;

public class SerialDemoPlus extends SerialDemo implements Externalizable {
    private String namePlus;
    private String codePlus;

    public String getNamePlus() {
        return namePlus;
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeUTF(getCodePlus());
        objectOutput.writeUTF(getNamePlus());
        objectOutput.writeUTF(getName());
        objectOutput.writeUTF(getCode());
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException, ClassNotFoundException {
        setCodePlus(objectInput.readUTF());
        setNamePlus(objectInput.readUTF());
        setName(objectInput.readUTF());
        setCode(objectInput.readUTF());
    }

    public void setNamePlus(String namePlus) {
        this.namePlus = namePlus;
    }

    @Override
    public String toString() {
        return "SerialDemoPlus{" +
                "name='" + name + '\'' +
                ", code='" + code + '\'' +
                ", namePlus='" + namePlus + '\'' +
                ", codePlus='" + codePlus + '\'' +
                '}';
    }

    public String getCodePlus() {
        return codePlus;
    }

    public void setCodePlus(String codePlus) {
        this.codePlus = codePlus;
    }
}
