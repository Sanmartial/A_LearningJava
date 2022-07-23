package LessonsJava.IONIO.ExternalizableTest;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Second extends First implements Externalizable {
    private String namePlus;
    private String nameCode;

    public String getNamePlus() {
        return namePlus;
    }



    public void setNamePlus(String namePlus) {
        this.namePlus = namePlus;
    }

    public String getNameCode() {
        return nameCode;
    }

    public void setNameCode(String nameCode) {
        this.nameCode = nameCode;
    }

    @Override
    public void writeExternal(ObjectOutput o) throws IOException {
        o.writeUTF(getNamePlus());
        o.writeUTF(getNameCode());
        o.writeUTF(getName());
        o.writeUTF(getLastName());
    }

    @Override
    public void readExternal(ObjectInput o) throws IOException, ClassNotFoundException {
        setNameCode(o.readUTF());
        setNamePlus(o.readUTF());
        setName(o.readUTF());
        setLastName(o.readUTF());
    }
}
