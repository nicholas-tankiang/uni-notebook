public class Manga{
    private int id;
    private double rating;
    private String title;
    private String author;
    private String artist;
    private String description;

    public Manga(int id, double rating, String title, 
    String author, String artist, String description){
        // add missing var
        this.id = id;
        this.rating = rating;
        this.title = title;
        this.author = author;
        this.artist = artist;
        this.description = description;
    }

    //methods
    // get methods
    public int getId(){
        return this.id;
    }

    public double getrating(){
        return this.rating;
    }

    public String getTitle(){
        return this.title;
    }

    public String getAuthor(){
        return this.author;
    }

    public String getArtist(){
        return this.artist;
    }

    public String getDescription(){
        return this.description;
    }

    // setter methods
    // set methods limited to variables that should be mutable
    // in this case, rating and description may change but ID, author, artist, etc... should not in this version

    public void setRating(double rating){
        if (rating >= 0.0 && rating <= 10.0) {
            this.rating = rating;
        }
    }

    public void setDescription(String description){
        if (description != null && !description.trim().isEmpty()) {
            this.description = description;
        }
    }
    
}