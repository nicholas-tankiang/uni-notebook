public class Star{
    private String name;
    private double diameter;
    private int age;
    private double surfaceTemp;

    public Star(String name, double diameter, int age, double surfaceTemp){
        this.name = name;
        this.diameter = diameter;
        this.age = age;
        this.surfaceTemp = surfaceTemp;
    }

    public Star(Star inputStar){
        this.name = inputStar.name;
        this.diameter = inputStar.diameter;
        this.age = inputStar.age;
        this.surfaceTemp = inputStar.surfaceTemp;
    }

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