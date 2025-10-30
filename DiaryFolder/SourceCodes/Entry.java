import java.time.LocalDateTime;

public class Entry {
    private int id;
    private String title;
    private String body;
    private LocalDateTime dateCreated;

    public Entry(int id, String title, String body) {
        setId(id);
        setTitle(title);
        setBody(body);
    }

    public void setId(int id) {
        this.id = id;
    }
    public  int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Entry ID: " + id + "\nTitle: " + title + "\nBody: " + body;
    }

    public void setTitle(String newTitle) {
        if(newTitle.trim().isEmpty())throw new DiaryException("Title  cannot be empty");
        this.title = newTitle;
    }

    public void setBody(String newBody) {
        if(newBody.trim().isEmpty())throw new DiaryException("Title  cannot be empty");
        this.body = newBody;
    }

    public String getTitle() {
        return title;
    }

    public String getBody() {
        return body;
    }
}
