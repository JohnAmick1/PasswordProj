
import java.util.Scanner;

public class PasswordProjClient {

    public boolean checkForPassword(String password){

        return lengthConditions(password) && digitConditions(password) && upperCaseConditions(password) &&
                spacesConditions(password);

    }

    //method to make sure that there are no spaces in password
    public boolean spacesConditions(String password){
        String scondition = ".*\\s.*";
        if (password.matches(scondition)){
            System.out.println("\nPlease ensure your password has no spaces and review the other requirements: ");
            System.out.println();
            return false;
        } else {
            return true;
        }
    }
    //method to check for the password length
    public boolean lengthConditions(String password){

        if (password.length() > 11){
            return true;
        } else {
            System.out.println("\nPlease ensure your password has at least 12 characters and review the other requirements: ");
            System.out.println();
            return false;
        }
    }
    //method to check if there is at least one upper case letter
    public boolean upperCaseConditions(String password){

        String uccondition = ".*\\p{Upper}.*";
        if(password.matches(uccondition)){
            return true;
        } else {
            System.out.println("\nPlease ensure your password has at least one uppercase letter and review the other requirements: ");
            System.out.println();
            return false;
        }
    }

    //method to check if there is a digit
    public boolean digitConditions(String password){

        String dcondition = ".*\\d.*";

        if(password.matches(dcondition)){
            return true;
        } else {
            System.out.println("\nPlease ensure your password has at least 1 digit and review the other requirements: ");
            System.out.println();
            return false;
        }
    }

}
