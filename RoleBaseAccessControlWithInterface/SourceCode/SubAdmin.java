public class SubAdmin extends Person implements SubAdminRole{
    public SubAdmin(String username, String email){
        super(username, email, Roles.SUB_ADMIN);
    }
    @Override
    public String addUser(){
        String username = super.username;
        return  username + "," + super.email + " " + "added by successfully";
    }
    @Override
    public String monitorUser(){
        String username = super.username;
        return  username + "," + "is being monitored";
    }
    @Override
    public String reportIssues(){
        String username = super.username;
        return username + "," + super.email + " " + "is being reporting";
    }
    @Override
    public String login(){
        return "Sub Admin" + username + "logged in.";
    }
    @Override
    public String logout(){
        return "Sub Admin" + username + "logged out.";
    }


}
