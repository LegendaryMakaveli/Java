public class Contact {
    private String firstName;
    private String lastName;
    private final String fullName;
    private String phoneNumber;

    public Contact(String firstName, String lastName, String phoneNumber){
        this.fullName = firstName + " " + lastName;
        setFirstName(firstName);
        setLastName(lastName);
        setPhoneNumber(phoneNumber);
    }

    public void setFirstName(String firstName){
        if(firstName == null || firstName.trim().isEmpty())throw new EmptyNameException("First name cannot be empty");
        this.firstName = firstName.trim();
    }
    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName){
        if(lastName == null || lastName.trim().isEmpty())throw new EmptyNameException("Last name cannot be empty");
        this.lastName = lastName.trim();
    }
    public String getLastName() {
        return lastName;
    }

    public void setPhoneNumber(String phoneNumber) {
        if(isValidNumber(phoneNumber)) {
            this.phoneNumber = phoneNumber;
        }else {
            throw new InvalidPhoneNumberException("Phone number is not valid");
        }
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getFullName() {
        return fullName;
    }

    public String toString() {
        return "First Name:  " + firstName + "\n " + "Last Name:  " + lastName + " \n" +"Phone Number:  " + phoneNumber;
    }

    private static boolean isValidNumber(String phoneNumber) {
        if(phoneNumber == null || phoneNumber.trim().isEmpty())throw new InvalidPhoneNumberException("Phone number cannot be empty");
        phoneNumber = phoneNumber.trim();
        String pattern = "^(?:\\+234|0)(7\\d{9}|8\\d{9}|9\\d{9})$";
        return phoneNumber.matches(pattern);
    }

}
