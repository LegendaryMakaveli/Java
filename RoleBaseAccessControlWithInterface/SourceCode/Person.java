public abstract class Person {
    protected String username;
    protected String email;
    protected final Roles role;

    public Person(String username, String email, Roles role) {
        this.username = username;
        this.email = email;
        this.role = role;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    public String getUsername() {
        return username;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail() {
        return email;
    }
    public Roles getRole() {
        return role;
    }
    public String login(){
        return username + "(" + role + ") logged in.";
    }

    public String logout(){
        return username + "(" + role + ") logged out.";
    }
}
