public class User extends Person implements UserRole{
    public User(String username, String email){
        super(username, email, Roles.USER);
    }

    @Override
    public String viewProfile(){
        return "User" + username + " " + "viewing profile";
    }
    public String reportOtherUser(){
        return  "I am reporting" + username + " " + "for social abuse";
    }
    @Override
    public String login(){
        return "User" + username + " " + "logged in";
    }
    @Override
    public String logout(){
        return "User" + username + " " + "logged out";
    }
}
