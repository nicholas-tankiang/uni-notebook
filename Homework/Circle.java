public class Circle {
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    //refers to prev constructor 
    public Circle(){
        this(1.0);
    }
}