class Secretary extends Person{
    private String facID;
    private int numService;
    private int salary;
    private final int numVacation = 30;

    public void getPaid(Person personType){
        System.out.println("Bi-weekly payment of " + salary);
    }

    public void getVacation(Person personType){
        System.out.println(numVacation + " days of vacation assigned");
    }
}