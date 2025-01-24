public interface Authentication {

    public boolean login(String username, String password);

    public void logout();

    public boolean resetPassword(String username, String oldPassword, String newPassword);
}
