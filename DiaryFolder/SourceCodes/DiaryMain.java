import java.util.Scanner;

public class DiaryMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Diaries diaries = new Diaries();
        boolean running = true;

        while (running) {
            System.out.println("\n========= MAIN MENU =========");
            System.out.println("1. Create New Diary");
            System.out.println("2. Open Existing Diary");
            System.out.println("3. Delete Diary");
            System.out.println("4. Exit");
            System.out.println("=============================");
            System.out.print("Choose an option: ");

            int choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter username: ");
                    String username = input.nextLine();
                    System.out.print("Enter password: ");
                    String password = input.nextLine();
                    try {
                        diaries.addDiary(username, password);
                        System.out.println("Diary created successfully for " + username + "!");
                    } catch (DiaryException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                }

                case 2 -> {
                    System.out.print("Enter your username: ");
                    String username = input.nextLine();
                    try {
                        Diary diary = diaries.findByUserName(username);
                        useDiary(diary, input);
                    } catch (DiaryException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                }

                case 3 -> {
                    System.out.print("Enter username: ");
                    String username = input.nextLine();
                    System.out.print("Enter password: ");
                    String password = input.nextLine();
                    diaries.deleteDiary(username, password);
                    System.out.println("Diary deleted (if it existed).");
                }

                case 4 -> {
                    running = false;
                    System.out.println("Goodbye!");
                }

                default -> System.out.println("Invalid option, try again.");
            }
        }
    }

    private static void useDiary(Diary diary, Scanner input) {
        boolean usingDiary = true;

        while (usingDiary) {
            System.out.println("\n========= DIARY MENU FOR " + diary.getUsername().toUpperCase() + " =========");
            System.out.println("1. Unlock Diary");
            System.out.println("2. Lock Diary");
            System.out.println("3. Create Entry");
            System.out.println("4. View All Entries");
            System.out.println("5. Find Entry by ID");
            System.out.println("6. Update Entry");
            System.out.println("7. Delete Entry");
            System.out.println("8. Show Entry Count");
            System.out.println("9. Back to Main Menu");
            System.out.println("===========================================");
            System.out.print("Choose an option: ");

            int choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter username: ");
                    String user = input.nextLine();
                    System.out.print("Enter password: ");
                    String pass = input.nextLine();
                    try {
                        diary.unlockDiary(user, pass);
                        System.out.println("Diary unlocked successfully!");
                    } catch (DiaryException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                }

                case 2 -> {
                    diary.lockDiary();
                    System.out.println("Diary locked.");
                }

                case 3 -> {
                    if (diary.getIsLocked()) {
                        System.out.println("Diary is locked. Unlock it first.");
                        break;
                    }
                    System.out.print("Enter entry title: ");
                    String title = input.nextLine();
                    System.out.print("Enter entry body: ");
                    String body = input.nextLine();
                    int id = diary.createEntry(title, body);
                    System.out.println("Entry created with ID: " + id);
                }

                case 4 -> {
                    if (diary.getIsLocked()) {
                        System.out.println("Diary is locked. Unlock it first.");
                        break;
                    }
                    if (diary.entryCount() == 0) {
                        System.out.println("No entries yet.");
                    } else {
                        System.out.println("\nYour Entries:");
                        for (Entry entry : diary.getEntries()) {
                            System.out.println(entry);
                            System.out.println("------------------------");
                        }
                    }
                }

                case 5 -> {
                    if (diary.getIsLocked()) {
                        System.out.println("Diary is locked. Unlock it first.");
                        break;
                    }
                    System.out.print("Enter entry ID: ");
                    int id = input.nextInt();
                    input.nextLine();
                    Entry found = diary.findEntryById(id);
                    if (found != null) System.out.println(found);
                    else System.out.println("Entry not found.");
                }

                case 6 -> {
                    if (diary.getIsLocked()) {
                        System.out.println("Diary is locked. Unlock it first.");
                        break;
                    }
                    System.out.print("Enter entry ID to update: ");
                    int id = input.nextInt();
                    input.nextLine();
                    System.out.print("New title: ");
                    String title = input.nextLine();
                    System.out.print("New body: ");
                    String body = input.nextLine();
                    boolean updated = diary.updateEntry(id, title, body);
                    System.out.println(updated ? "Entry updated!" : "Entry not found.");
                }

                case 7 -> {
                    if (diary.getIsLocked()) {
                        System.out.println("Diary is locked. Unlock it first.");
                        break;
                    }
                    System.out.print("Enter entry ID to delete: ");
                    int id = input.nextInt();
                    input.nextLine();
                    boolean deleted = diary.deleteEntry(id);
                    System.out.println(deleted ? "Entry deleted!" : "Entry not found.");
                }

                case 8 -> System.out.println("Total entries: " + diary.entryCount());

                case 9 -> usingDiary = false;

                default -> System.out.println("Invalid option.");
            }
        }
    }
}
