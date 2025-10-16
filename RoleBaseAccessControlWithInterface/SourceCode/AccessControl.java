public class AccessControl {
    public static void performAdminAction(Person user, String action){
        switch (action.toLowerCase()){
            case "view system":
                if(user instanceof AdminRole){
                    ((AdminRole) user).viewSystemStatus();
                }else {
                    deny();
                }
                break;

            case "add sub admin":
                if(user instanceof AdminRole){
                    ((AdminRole) user).addSubAdmin();
                }else{
                    deny();
                }

            case  "remove sub admin":
                if(user instanceof AdminRole){
                    ((AdminRole) user).removeSubAdmin();
                }else {
                    deny();
                }

            case "remove user":
                if(user instanceof AdminRole){
                    ((AdminRole) user).removeUser();
                }else{
                    deny();
                }
        }
    }

    public static void performSubAdminAction(Person user, String action){
        switch (action.toLowerCase()){
            case "add user":
                if(user instanceof SubAdminRole){
                    ((SubAdminRole) user).addUser();
                }else {
                    deny();
                }

            case "monitor user":
                if(user instanceof SubAdminRole){
                    ((SubAdminRole) user).monitorUser();
                }else {
                    deny();
                }

            case "report issues":
                if(user instanceof SubAdminRole){
                    ((SubAdminRole) user).reportIssues();
                }else {
                    deny();
                }
        }
    }

    public static void performUserAction(Person user, String action){
        switch (action.toLowerCase()){
            case "view profile":
                if(user instanceof UserRole randomUser){
                    randomUser.viewProfile();
                }else{
                    deny();
                }

            case "report other users":
                if(user instanceof UserRole randomUser){
                    randomUser.reportOtherUser();
                }else{
                    deny();
                }
        }
    }
    public static void deny(){
        throw new UnsupportedOperationException("Access denied..Only Authorized personnel is allowed");
    }
}
