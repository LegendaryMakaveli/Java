import javax.swing.*;

public class PhoneBookMain {
    private static Phonebooks phonebooks = new Phonebooks();

    private static void print(String prompt) {
        JOptionPane.showMessageDialog(null, prompt);
    }

    private static String collectInput(String prompt) {
        return JOptionPane.showInputDialog(null, prompt);
    }

    static void main(String[] args) {
        boolean running = true;
        PhoneBookMain.print("Welcome to the Makaveli PhoneBook System!");
        while (running) {
            String choice = collectInput("""
                    ====== MAIN MENU ======
                    1. Create New PhoneBook
                    2. Open Existing PhoneBook
                    3. View All PhoneBooks
                    4. Delete PhoneBook
                    5. Exit
                    Choose an option:
                    """);
            switch (choice) {
                case "1" -> createPhoneBook();
                case "2" -> openPhoneBook();
                case "3" -> viewAllPhoneBooks();
                case "4" -> deletePhoneBook();
                case "5" -> {
                    print("Exiting system... Goodbye!");
                    running = false;
                }
                default -> System.out.println("Invalid choice. Try again.");
            }
        }
    }

    private static void createPhoneBook() {
        String owner = PhoneBookMain.collectInput("Enter owner name for new PhoneBook:  ");
        try {
            PhoneBookMain.phonebooks.addPhoneBook(owner);
            PhoneBookMain.print("PhoneBook for '" + owner + "' created successfully!");
        } catch (RuntimeException e) {
            PhoneBookMain.print(e.getMessage());
        }
    }

    private static void openPhoneBook() {
        String owner = PhoneBookMain.collectInput("Enter owner name of PhoneBook to open:  ");

        PhoneBook selected = PhoneBookMain.phonebooks.findPhoneBookByName(owner);
        if (selected == null) {
            PhoneBookMain.print("PhoneBook not found!");
            return;
        }

        PhoneBookMain.print("Opened PhoneBook of " + owner);
        boolean inPhoneBook = true;

        while (inPhoneBook) {
            String choice = PhoneBookMain.collectInput("""
                    ======" + owner.toUpperCase() + PHONEBOOK ======
                    1. Add Contact
                    2. View All Contacts
                    3. Find Contact by Full Name
                    4. Find Profile by Phone Number
                    5. Delete Contact
                    6. Back to Main Menu
                    Choose an option:
                    """);
            switch (choice) {
                case "1" -> addContact(selected);
                case "2" -> viewAllContacts(selected);
                case "3" -> findContactByFullName(selected);
                case "4" -> findProfileByPhoneNumber(selected);
                case "5" -> deleteContact(selected);
                case "6" -> inPhoneBook = false;
                default -> System.out.println("Invalid choice. Try again.");
            }
        }
    }

    private static void viewAllPhoneBooks() {
        if (PhoneBookMain.phonebooks.getPhoneBookList().isEmpty()) {
            System.out.println("No phonebooks created yet.");
            return;
        }

        PhoneBookMain.print("\nAll PhoneBooks:");
        for (PhoneBook phoneBook : PhoneBookMain.phonebooks.getPhoneBookList()) {
            PhoneBookMain.print("-> " + phoneBook.getOwnerName());
        }
    }

    private static void deletePhoneBook() {
        String owner = PhoneBookMain.collectInput("Enter owner name of PhoneBook to delete:  ");
        try {
            PhoneBookMain.phonebooks.deletePhoneBook(owner);
            PhoneBookMain.print("PhoneBook for '" + owner + "' deleted successfully!");
        } catch (RuntimeException e) {
            PhoneBookMain.print(e.getMessage());
        }
    }

    private static void addContact(PhoneBook phoneBook) {
        String firstName = PhoneBookMain.collectInput("Enter first name:  ");
        String lastName = PhoneBookMain.collectInput("Enter last name:  ");
        String phoneNumber = PhoneBookMain.collectInput("Enter phoneNumber:  ");
        try {
            phoneBook.addContact(firstName, lastName, phoneNumber);
            PhoneBookMain.print("Contact added successfully!");
        } catch (RuntimeException e) {
            PhoneBookMain.print(e.getMessage());
        }
    }

    private static void viewAllContacts(PhoneBook phoneBook) {
        PhoneBookMain.print("\nAll Contacts:");
        if (phoneBook.getContactList().isEmpty()) {
            PhoneBookMain.print("No contacts saved yet.");
            return;
        }
        for (Contact contact : phoneBook.getContactList()) {
            PhoneBookMain.print("-> " + contact.getFullName() + " (" + contact.getPhoneNumber() + ")");
        }
    }

    private static void findContactByFullName(PhoneBook phoneBook) {
        String name = PhoneBookMain.collectInput("Enter full name: ");
        try {
            String phone = phoneBook.findContactByFullName(name);
            PhoneBookMain.print(name + "'s number: " + phone);
        } catch (RuntimeException e) {
            PhoneBookMain.print(e.getMessage());
        }
    }

    private static void findProfileByPhoneNumber(PhoneBook phoneBook) {
        String number = PhoneBookMain.collectInput("Enter phone number: ");
        try {
            String name = phoneBook.findProfileByPhoneNumber(number);
            PhoneBookMain.print("Owner of " + number + ": " + name);
        } catch (RuntimeException e) {
            PhoneBookMain.print(e.getMessage());
        }
    }

    private static void deleteContact(PhoneBook phoneBook) {
        String name = PhoneBookMain.collectInput("Enter full name of contact to delete:  ");
        try {
            phoneBook.deleteContact(name);
            PhoneBookMain.print("Contact deleted successfully!");
        } catch (RuntimeException e) {
            PhoneBookMain.print(e.getMessage());
        }
    }
}

