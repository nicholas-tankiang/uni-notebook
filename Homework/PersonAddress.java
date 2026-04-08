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

    // +PRE: N/A
    // -POST: String
    public String getFirstName(){
        return this.firstName;
    }

    // +PRE: N/A
    // -POST: String
    public String getLateName(){
        return this.lastName;
    }

    // +PRE: N/A
    // -POST: String
    public String getEmail(){
        return this.emailAddress;
    }

    // +PRE: N/A
    // -POST: String
    public String getTele(){
        return this.teleNumber;
    }

    // +PRE: Single text string (whitespace okay, removed later)
    // -POST: no output
    public void setEmail(String email){
        // remove whitespace from email
        email = email.replaceAll(email, "");
        this.emailAddress = email;
    }

    // +PRE: Single text string, only numbers
    // -POST: no output
    public void setTele(String phoneNo){
        phoneNo = phoneNo.replaceAll(phoneNo, "");
        // remove "-"
        phoneNo = phoneNo.replace("-", ""); 
        this.teleNumber = phoneNo;
    }

    // Insert conditions
    public void sameNameTest(){
        
    }
}