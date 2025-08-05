public class User {
    private String name;
    private String email;
    private String password;
    private String active;
    private String role;

    public User(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.active = "true"; // default active status
        this.role = UserRole.USER.name(); // default role
    }
    public User(String name, String email, String password, String active, String role) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.active = active;
        this.role = role;
    }

    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public String getPassword() {
        return password;
    }
    public String getActive() {
        return active;
    }
    public String getRole() {
        return role;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setPassword(String password) {
        this.password = password;
    }
}
