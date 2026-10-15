// CSCI185
// Nicholas Tankiang
// M4: Polymorphism Lab

class Professor extends Person{
    private String facID;
    private String researchArea;
    // Assuming salary already represents monthly salary
    private int salary;
    // Assuming numVacation represents number of vacation days
    private final int numVacation = 90;

    // getPaid @override of Person method of same name
    public void getPaid(Person personType){
        System.out.println("Monthly payment of " + salary);
    }

    // getVacation @override of Person method of same name
    public void getVacation(Person personType){
        System.out.println(numVacation + " days of vacation assigned");
    }
}