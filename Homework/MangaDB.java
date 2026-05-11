// import java.util.Scanner;
import java.util.ArrayList;

public class MangaDB{
    // MANGADB will function as an arraylist instead of an array, because there should not be a fixed size for the array
    private ArrayList<Manga> mangaDatabase;

    public MangaDB() {
        mangaDatabase = new ArrayList<>();
    }
    // Assume that a new session has no entries
    // -case no entries found, prompt creation

    //TO DO LIST
    //have menu looping: show menu ->get user choice-> run method-> repeat until exit
    //-menu calls methods
    //-methods do function/return value

    // CRUD:
    // add manga
    public void addManga(Manga m){
        mangaDatabase.add(m);
    }
    
    // read (display) manga entry
    // -display all manga
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
        // running loop
    }

    // unit test edge cases:
    // user tries to remove something that doesn’t exist
    // list is empty and they try to search/sort
    // Input validation (especially with Scanner)

}