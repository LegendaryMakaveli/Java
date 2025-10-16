public class Admin extends Person implements AdminRole{
    public Admin(String username, String email){
        super(username, email, Roles.ADMIN);

    }
    @Override
    public String addSubAdmin(){
        return "Admin" + username + "added a sub-admin.";
    }
    @Override
    public String removeSubAdmin(){
        return  "Admin" + username + "removed a sub-admin.";
    }
    @Override
    public String removeUser(){
        return "Admin" + username + "removed user.";
    }
    @Override
    public String viewSystemStatus(){
        return "Admin" + username + "view system status.";
    }

    @Override
    public String login(){
        return "Admin" + username + "logged in.";
    }
    @Override
    public String logout(){
        return "Admin" + username + "logged out.";
    }
}
