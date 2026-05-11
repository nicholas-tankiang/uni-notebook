// unit test edge cases:
// user tries to remove something that doesn’t exist
// list is empty and they try to search/sort
// Input validation (especially with Scanner)

public class MangaDBTest{
    // add testing entries here so not in main (entries are very long)
    public static void loadTestData(MangaDB db) {
        db.addManga(new Manga(1, "Naruto", "Masashi Kishimoto", "Masashi Kishimoto", 8.5, "Twelve years ago, a colossal demon fox terrorized the world. During the monster's attack on the Hidden Leaf Village, the Hokage—the village's leader and most powerful ninja—sacrifices himself to seal the beast inside a newborn, relieving civilization from destruction while dooming the baby to a lonely life. Now, after years of being shunned and bullied, Naruto Uzumaki pesters the village with elaborate pranks and vandalism. Despite these antics, he works hard to achieve his dream: to become the Hokage and earn the acknowledgement of those who have mistreated him for his entire life. Naruto joins Team 7, a ninja squad made up of two of his peers—prodigy Sasuke Uchiha and clever Sakura Haruno. Under the aloof Kakashi Hatake's leadership, Team 7 takes on a series of difficult missions, forcing its members to grow in strength and comradery despite their many differences. Naruto strives to stand out in his rivalry with Sasuke and earn the romantic affection of Sakura. But as the trio brush against danger and death, their tragic pasts threaten to tear them apart."));
        db.addManga(new Manga(2, "One Piece", "Eiichiro Oda", "Eiichiro Oda", 9.2, "Gol D. Roger, a man referred to as the King of the Pirates, is set to be executed by the World Government. But just before his demise, he confirms the existence of a great treasure, One Piece, located somewhere within the vast ocean known as the Grand Line. Announcing that One Piece can be claimed by anyone worthy enough to reach it, the King of the Pirates is executed and the Great Age of Pirates begins. Twenty-two years later, a young man by the name of Monkey D. Luffy is ready to embark on his own adventure, searching for One Piece and striving to become the new King of the Pirates. Armed with just a straw hat, a small boat, and an elastic body, he sets out on a fantastic journey to gather his own crew and a worthy ship that will take them across the Grand Line to claim the greatest status on the high seas."));
        db.addManga(new Manga(3, "Voynich Hotel", "Sayman Dowman", "Sayman Dowman", 8.0, "Welcome to the Voynich Hotel, a rundown resort located on an all but deserted island in the South Pacific. Owned by former Mexican wrestler Kandre Umeda, the hotel is maintained by two mysterious maids, Elena and Beluna, as well as a homicidal chef named Amelia. Taizou Kuzuki, a Japanese tourist, comes to stay at the hotel to escape from his dark past. Soon he discovers that the strange occupants and happenings of the island are even more abnormal than what he is used to. Taizou quickly becomes embroiled in the spiderweb of affairs on the island, growing close to many of the residents and helping them out, though often causing even more problems for himself. But when Taizou's past comes to the island to haunt him, his new friends jump to his aid."));
        db.addManga(new Manga(4, "J⇔M", "Masao Ohtake", "Masao Ohtake", 7.8));
        db.addManga(new Manga(5, "Houseki no Kuni", "Haruko Ichikawa", "Haruko Ichikawa", "Long ago, Earth was struck by six meteorites, creating six moons and leaving a lone island in their wake. Those who could not make it to the island sank to the bottom of the ocean, where, over time, they slowly turned to crystal. As countless millennia passed, 28 of these crystallized lifeforms, known as the Lustrous, rose from the depths and resided on the island. Led by the wise Kongou-sensei, they must defend themselves against the seemingly infinite number of Lunarians, inhabitants of the moons who seek to harvest their valuable bodies for crafting weapons and jewelry. Houseki no Kuni centers around Phosphophyllite, a young gem about to turn three hundred years old. Clumsy, extremely fragile, and having no visible talent, they are one of the weakest gems around, unable to help in the fight against the Lunarians in any meaningful way. But as the battle with the otherworldly invaders rages on, they soon learn that power comes at a cost that no one should have to pay."));
    }

    public static void main(String[] args) {
        MangaDB db = new MangaDB();

        System.out.println("Loading test data...");
        loadTestData(db);
        System.out.println("Test data loaded.\n");

        // TEST 1: valid search
        Manga t1 = db.findMangaById(2);
        if (t1 != null && t1.getTitle().equals("One Piece")) {
            System.out.println("PASS (Test 1)");
        } else {
            System.out.println("FAIL (Test 1)");
        }

        // TEST 2: invalid search
        Manga t2 = db.findMangaById(99);
        if (t2 == null) {
            System.out.println("PASS (Test 2)");
        } else {
            System.out.println("FAIL (Test 2)");
        }

        // TEST 3: delete existing manga
        Manga toDelete = db.findMangaById(3);
        db.deleteMangaByIdTest(toDelete); 

        if (db.findMangaById(3) == null) {
            System.out.println("PASS (Test 3)");
        } else {
            System.out.println("FAIL (Test 3)");
        }

        // TEST 4: update rating
        Manga t4 = db.findMangaById(1);
        t4.setRating(9.5);

        if (t4.getRating() == 9.5) {
            System.out.println("PASS (Test 4)");
        } else {
            System.out.println("FAIL (Test 4)");
        }

        // TEST 5: duplicate prevention logic (manual check)
        if (db.findMangaById(1) != null && db.findMangaById(2) != null) {
            System.out.println("PASS (Test 5)");
        } else {
            System.out.println("FAIL (Test 5)");
        }

        System.out.println("\nTESTING COMPLETE");
    }
}

