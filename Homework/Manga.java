public class Manga{
    private int id;
    private double score;
    private String title;
    private String[] genre;
    private String audience;
    private String author;
    private String artist;
    private String description;

    //enum for origin
    //enum for age rating
    //date var for date published
    //date var for last update
    //should have an image

    public Manga(int id, double score, String title, String[] genre, 
    String audience, String author, String artist, String description){
        // add missing vars
        this.id = id;
        this.score = score;
        this.title = title;
        this.genre = genre;
        this.audience = audience;
        this.author = author;
        this.artist = artist;
        this.description = description;
    }

    // add default image constructor

    //methods
    // get methods
    public int getId(){
        return this.id;
    }

    public double getScore(){
        return this.score;
    }

    public String getTitle(){
        return this.title;
    }

    public String[] getGenre(){
        //needs changes to print array
        return this.genre;
    }

    public String getAudience(){
        return this.audience;
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

      

    //all set methods
}