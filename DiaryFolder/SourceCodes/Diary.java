import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Diary {
    private String username;
    private String password;
    private boolean isLocked = false;
    private List<Entry> entries;

    public Diary(String username, String password) {
        setUsername(username);
        setPassword(password);
        entries = new ArrayList<>();
    }

    public void setUsername(String username) {
        if(username.equals(" "))throw new InvalidUsername("User-name cannot be empty");
        this.username = username.trim();
    }
    public String getUsername() {
        return username;
    }

    public void setPassword(String password) {
        if(password.length() < 6) throw new InvalidPassword("Password too short");
        if(password.equals(" ")) throw new InvalidPassword("Password cant be empty");
        this.password = password.trim();
    }
    public String getPassword() {
        return password;
    }

    public void IsLocked() {
        this.isLocked = true;
    }
    public boolean getIsLocked() {
        return isLocked;
    }

    public void unlockDiary(String Username, String Password) {
        if(isLocked && Username.equals(this.username) && Password.equals(this.password)) isLocked = false;
        else throw new DiaryException("Invalid Credentials");
    }

    public void lockDiary() {
        isLocked = true;
    }

    public int createEntry(String title, String body){
        validateCreateEntry(title, body);
        int id = generateId();
        Entry newEntry = new Entry(id, title, body);
        entries.add(newEntry);
        return id;
    }

    public boolean deleteEntry(int id) {
        for (int count = 0; count < entries.size(); count++) {
            if (entries.get(count).getId() == id) {
                entries.remove(count);
                return true;
            }
        }
        return false;
    }


    public Entry findEntryById(int id){
       for(Entry entry : entries){
           if(entry.getId() == id)return entry;
       }
       return null;
    }

    public boolean updateEntry(int Id, String newTitle, String newBody){
        for(Entry entry: entries){
            if(entry.getId() == Id){
                entry.setTitle(newTitle);
                entry.setBody(newBody);
                return true;
            }
        }
        return false;
    }

    public List<Entry> getEntries() {
        return entries;
    }


    public int entryCount() {
        return entries.size();
    }

    private int generateId(){
        Random random = new Random();
        return 10000 + random.nextInt(90000);
    }

    private void validateCreateEntry(String title, String body){
        if(title == null)throw new NullPointerException();
        if(body == null)throw new NullPointerException();
        if(title.trim().isEmpty())throw new DiaryException("Title cannot be empty");
        if(body.trim().isEmpty())throw new DiaryException("Body cannot be empty");
    }
//    private void validatePassword(String password){
//        if(!password.equals(this.password))throw new InvalidPassword("Passwords don't match");
//    }

}
