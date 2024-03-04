package isp.lab3.exercise2;

public class Exercise2 {
    private int length = 2;
    private int width = 1;
    private String color = "red";

    Exercise2(int length, int width) {
        this.length = length;
        this.width = width;
    }

    Exercise2(int length, int width, String color) {
        this.length = length;
        this.width = width;
        this.color = color;
    }

    public int getLength() {
        return length;

    }

    public int getWidth() {
        return width;
    }

    public String getcolor() {
        return color;
    }

    public int getPerimeter() {
        return 2 * length + 2 * width;
    }

    public int getArea() {
        return length * width;
    }

    public static void main(String[] args) {
        Exercise2 Rectangle = new Exercise2(3, 4);
        Exercise2 Rectangle2 = new Exercise2(3, 4, "blue");
        System.out.println("the length of rectangle is " + Rectangle.getLength() + " " + "the width of rectangle is " + Rectangle.getWidth() + " The color of rectangle is " + Rectangle.getcolor() +
                " the perimeter of rectangle is " + Rectangle.getPerimeter() + " The area of rectangle is " + Rectangle.getArea());
        ;

        System.out.println("the length of Rectangle2 is " + Rectangle2.getLength() + " " +
                "the width of Rectangle2 is " + Rectangle2.getWidth() + " The color of Rectangle2 is "
                + Rectangle2.getcolor() + " the perimeter of Rectangle2 is " +
                Rectangle2.getPerimeter() + " The area of Rectangle2 is " +
                Rectangle2.getArea());

    }

}