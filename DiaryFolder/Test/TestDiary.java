import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestDiary {
        @Test
            public void TestThatCreateANewDiary(){
            Diary myDiary = new Diary("Makaveli", "IKka1990");
            myDiary.setUsername("Maka");
            myDiary.setPassword("Ikkaveli");


            assertEquals("Maka", myDiary.getUsername());
            assertEquals("Ikkaveli", myDiary.getPassword());
            assertFalse(myDiary.getIsLocked());
        }

        @Test
        public void createEntry_success() {
            Diary diary = new Diary("alice", "pass1234");
            int id = diary.createEntry("title", "body");
            assertEquals(1, diary.entryCount());
            Entry found = diary.findEntryById(id);
            assertNotNull(found);
            assertEquals("title", found.getTitle());
        }

        @Test
        public void createEntry_null_throws() {
            Diary diary = new Diary("alice", "pass1234");
            assertThrows(NullPointerException.class, () -> diary.createEntry(null, null));
        }

        @Test
        public void deleteEntry_success() {
            Diary diary = new Diary("alice", "pass1234");
            int id = diary.createEntry("Makaveli", "b");

            assertTrue(diary.deleteEntry(id));
            assertEquals(0, diary.entryCount());
        }

        @Test
        public void deleteEntry_notFound_returnsFalse() {
            Diary diary = new Diary("alice", "pass1234");
            assertFalse(diary.deleteEntry(999));
        }

        @Test
        public void updateEntry_success() {
            Diary diary = new Diary("alice", "pass1234");
            int id = diary.createEntry("How to be rich", "Okay nah");
            boolean updated = diary.updateEntry(id, "new", "newbody");
            assertTrue(updated);
            Entry entry = diary.findEntryById(id);
            assertNotNull(entry);
            assertEquals("new", entry.getTitle());
            assertEquals("newbody", entry.getBody());
        }

        @Test
        public void unlock_with_valid_credentials_unlocks() {
            Diary diary = new Diary("alice", "pass1234");
            diary.lockDiary();
            assertTrue(diary.getIsLocked());
            diary.unlockDiary("alice", "pass1234");
            assertFalse(diary.getIsLocked());
        }

        @Test
        public void unlock_when_not_locked_throws() {
            Diary diary = new Diary("alice", "pass1234");
            DiaryException ex = assertThrows(DiaryException.class, () -> diary.unlockDiary("alice", "pass1234"));
            assertFalse(ex.getMessage().toLowerCase().contains("not locked"));
        }

        @Test
        public void unlock_with_invalid_credentials_throws() {
            Diary diary = new Diary("alice", "pass1234");
            diary.lockDiary();
            assertThrows(DiaryException.class, () -> diary.unlockDiary("alice", "wrongpass"));
        }

        @Test
        public void constructor_invalid_username_throws() {
            assertThrows(InvalidUsername.class, () -> new Diary(" ", "abcd"));
        }

        @Test
        public void constructor_invalid_password_throws() {
            assertThrows(InvalidPassword.class, () -> new Diary("bob", " "));
            assertThrows(InvalidPassword.class, () -> new Diary("bob", "123"));
        }
}
