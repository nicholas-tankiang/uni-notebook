public class Manga{
    private int id;
    private String title;
    private String[] genre;
    private String audience;
    private String author;
    private String artist;
    //enum for origin
    //enum for age 
    //date var for date published
    //date var for last update

    public Manga(int id, String title, String[] genre, String audience, String author, String artist){
        this.id = id;
        this.title = title;
        this.genre = genre;
        this.audience = audience;
        this.author = author;
        this.artist = artist;
    }
}