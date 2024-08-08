package juaracoding.oop;

public class User {
    private String username;
    private String password;
    private String currentPassword;
    private String newPassword;
    private String confirmPassword;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCurrentPassword() {
        return currentPassword;
    }

    public void setCurrentPassword(String currentPassword) {
        this.currentPassword = currentPassword;
    }

    public String getNewPassword() {
        return newPassword;
    }

    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public void changePassword(String currentPassword, String newPassword, String confirmPassword) {
        if (this.password.equals(currentPassword)) {
            if (newPassword.equals(confirmPassword)) {
                this.password = newPassword;
                System.out.println("Password successfully changed.");
            } else {
                System.out.println("New password and confirm password do not match.");
            }
        } else {
            System.out.println("Current password is incorrect.");
        }
    }
}