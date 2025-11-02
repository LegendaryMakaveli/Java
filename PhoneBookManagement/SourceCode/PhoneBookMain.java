import java.util.Scanner;

public class PhoneBookMain {
    private static final Scanner input = new Scanner(System.in);
    private static final Phonebooks phonebooks = new Phonebooks();

    public static void main(String[] args) {
        boolean running = true;
        System.out.println("Welcome to the Makaveli PhoneBook System!");

        while (running) {
            System.out.println("\n====== MAIN MENU ======");
            System.out.println("1. Create New PhoneBook");
            System.out.println("2. Open Existing PhoneBook");
            System.out.println("3. View All PhoneBooks");
            System.out.println("4. Delete PhoneBook");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            String choice = input.nextLine();

            switch (choice) {
                case "1" -> createPhoneBook();
                case "2" -> openPhoneBook();
                case "3" -> viewAllPhoneBooks();
                case "4" -> deletePhoneBook();
                case "5" -> {
                    System.out.println("Exiting system... Goodbye!");
                    running = false;
                }
                default -> System.out.println("Invalid choice. Try again.");
            }
        }
    }

    private static void createPhoneBook() {
        System.out.print("Enter owner name for new PhoneBook: ");
        String owner = input.nextLine();

        try {
            phonebooks.addPhoneBook(owner);
            System.out.println("PhoneBook for '" + owner + "' created successfully!");
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void openPhoneBook() {
        System.out.print("Enter owner name of PhoneBook to open: ");
        String owner = input.nextLine();

        PhoneBook selected = phonebooks.findPhoneBookByName(owner);
        if (selected == null) {
            System.out.println("PhoneBook not found!");
            return;
        }

        System.out.println("Opened PhoneBook of " + owner);
        boolean inPhoneBook = true;

        while (inPhoneBook) {
            System.out.println("\n====== " + owner.toUpperCase() + "'s PHONEBOOK ======");
            System.out.println("1. Add Contact");
            System.out.println("2. View All Contacts");
            System.out.println("3. Find Contact by Full Name");
            System.out.println("4. Find Profile by Phone Number");
            System.out.println("5. Delete Contact");
            System.out.println("6. Back to Main Menu");
            System.out.print("Choose an option: ");
            String choice = input.nextLine();

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
        if (phonebooks.getPhoneBookList().isEmpty()) {
            System.out.println("No phonebooks created yet.");
            return;
        }

        System.out.println("\nAll PhoneBooks:");
        for (PhoneBook phoneBook : phonebooks.getPhoneBookList()) {
            System.out.println("-> " + phoneBook.getOwnerName());
        }
    }

    private static void deletePhoneBook() {
        System.out.print("Enter owner name of PhoneBook to delete: ");
        String owner = input.nextLine();

        try {
            phonebooks.deletePhoneBook(owner);
            System.out.println("PhoneBook for '" + owner + "' deleted successfully!");
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void addContact(PhoneBook phoneBook) {
        System.out.print("Enter first name: ");
        String firstName = input.nextLine();
        System.out.print("Enter last name: ");
        String lastName = input.nextLine();
        System.out.print("Enter phone number: ");
        String phoneNumber = input.nextLine();

        try {
            phoneBook.addContact(firstName, lastName, phoneNumber);
            System.out.println("Contact added successfully!");
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void viewAllContacts(PhoneBook phoneBook) {
        System.out.println("\nAll Contacts:");
        if (phoneBook.getContactList().isEmpty()) {
            System.out.println("No contacts saved yet.");
            return;
        }
        for (Contact contact : phoneBook.getContactList()) {
            System.out.println("-> " + contact.getFullName() + " (" + contact.getPhoneNumber() + ")");
        }
    }

    private static void findContactByFullName(PhoneBook phoneBook) {
        System.out.print("Enter full name: ");
        String name = input.nextLine();
        try {
            String phone = phoneBook.findContactByFullName(name);
            System.out.println(name + "'s number: " + phone);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void findProfileByPhoneNumber(PhoneBook phoneBook) {
        System.out.print("Enter phone number: ");
        String number = input.nextLine();
        try {
            String name = phoneBook.findProfileByPhoneNumber(number);
            System.out.println("Owner of " + number + ": " + name);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void deleteContact(PhoneBook phoneBook) {
        System.out.print("Enter full name of contact to delete: ");
        String name = input.nextLine();
        try {
            phoneBook.deleteContact(name);
            System.out.println("Contact deleted successfully!");
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}

