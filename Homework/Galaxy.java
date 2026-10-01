public class Galaxy{
    private String galaxyName;
    private String galaxyType;
    private double galaxyDiameter;
    private Star[] stars;

    public Galaxy(String galaxyName, String galaxyType, double galaxyDiameter, Star[] stars){
        this.galaxyName = galaxyName;
        this.galaxyType = galaxyType;
        this.galaxyDiameter = galaxyDiameter;
        
        this.stars = new Star[stars.length];
            for (int i = 0; i < stars.length; i++) {
                this.stars[i] = new Star(stars[i]);
            }
    }

    public Galaxy(Galaxy inputGalaxy){
        this.galaxyName = inputGalaxy.getName();
        this.galaxyType = inputGalaxy.getType();
        this.galaxyDiameter = inputGalaxy.getDiameter();
        
        this.stars = new Star[inputGalaxy.stars.length];
            for (int i = 0; i < inputGalaxy.stars.length; i++) {
                this.stars[i] = new Star(inputGalaxy.stars[i]);
            }
    }

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

    public String toString(){
        String output = "";

        output += 
          "Galaxy Name: " + this.getName() + " || " 
        + "Galaxy Type: " + this.getType() + " || " 
        + "Diameter: " + this.getDiameter() + " || " 
        + "List of stars: \n";
        for (int i = 0; i < this.stars.length; i++) {
            output += "Name: " + this.stars[i].getName() 
            + "Diameter: " +  this.stars[i].getDiameter()
            + "Age: " +  this.stars[i].getAge()
            + "Surface Temp" +  this.stars[i].getSurfaceTemp()
            + "\n";
        }

        return output;
    }
}