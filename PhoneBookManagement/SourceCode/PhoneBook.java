import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class PhoneBook {
    private List<Contact> contactList;
    private String ownerName;

    public PhoneBook(){
        contactList = new ArrayList<>();
    }

    public void addContact(String firstName, String lastName, String phoneNumber){
        validateContact(firstName,lastName,phoneNumber);
        Contact contact = new Contact(firstName, lastName, phoneNumber);
        contactList.add(contact);
        saveContactToFile(contact);
    }

    public void deleteContact(String fullName){
        for (int count = 0; count < contactList.size(); count++){
            Contact contact = contactList.get(count);
            if(contact.getFullName().equals(fullName))contactList.remove(count);
            else throw new NotFoundException("Contact not found!");
        }
        reWriteFile();
    }

    public String findContactByFullName(String fullName){
        validateProfileIsSaved(fullName);
            for (Contact contact : contactList) {
                if (contact.getFullName().equalsIgnoreCase(fullName)) {
                    return contact.getPhoneNumber();
                }
        }

        try{
            BufferedReader reader = new BufferedReader(new FileReader("PhoneBookContacts.txt"));
            String phoneNumber = "";
            String fullNameInContact = "";
            String line;
            while((line = reader.readLine()) != null){
                String[] linePart = line.split(" ");
                if(linePart.length == 3){
                    String firstName = linePart[0].trim();
                    String lastName = linePart[1].trim();
                    phoneNumber = linePart[2].trim();

                    fullNameInContact = firstName + " " + lastName;
                }
                if(fullNameInContact.equals(fullName)){
                    reader.close();
                    return phoneNumber;
                }
            }
            reader.close();
        } catch (IOException error){
            throw new PhoneBookException("Contact not found!");
        }
        throw new NotFoundException("Contact not found!");
    }

    public String findProfileByPhoneNumber(String phoneNumber){
        validatePhoneNumberIsSaved(phoneNumber);
        for (int count = 0; count < contactList.size(); count++){
            Contact contact = contactList.get(count);
            if(contact.getPhoneNumber().equals(phoneNumber))return contact.getFullName();
        }
        try {
            BufferedReader reader = new BufferedReader(new FileReader("PhoneBookContacts.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(" ");

                if (parts.length == 3) {
                    String firstName = parts[0].trim();
                    String lastName = parts[1].trim();
                    String number = parts[2].trim();

                    if (number.equals(phoneNumber)) {
                        reader.close();
                        return firstName + " " + lastName;
                    }
                }
            }
            reader.close();
        } catch (IOException error) {
            throw new PhoneBookException("Error reading phonebook");
        }
        throw new NotFoundException("Profile not found!");
    }

    public void setOwnerName(String ownerName){
        if(ownerName == null || ownerName.trim().isEmpty())throw new EmptyNameException("Name cannot be empty");
        this.ownerName = ownerName.trim();
    }
    public String getOwnerName(){
        return ownerName;
    }


    public List<Contact> getContactList() {
        List<Contact> contacts = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader("PhoneBookContacts.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(" ");
                    if (parts.length == 3) {
                        String firstName = parts[0].trim();
                        String lastName = parts[1].trim();
                        String phoneNumber = parts[2].trim();

                    contacts.add(new Contact(firstName, lastName, phoneNumber));
                }
            }
        } catch (IOException error) {
            throw new PhoneBookException("Error reading phonebook");
        }
        return contacts;
    }




















































    private void saveContactToFile(Contact contact) {
        try (FileWriter writer = new FileWriter("PhoneBookContacts.txt", true)) {
            writer.write(contact.getFirstName() + " " + contact.getLastName() + " " + contact.getPhoneNumber());
        } catch (IOException error) {
            throw new PhoneBookException("Error saving contact to phonebook");
        }
    }

    private void reWriteFile(){
        try (BufferedWriter newWrite = new BufferedWriter(new FileWriter("PhoneBookContacts.txt"))){
            for(Contact contact : contactList) {
                newWrite.write(contact.getFirstName() + " " + contact.getLastName() + " " + contact.getPhoneNumber());
                newWrite.newLine();
            }
        } catch (IOException error){
               throw new PhoneBookException("Error re-writing phonebook");
        }
    }

    private void validatePhoneNumberIsSaved(String phoneNumber){
        if (phoneNumber == null || phoneNumber.trim().isEmpty())throw new IllegalArgumentException("Phone number cannot be empty");
        boolean exists = false;
        for (Contact contact : contactList) {
            if (contact.getPhoneNumber().equals(phoneNumber)) {
                exists = true;
                break;
            }
            break;
        }
        if (!exists)throw new NotFoundException("No contact found with phone number: " + phoneNumber);
    }


    private void validateProfileIsSaved(String fullName) {
        if(fullName == null || fullName.trim().isEmpty())throw new IllegalArgumentException("Name cannot be empty");
        for (Contact contact : contactList) {
            if (contact.getFullName().equalsIgnoreCase(fullName)) return;
        }
        throw new NotFoundException("No contact found with full name: " + fullName);
    }


    private void validateContact(String firstName, String lastName, String phoneNumber){
        if(firstName == null || firstName.trim().isEmpty())throw new EmptyNameException("First name cannot be empty");
        if(lastName == null || lastName.trim().isEmpty())throw new EmptyNameException("Last name cannot be empty");
        if(phoneNumber == null || phoneNumber.trim().isEmpty())throw new InvalidPhoneNumberException("Phone number cannot be empty");
    }
}
