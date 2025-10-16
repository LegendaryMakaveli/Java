public class SystemMain {
    public static void main(String[] args) {
      Admin admin = new Admin("Makaveli", "Makaveli@gmail.com");
      SubAdmin subAdmin = new SubAdmin("Ikkaveli", "Ikkaveli@gmail.com");
      User user = new User("BabaIkka", "BabaIkka@gmail.com");

      System.out.print(admin.login());
      System.out.print(subAdmin.login());
      System.out.print(user.login());

      //ADMIN ACTIONS
        AccessControl.performAdminAction(admin, "view system");
        AccessControl.performAdminAction(admin, "add sub admin");
        AccessControl.performAdminAction(admin, "remove sub admin");
        AccessControl.performAdminAction(admin, "remove user");
        AccessControl.performAdminAction(admin, "add user");

      //SUB ADMIN ACTIONS
        AccessControl.performSubAdminAction(subAdmin, "add user");
        AccessControl.performSubAdminAction(subAdmin, "monitor user");
        AccessControl.performSubAdminAction(subAdmin, "report issues");
        AccessControl.performSubAdminAction(subAdmin, "view system");

      // USER ACTIONS
        AccessControl.performUserAction(user, "view profile");
        AccessControl.performUserAction(user, "report other user");
        AccessControl.performUserAction(user, "add sub admin");
    }
}
