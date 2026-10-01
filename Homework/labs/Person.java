public class Person{
    private String name;
    private int age;
    private String ssn;
    private boolean isAlive;

    //constructors
    public Person(String n, String s, int a){
        this.name = n;
        this.age = a;
        this.ssn = s;
    }

    public Person(Person p){
        if (p == null){
            System.err.println("Person object invalid! Stop!");
            System.exit(1);
        }
        this.name = p.name;
        this.age = p.age;
        this.ssn = p.ssn;
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public String getSSN(){
        return this.ssn;
    }

    public boolean getAliveStatus(){
        return this.isAlive;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }
    
    public void setSSN(String ssn){
        this.ssn = ssn;
    }

    public void setStatus(boolean isAlive){
        this.isAlive = isAlive;
    }

    public String toString(){
        return "Person Info:\n\nName: " + this.name + "\nSSN: " + this.ssn
        + "\nAge: " + this.age + "\n\n";
    }
}