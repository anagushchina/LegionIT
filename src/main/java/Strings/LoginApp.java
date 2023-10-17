package Strings;

public class LoginApp {

    String expectedUserName = "admin";
    String expectedPassword = "12345";

    public static void main(String[] args) {
        LoginApp LoginApp = new LoginApp();

        boolean success = LoginApp.verifyUser("admin",null);
        System.out.println("Login success: " + success);
    }

    public boolean verifyUser(String userName, String password){

        boolean success = false;
//        if(userName.isEmpty() || password.isEmpty()){
//        if(userName==null || password==null){
//            System.out.println("The username or password is null");
//        }
        if (userName.isBlank() || password.isBlank()) {
            System.out.println("The username or password is blank");
        }
        else if(userName.length()==0 || password.length()==0) {
            System.out.println("The username or password is empty");
        }
        else if (!userName.equalsIgnoreCase(expectedUserName) || !password.equalsIgnoreCase(expectedPassword)) {
            System.out.println("The username or password does not match expected values");
        }
         else {
            success = true;
        }

        return success;
    }

}
