// Self-test Question 16 in previous chapter: Give the complete definition of
// a class called Person that has two instance variables, one for the person’s
// name and the other for the person’s age. Include accessor methods and
// mutator methods for each instance variable. Also, include a method that sets
// both the name and age of a person. There are no other methods.
// In the previous chapter, Self-Test Question 16 described a class Person to
// represent a person. The class has instance variables for a person’s name,
// which is a string, and an integer of age. These variables are name and age,
// respectively.

// Repeat Programming Project 2 in Chapter 5 (Same Person Class in Homework
// Write a driver program to test each of the methods,
// including each of the four constructors and at least one true and one false
// case for each of the test methods.
// HOMEWORK 3:

public class Person{

    private String name;
    private int age;

    // add the following four constructor methods: one
    // for each instance variable, one with two parameters for the two instance
    // variables, and a default constructor. Be sure that each constructor sets all of
    // the instance variables. 

    // a. Write a default constructor for Person that sets name to the string "No
    // name yet" and age to zero.
    public Person(){
        this.name = "No name";
        this.age = 0;
    }

    // b. Write a second constructor for Person that sets name to a given string and
    // age to a given age
    public Person(String newName, int newAge){
        this.name = setName(newName);
        this.age = setAge(newAge);
    }

    public Person(String newName){
        this.name = setName(newName);
    }

    public Person(int newAge){
        this.age = setAge(newAge);
    }

    // c. Write a static method createAdult() for Person that returns a special
    // instance of this class. The instance represents a generic adult and has the
    // name “An adult” and the age 21.
    public static Person createAdult(){
        Person genericAdult = new Person("An adult", 21);
        return genericAdult;
    }

    // Include the following additional methods:

    // getName—returns the name of the person as a string.
    public String getName(){
        return this.name;
    }

    // getAge—returns the age of the person.
    public int getAge(){
        return this.age;
    }

    // setName(first, last)—sets the name of the person, given a first and last
    // name as strings.
    public String setName(String firstName, String lastName){
        if (firstName.length() == 0 || 
            lastName.length() == 0){
            System.out.println("ERROR: EMPTY NAME");
            System.exit(0);
        } 
        // remove whitespace from name
        firstName = firstName.replaceAll("\\s", "");
        lastName = lastName.replaceAll("\\s", "");
        return firstName + " " + lastName;
    }

    // setName(name)—sets the name of the person, given the entire name as one string.
    public String setName(String newName){
        if (newName.length() == 0){
            System.out.println("ERROR: EMPTY NAME");
            System.exit(0);
        } 
        // remove whitespace from name
        newName = newName.replaceAll("\\s", "");
        return newName;
    }

    // setAge(age)—sets the age of the person.
    public int setAge(int newAge){
        if (newAge < 0){
            System.out.println("ERROR: NEG AGE");
            System.exit(0);
        } 
        return newAge;
    }

    // • createToddler—a static method that returns a special instance of the class
    // to represent a toddler. The instance has the name “A toddler” and the age 2.
    public Person createToddler(){
        Person defaultToddler = new Person("A toddler", 2);
        return defaultToddler;
    }

    // • createPreschooler—a static method that returns a special instance of the
    // class to represent a preschooler. The instance has the name “A preschooler”
    // and the age 5.
    public Person createPreschooler(){
        Person defaultPresch = new Person("A preschooler", 5);
        return defaultPresch;
    }

    // • createAdolescent—a static method that returns a special instance of the
    // class to represent an adolescent. The instance has the name “An adolescent”
    // and the age 9.
    public Person createAdolescent(){
        Person defaultAdolescent = new Person("A adolescent", 9);
        return defaultAdolescent;
    }

    // • createTeenager—a static method that returns a special instance of the class 
    // to represent a teenager. The instance has the name “A teenager” and the age
    // 15.
    public Person createTeenager(){
        Person defaultTeenager = new Person("A teenager", 15);
        return defaultTeenager;
    }

}