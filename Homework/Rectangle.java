// -----------------------------------
// -----------------------------------
// CSCI 185 Programming 2
// Fall 2026
// M1: CLass and Object Lab

// Nicholas Tankiang
// -----------------------------------
// -----------------------------------

// Define a Class of Rectangles
// Design a class named Rectangle to represent a rectangle. The class contains:
public class Rectangle{
    // Two double data fields named width and height that specify the width and height of the rectangle. The default values are 1.0 for both width and height.

    private double width;
    private double height;

    // A constructor that creates a rectangle with a specified width and height
    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    // A no-arg constructor that creates a default rectangle
    // no-arg constructor (default)
    public Rectangle(){
        this.width = 1.0;
        this.height = 1.0;
    }

    // A method named getArea() that returns the area of a rectangle
    public double getArea(){
        return this.width * this.height;
    }

    // A method named getPerimeter() that returns the perimeter
    public double getPerimeter(){
        return (this.width * 2) + (this.height * 2);
    }

    public static void main(String[] args) {
        // Create the first rectangle using the no-arg constructor
        Rectangle firstShape = new Rectangle();
        // Create a second rectangle using the constructor's arguments to set the width to 4.0 and the height to 40.0
        Rectangle secondShape = new Rectangle(4.0, 4.0);

        // Print out the area of the first rectangle
        System.out.println(firstShape.getArea());
        // Print out the perimeter of the second rectangle
        System.out.println(secondShape.getPerimeter());
    }

}