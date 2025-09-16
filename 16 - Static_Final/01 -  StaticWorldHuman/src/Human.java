// Human.java
public class Human {
    private String name;
    private double height;

    // Static field to store average height of all humans
    public static double avgHeight;

    // Constructor
    public Human(String name, double height) {
    this.name = name;
    this.height = height;
    }

    // Getter for name
    public String getName() {
    return name;
    }

    // Setter for name
    public void setName(String name) {
    this.name = name;
    }

    // Getter for height
    public double getHeight() {
    return height;
    }

    // Setter for height
    public void setHeight(double height) {
    this.height = height;
    }
}
