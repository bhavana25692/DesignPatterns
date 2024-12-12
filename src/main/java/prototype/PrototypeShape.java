package prototype;

public class PrototypeShape implements Cloneable{
    private String name;
    private int sides;

    public PrototypeShape(String name, int sides) {
        this.name = name;
        this.sides = sides;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSides() {
        return sides;
    }

    public void setSides(int sides) {
        this.sides = sides;
    }

    @Override
    public String toString() {
        return "PrototypeShape{" +
                "name='" + name + '\'' +
                ", sides=" + sides +
                '}';
    }

    @Override
    public PrototypeShape clone() {
        try {
            return (PrototypeShape) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
