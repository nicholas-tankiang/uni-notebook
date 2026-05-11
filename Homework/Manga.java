public class Manga{
    private int id;
    private double rating;
    private String title;
    private String author;
    private String artist;
    private String description;

    //constructors

    //full constructor
    public Manga(int id, String title, 
    String author, String artist, double rating, String description){
        this.id = id;
        this.title = title;
        this.author = author;
        this.artist = artist;
        this.rating = rating;
        this.description = description;
    }

    // no rating, description
    public Manga(int id, String title, 
    String author, String artist){
        this.id = id;
        this.title = title;
        this.author = author;
        this.artist = artist;
        this.rating = 0.0;
        this.description = "N/A";
    }

    // no description
    public Manga(int id, String title, 
    String author, String artist, double rating){
        this.id = id;
        this.title = title;
        this.author = author;
        this.artist = artist;
        this.rating = rating;
        this.description = "N/A";
    }

    // no rating
    public Manga(int id, String title, 
    String author, String artist, String description){
        this.id = id;
        this.title = title;
        this.author = author;
        this.artist = artist;
        this.rating = 0.0;
        this.description = description;
    }

    //methods

    // get methods
    public int getId(){
        return this.id;
    }

    public double getRating(){
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

    public void setRating(double rating) {
    // must be above 0 less than 10
        if (rating >= 0.0 && rating <= 10.0) {
            //round to one decimal
            this.rating = Math.round(rating * 10.0) / 10.0;
        } else {
            System.out.println("Invalid number");
        }
    }

    public void setDescription(String description){
        // must not be null/empty
        if (description != null && !description.trim().isEmpty()) {
            this.description = description;
        } else {
            System.out.println("Invalid description");
        }
    }
    
}