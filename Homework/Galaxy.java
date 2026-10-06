// CSCI185
// Nicholas Tankiang
// Homework Assignment #1: Composition

//REM: Please make sure that your Java classes are properly indented and also include comments as necessary to 
// clearly indicate the different functional blocks as well as the usage of methods.


public class Galaxy{
    private String galaxyName;
    private String galaxyType;
    private double galaxyDiameter;
    private Star[] stars;

    //fullload const
    public Galaxy(String galaxyName, String galaxyType, double galaxyDiameter, Star[] stars){
        this.galaxyName = galaxyName;
        this.galaxyType = galaxyType;
        this.galaxyDiameter = galaxyDiameter;
        
        this.stars = new Star[stars.length];
            for (int i = 0; i < stars.length; i++) {
                this.stars[i] = new Star(stars[i]);
            }
    }

    // copy const 
    public Galaxy(Galaxy inputGalaxy){
        this.galaxyName = inputGalaxy.getName();
        this.galaxyType = inputGalaxy.getType();
        this.galaxyDiameter = inputGalaxy.getDiameter();
        
        this.stars = new Star[inputGalaxy.stars.length];
            for (int i = 0; i < inputGalaxy.stars.length; i++) {
                this.stars[i] = new Star(inputGalaxy.stars[i]);
            }
    }

    // get methods
    public String getName(){
        return this.galaxyName;
    }

    public String getType(){
        return this.galaxyType;
    }

    public double getDiameter(){
        return this.galaxyDiameter;
    }

    public Star[] getStars(){
        Star[] tmpStars = new Star[this.stars.length];
        for (int i = 0; i < this.stars.length; i++) {
            tmpStars[i] = new Star(this.stars[i]);
        }
        return tmpStars;
    }

    // set methods
    public void setName(String name){
        this.galaxyName = name;
    }

    public void setType(String type){
        this.galaxyType = type;
    }

    public void setDiameter(double diameter){
        this.galaxyDiameter = diameter;
    }

    public void setStars(Star[] inputStars){
        this.stars = new Star[inputStars.length];
        for (int i = 0; i < inputStars.length; i++) {
            this.stars[i] = new Star(inputStars[i]);
        }
    }

    // toString string output
    public String toString(){
        String output = "";

        output += 
          "Galaxy Name: " + this.getName() + " || " 
        + "Galaxy Type: " + this.getType() + " || " 
        + "Diameter: " + this.getDiameter() + "\n" 
        + "List of stars: \n";
        for (int i = 0; i < this.stars.length; i++) {
            output += "Name: " + this.stars[i].getName() + " || " 
            + "Diameter: " +  this.stars[i].getDiameter() + " || " 
            + "Age: " +  this.stars[i].getAge() + " || " 
            + "Surface Temp " +  this.stars[i].getSurfaceTemp()
            + "\n";
        }

        return output;
    }

    public static void main(String[] args) {
        //three stars
        //one galaxy

        Star[] sample_array = new Star[3];
        sample_array[0] = new Star("Ext-01", 56, 2, 1000.5);
        sample_array[1] = new Star("GMA-053", 2359, 506, 495634.3);
        sample_array[2] = new Star("UNKWN", 1, 100000, -99999.9);

        Galaxy sample_galaxy = new Galaxy("name", "type", 123, sample_array);
        System.out.println(sample_galaxy.toString());
    }
}