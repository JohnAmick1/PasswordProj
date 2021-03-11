import java.util.Scanner;
public class PasswordProjMain{
    public static void main(String[] args) {

        Scanner inPut = new Scanner(System.in);

        PasswordProjClient checker = new PasswordProjClient();

        //user input
        System.out.print("Please enter a password: ");

        String password = inPut.nextLine();

        //checking
        if (checker.checkForPassword(password)){
            System.out.println("Password successfully created. ");
        }
        else {
            int check = 1;
            while (check == 1){
                //print out requirements when password doesn't work
                System.out.println("* At least 1 digit. ");

                System.out.println("* At least 12 characters. ");

                System.out.println("* No spaces. ");

                System.out.println("* At least 1 uppercase character. ");

                System.out.print("\nPlease re-enter a viable password: ");

                password = inPut.nextLine();
                if (checker.checkForPassword(password)){
                    check = 0;
                    System.out.println("Password successfully created. ");
                }
            }
        }
    }
}