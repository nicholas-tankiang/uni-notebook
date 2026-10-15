class Student_worker extends Person{
    private String taID;
    private String year;
    private int salary;
    private final int numVacation = 2;
    private String courseTaught;

    public void getPaid(Person personType){
        System.out.println("Hourly payment of " + salary);
    }

    public void getVacation(Person personType){
        System.out.println(numVacation + " days of vacation assigned");
    }
}