package LessonsJava.patternsProgramming.Factory;

public class AbstractFActorRepeat {
    public static void main(String[] args) {
FactoryRepeat treeFactory = new AbstractFactoryRepeat().createFactory("Tree");
FactoryRepeat bushFactory = new AbstractFactoryRepeat().createFactory("Bush");
treeFactory.createTree("Lemon");
treeFactory.createTree("Mandarin");

Tree lemon = treeFactory.createTree("Lemon");
lemon.grow();

    }
}
interface FactoryRepeat{
    Tree createTree(String typeOfTree);
    Bush createBush(String typeOfBush);
}
class AbstractFactoryRepeat{
    FactoryRepeat createFactory(String typeOfFactory){
        if(typeOfFactory.equals("Tree"))
            return new TreeFactory();
        if(typeOfFactory.equals("Bush"))
            return new BushFactory();
        else
            return null;
    }
}

interface Tree{
    void grow();
}

class Lemon implements Tree{
    @Override
    public void grow() {
        System.out.println("Lemon grows");
    }
}

class Mandarin implements Tree{
    @Override
    public void grow() {
        System.out.println("Mandarin grows");
    }
}

class TreeFactory implements FactoryRepeat{
    @Override
    public Tree createTree(String typeOfTree) {
        if(typeOfTree.equals("Lemon"))
            return new Lemon();
        if(typeOfTree.equals("Mandarin"))
            return new Mandarin();
        else
            return null;
    }

    @Override
    public Bush createBush(String typeOfBush) {
        return null;
    }
}

interface Bush{
    void growBush();
}

class Lief implements Bush{
    @Override
    public void growBush() {
        System.out.println("Leaves grow");
    }
}
class Branch implements Bush{
    @Override
    public void growBush() {
        System.out.println("Branches grow");
    }
}

class BushFactory implements FactoryRepeat{
    @Override
    public Tree createTree(String typeOfTree) {
        return null;
    }

    @Override
    public Bush createBush(String typeOfBush) {
        if(typeOfBush.equals("Lief") || typeOfBush.equals("Leaves"))
            return new Lief();
        if(typeOfBush.equals("Branch"))
            return new Branch();
        else
        return null;
    }
}
