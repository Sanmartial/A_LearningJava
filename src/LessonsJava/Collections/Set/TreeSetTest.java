package LessonsJava.Collections.Set;

import java.util.Comparator;
import java.util.Objects;
import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args) {
        var parts = new TreeSet<Item>();
        parts.add(new Item("Toaster", 5));
        parts.add(new Item("Widget", 11));
        parts.add(new Item("Modem", 2));
        parts.add(new Item("TV", 31));
        System.out.println(parts);

        var SortByDescriptor = new TreeSet<Item>(Comparator.comparing(Item::getPartNumber));
        SortByDescriptor.addAll(parts);
        System.out.println(SortByDescriptor);
    }
}

class Item implements Comparable<Item>{
private String description;
private int partNumber;

    public Item(String description, int partNumber) {
        this.description = description;
        this.partNumber = partNumber;
    }

    @Override
    public int compareTo(Item item) {
        if(this.partNumber > item.partNumber)
            return 1;
        if(this.partNumber < item.partNumber)
            return -1;
        else
            return 0;

    }

    @Override
    public String toString() {
        return "[description='" + description + '\'' +
                ", partNumber=" + partNumber +
                ']';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return partNumber == item.partNumber && description.equals(item.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, partNumber);
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(int partNumber) {
        this.partNumber = partNumber;
    }
}