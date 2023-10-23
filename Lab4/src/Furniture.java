/**
 * Class description "Furniture"
 * This is class Furniture.
 *
 * @author Mikhail Shikalovskiy
 * @version 0.0.1 11 May 2022
 */
public class Furniture {

    /**
     * Field - name
     */
    private String name;

    /**
     * Field - color
     */
    private String color;

    /**
     * Field - length
     */
    private int length;

    /**
     * Field - width
     */
    private int width;

    /**
     * Field height
     */
    private int height;

    /**
     * Field - weight
     */
    private int weight;


    /**
     * Constructor for new objects with params
     *
     * @param name   weight of furniture
     * @param color  color of furniture
     * @param length length of furniture
     * @param width  width of furniture
     * @param height height of furniture
     * @param weight weight of furniture
     */
    Furniture(String name, String color, int length, int width, int height, int weight) {
        setName(name);
        setColor(color);
        setLength(length);
        setWidth(width);
        setHeight(height);
        setWeight(weight);
    }

    /**
     * printing parameters
     *
     * @return returns string with
     * all parameters of our object
     */
    public String toString() {
        return "Name: " + name + ", Color: " + color + ", Length: " + length + ", Width: " + width +
                ", Height: " + height + ", Weight: " + weight;
    }

    /**
     * Getters and Setters
     */

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}



