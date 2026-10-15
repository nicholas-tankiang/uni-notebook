// CSCI185
// Nicholas Tankiang
// M4: Polymorphism Lab

class Secretary extends Person{
    private String facID;
    private int numService;
    // Assuming salary already represents bi-weekly salary
    private int salary;
    // Assuming numVacation represents number of vacation days
    private final int numVacation = 30;

    public void getPaid(Person personType){
        System.out.println("Bi-weekly payment of " + salary);
    }

    public void getVacation(Person personType){
        System.out.println(numVacation + " days of vacation assigned");
    }
}