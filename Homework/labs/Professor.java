class Professor extends Person{
    private String facID;
    private String researchArea;
    private int salary;
    private final int numVacation = 90;

    public void getPaid(Person personType){
        System.out.println("Monthly payment of " + salary);
    }

    public void getVacation(Person personType){
        System.out.println(numVacation + " days of vacation assigned");
    }
}