package LessonsJava.patternsProgramming.Builder;

public class Plane {
    private String model;
    private int length;
    private String color;
    private int lengthWing;

    public Plane(Builder builder) {
        this.color = builder.color;
        this.length = builder.length;
        this.lengthWing = builder.lengthWing;
        this.model = builder.model;
    }

    static class Builder{
        private String model;
        private int length;
        private String color;
        private int lengthWing;

        public Builder(String model) {
            this.model = model;
        }

        public Builder setLength(int length) {
            this.length = length;
            return this;
        }

        public Builder setColor(String color) {
            this.color = color;
            return this;
        }

        public Builder setLengthWing(int lengthWing) {
            this.lengthWing = lengthWing;
            return this;
        }

       public Plane builder(){
            return new Plane(this);
        }
    }

    @Override
    public String toString() {
        return "Plane{" +
                "model='" + model + '\'' +
                ", length=" + length +
                ", color='" + color + '\'' +
                ", lengthWing=" + lengthWing +
                '}';
    }

    public String getModel() {
        return model;
    }

    public int getLength() {
        return length;
    }

    public String getColor() {
        return color;
    }

    public int getLengthWing() {
        return lengthWing;
    }
}
