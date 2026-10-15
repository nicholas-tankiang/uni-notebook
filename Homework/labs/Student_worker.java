// CSCI185
// Nicholas Tankiang
// M4: Polymorphism Lab

class Student_worker extends Person{
    private String taID;
    private String year;
    // Assuming salary already represents hourly salary
    private int salary;
    // Assuming numVacation represents number of vacation days
    private final int numVacation = 2;
    private String courseTaught;

    // getPaid @override of Person method of same name
    public void getPaid(Person personType){
        System.out.println("Hourly payment of " + salary);
    }

    // getVacation @override of Person method of same name
    public void getVacation(Person personType){
        System.out.println(numVacation + " days of vacation assigned");
    }
}