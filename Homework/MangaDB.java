import java.util.ArrayList;
import java.util.Scanner;

public class MangaDB{
    // MANGADB will function as an arraylist instead of an array, because there should not be a fixed size for the array
    private ArrayList<Manga> mangaDatabase;

    public MangaDB() {
        mangaDatabase = new ArrayList<>();
    }

    //TO DO LIST
    //have menu looping: show menu ->get user choice-> run method-> repeat until exit
    //-menu calls methods
    //-methods do function/return value

    // add manga
    // requires a manga object
    public void addManga(Manga m){
        mangaDatabase.add(m);
    }

    // read (display) manga entry
    // -display all manga
    // REQUIRES TOSTRING TO DISPLAY OBJECT TYPE MANGA
    public void displayAllManga() {
        if (mangaDatabase.isEmpty()) {
            System.out.println("No manga in the database.");
            return;
        }

        // for each Manga object value in collection mangaDatabase print m
        for (Manga m : mangaDatabase) {
            System.out.println(m);
        }
    }

    public void addMangaFromUser(Scanner input) {
        System.out.print("Enter ID: ");
        int id = input.nextInt();
        input.nextLine();

        System.out.print("Enter title: ");
        String title = input.nextLine();

        System.out.print("Enter author: ");
        String author = input.nextLine();

        System.out.print("Enter artist: ");
        String artist = input.nextLine();

        System.out.print("Enter rating (0.0 - 10.0): ");
        double rating = input.nextDouble();
        input.nextLine();

        System.out.print("Enter description: ");
        String description = input.nextLine();

        Manga m = new Manga(id, title, author, artist, rating, description);

        mangaDatabase.add(m);

        System.out.println("Manga added successfully!");
    }

    // helper function
    public Manga findMangaById(int id) {
        for (Manga m : mangaDatabase) {
            if (m.getId() == id) {
                return m;
            }
        }
        return null;
    }

    // update->modify 
    // -search by id, then update rating/description
    // delete manga
    // - search by id, then remove from list
    // search manga
    // -search by id
    // -search by title
    // -search by author

    // for search id operations, use helper function:
    // findMangaById(int id)

    // sort manga
    // -return sort by score or title or ID or same author
    
    //priority order
    // Storage (list of Manga)

    // addManga
    // displayAllManga
    // findById (helper method)
    // removeManga
    // updateManga
    // menu loop
    // search enhancements
    // sorting

    public static void main(String[] args) {
        MangaDB db = new MangaDB();
        Scanner input = new Scanner(System.in);

        boolean whileRunning = true;

        // running loop
        while (whileRunning) { 
            //display menu
            System.out.println("=== MangaDB Options === \n" +
            "1 : add new manga entry \n" +
            "2 : display all entries \n" +
            "3 : search \n" +
            "4 : exit\n" + 
            "Type number to select choice.");
            
            // get user choice
            int userChoice = input.nextInt();
            input.nextLine();
            // switch on 1,2,3,4,etc...
            switch (userChoice){
                case 1:
                    db.addMangaFromUser(input);
                    break;
                case 2: 
                    // need add tostring
                    displayAllManga();
                    break;
                case 3:
                    //add search function
                case 4:
                    System.out.println("Exiting program...");
                    whileRunning = false;
                    break;
                default:
                    System.out.println("Invalid choice, try again");
            }
        }
    }

    //optional
    // Assume that a new session has no entries
    // -case no entries found, prompt creation

    // unit test edge cases:
    // user tries to remove something that doesn’t exist
    // list is empty and they try to search/sort
    // Input validation (especially with Scanner)

}