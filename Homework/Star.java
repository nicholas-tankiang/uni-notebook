// CSCI185
// Nicholas Tankiang
// Homework Assignment #1: Composition

//REM: Please make sure that your Java classes are properly indented and also include comments as necessary to 
// clearly indicate the different functional blocks as well as the usage of methods.


public class Star{
    private String name;
    private double diameter;
    private int age;
    private double surfaceTemp;

    //fullload const
    public Star(String name, double diameter, int age, double surfaceTemp){
        this.name = name;
        this.diameter = diameter;
        this.age = age;
        this.surfaceTemp = surfaceTemp;
    }

    // copy const 
    public Star(Star inputStar){
        this.name = inputStar.name;
        this.diameter = inputStar.diameter;
        this.age = inputStar.age;
        this.surfaceTemp = inputStar.surfaceTemp;
    }

    // get methods
    public String getName(){
        return this.name;
    }

    public double getDiameter(){
        return this.diameter;
    }

    public int getAge(){
        return this.age;
    }

    public double getSurfaceTemp(){
        return this.surfaceTemp;
    }

    // set methods

    public void setName(String name){
        this.name = name;
    }

    public void setDiameter(double diameter){
        this.diameter = diameter;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setSurfaceTemp(double temp){
        this.surfaceTemp = temp;
    }

    // toString string output
    public String toString(){
        String output = "";

        output += 
          "Star Name: " + this.getName() + " || " 
        + "Diameter: " + this.getDiameter() + " || " 
        + "Age: " + this.getAge() + " || " 
        + "Surface Temp:" + this.getSurfaceTemp();

        return output;
    }
}