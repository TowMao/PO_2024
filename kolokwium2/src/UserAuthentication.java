public class UserAuthentication implements Authentication {

    String username;
    String password;
    boolean isLoggedIn;

    public UserAuthentication(String username, String password) {
        this.username = username;
        this.password = password;
        this.isLoggedIn = false;
    }

    @Override
    public boolean login(String username, String password) {
        return false;
    }

    @Override
    public void logout() {

    }

    @Override
    public boolean resetPassword(String username, String oldPassword, String newPassword) {
        if(!this.username.equals(username) && !this.password.equals(oldPassword)) {
            return false;
        }
        this.password = newPassword;
        return true;
    }

}
