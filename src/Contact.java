public class Contact {
    int ID = 0;
    String firstName = "";
    String middleName = "";
    String lastName = "";
    String companyName = "";
    String phoneNumber = "";
    String email = "";
    String address1 = "";
    String address2 = "";
    String city = "";
    String state = "";
    int zipCode = 0;

    public boolean contains(String text) {
        return firstName.contains(text) || lastName.contains(text);
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }
}
