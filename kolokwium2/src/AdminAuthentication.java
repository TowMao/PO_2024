public class AdminAuthentication implements Authentication {

    String username;
    String adminPassword;
    boolean isLoggedIn;

    public AdminAuthentication(String username, String adminPassword, boolean isLoggedIn) {
        this.username = username;
        this.adminPassword = adminPassword;
        this.isLoggedIn = false;
    }

    @Override
    public boolean login(String username, String password) {
        if(!this.username.equals(username) && !this.adminPassword.equals(password)) {
            return false;
        }
        return true;
    }

    @Override
    public void logout() {

    }

    @Override
    public boolean resetPassword(String username, String oldPassword, String newPassword) {
        if(!this.username.equals(username) && !this.adminPassword.equals(oldPassword)) {
            return false;
        }
        this.adminPassword = newPassword;
        return true;
    }
}
