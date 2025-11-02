import java.util.ArrayList;
import java.util.List;

public class Phonebooks {
    private List<PhoneBook> phoneBookList;

    public Phonebooks() {
        phoneBookList = new ArrayList<>();
    }

    public void addPhoneBook(String ownerName) {
        validatePhoneBookName(ownerName);
        if (findPhoneBookByName(ownerName) != null) {
            throw new PhoneBookException("PhoneBook with name '" + ownerName + "' already exists!");
        }
        PhoneBook newPhoneBook = new PhoneBook();
        newPhoneBook.setOwnerName(ownerName);
        phoneBookList.add(newPhoneBook);
    }

    public void deletePhoneBook(String ownerName) {
        validatePhoneBookName(ownerName);
        PhoneBook phoneBookToDelete = findPhoneBookByName(ownerName);
        if (phoneBookToDelete == null) {
            throw new NotFoundException("PhoneBook with name '" + ownerName + "' not found!");
        }
        phoneBookList.remove(phoneBookToDelete);
    }

    public PhoneBook findPhoneBookByName(String ownerName) {
        for (PhoneBook phoneBook : phoneBookList) {
            if (phoneBook.getOwnerName().equalsIgnoreCase(ownerName)) {
                return phoneBook;
            }
        }
        return null;
    }

    public List<PhoneBook> getPhoneBookList() {
        return new ArrayList<>(phoneBookList);
    }


    private void validatePhoneBookName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new PhoneBookException("PhoneBook name cannot be empty!");
        }
    }
}
