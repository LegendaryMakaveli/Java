import java.util.ArrayList;
import java.util.List;

public class Diaries {
    private List<Diary> diaryList;

    public Diaries(){
        diaryList = new ArrayList<>();
    }

    public void addDiary(String username, String password) {
        for (Diary diary : diaryList) {
            if (diary.getUsername().equals(username)) {
                throw new DiaryException("Diary with username '" + username + "' already exists");
            }
        }
        Diary newDiary = new Diary(username, password);
        diaryList.add(newDiary);
    }


    public Diary findByUserName(String username) {
        for (Diary diary : diaryList) {
            if (diary.getUsername().equals(username))return diary;
        }
        throw new DiaryException("Diary with username '" + username + "' not found");
    }


    public void deleteDiary(String username, String password) {
        for (int count = 0; count < diaryList.size(); count++) {
            Diary diary = diaryList.get(count);
            if (username.equals(diary.getUsername()) && password.equals(diary.getPassword())) {
                diaryList.remove(count);
                return;
            }
        }
        throw new DiaryException("Diary not found or incorrect password");
    }

    public List<Diary> getAllDiaries() {
        return diaryList;
    }

}
