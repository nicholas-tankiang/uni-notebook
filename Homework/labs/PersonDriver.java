// CSCI185
// Nicholas Tankiang
// M3: Inheritance 101 Lab

public class PersonDriver{
    public static void main(String[] args) {
        Student s1 = new Student("Sheldon Cooper", 26, "123-45-6666", true, "1112233", 3.98, "Senior");
        System.out.println(s1.toString());

        Teacher t1 = new Teacher("Angra Mainyu", 99, "666-66-6666", false, "6666666", 100, 666);
        System.out.println(t1.toString());
    }
}
