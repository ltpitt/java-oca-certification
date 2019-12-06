package academy.learnprogramming;

/**
 * @author goran on 14/07/2017.
 */
public class Person {

    private String firstName;
    private String lastName;

    public Person() {
        this("Eric", "Jonson");
    }

    public Person(String firstName, String last) {
//        this();
        this.firstName = firstName;
//        this.lastName = last;
//        String lastName = "myName";
        lastName = last;
    }

    public static void main(String[] args) {

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
//        this();
        this.firstName = firstName;
    }

    public String getFullName() {
//        return this.firstName + " " + this.lastName;
        return firstName + lastName;
    }
}
