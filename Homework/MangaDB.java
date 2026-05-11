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

        System.out.println("Manga added successfully");
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

    // returns result if id found
    public void searchMangaById(Scanner input) {
        System.out.print("Enter manga's ID to search: ");
        int id = input.nextInt();
        input.nextLine();

        Manga result = findMangaById(id);

            if (result != null) {
                System.out.println("Manga found:");
                System.out.println(result);
            } else {
                System.out.println("No manga found with ID: " + id);
            }
    }

    // delete manga, removing from arraylist
    public void deleteMangaById(Scanner input) {
        System.out.print("Enter manga ID to delete: ");
        int id = input.nextInt();
        input.nextLine();

        Manga result = findMangaById(id);

        if (result != null) {
            mangaDatabase.remove(result);
            System.out.println("Manga deleted successfully.");
        } else {
            System.out.println("Manga not found with ID: " + id);
        }
    }

    // update mutable vars, prompts a switch input
    public void updateMangaById(Scanner input) {
        System.out.print("Enter manga ID to update: ");
        int id = input.nextInt();
        input.nextLine();

        Manga m = findMangaById(id);

        if (m == null) {
            System.out.println("Manga not found with ID: " + id);
            return;
        }

        System.out.println("Manga found: ");
        System.out.println(m);

        System.out.println("Select which to update:");
        System.out.println("1 . Rating");
        System.out.println("2 . Description");
        System.out.println("3 . Both");

        int choice = input.nextInt();
        input.nextLine();

        switch (choice){
            case 1:
                System.out.print("Enter new rating (0.0 - 10.0): ");
                double rating = input.nextDouble();
                input.nextLine();
                m.setRating(rating);
                break;

            case 2:
                System.out.print("Enter new description: ");
                String desc = input.nextLine();
                m.setDescription(desc);
                break;

            case 3:
                System.out.print("Enter new rating (0.0 - 10.0): ");
                double r = input.nextDouble();
                input.nextLine();
                m.setRating(r);

                System.out.print("Enter new description: ");
                String d = input.nextLine();
                m.setDescription(d);
                break;

            default:
                System.out.println("Invalid option.");
        }
        System.out.println("Manga updated successfully.");
    }
    
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
            "4 : delete entry \n" +
            "5 : update entry \n" +
            "6 : exit\n" + 
            "Type number to select choice.");
            
            // get user choice
            int userChoice = input.nextInt();
            input.nextLine();
            // switch on 1,2,3,4,etc...
            switch (userChoice){
                // note that the input variable is not used to get IDs from the user
                // prompting id input is handled internally by method
                case 1:
                    db.addMangaFromUser(input);
                    break;
                case 2: 
                    // need add tostring
                    db.displayAllManga();
                    break;
                case 3:
                    db.searchMangaById(input);
                    break;
                case 4: 
                    db.deleteMangaById(input);
                    break;
                case 5:
                    db.updateMangaById(input);
                    break;
                case 6:
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