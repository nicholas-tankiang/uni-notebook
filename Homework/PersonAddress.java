// Consider a class PersonAddress that represents an entry in an address book.
// Its attributes are
// • The first name of the person
// • The last name of the person
// • The e-mail address of the person
// • The telephone number of the person
// It will have methods to
// • Access each attribute
// • Change the e-mail address
// • Change the telephone number
// • Test whether two instances are equal based solely on name
// a. Write a method heading for each method.
// b. Write preconditions and postconditions for each method.
// c. Write some Java statements that test the class.
// d. Implement the class.

public class PersonAddress{

    private String firstName;
    private String lastName;
    private String emailAddress;
    private String teleNumber;

    public void setEmail(String email){
        this.emailAddress = email;
    }

    public void setTele(String phoneNo){
        this.teleNumber = phoneNo;
    }

    // Insert conditions
    public void sameNameTest(){
        
    }
}