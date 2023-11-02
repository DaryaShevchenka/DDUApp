package dduapp;

import utils.Utils;

import java.util.List;
import java.util.Scanner;

public class SignUp {

    private void printWelcomMessage() {
        System.out.println("     Welcome to DDU!");
        System.out.println();
    }
    private void signUp() {
        Admin.addAdmin(new Admin("Ivan", "Sidorov"));

        Admin.printAdmins();

        System.out.println();
        System.out.println("Enter 'q' for quit");
        System.out.println();

        Scanner in = new Scanner(System.in);

        System.out.print("Enter username: ");
        String input = in.nextLine();
        if(input.equals("q") || input.equals("Q")) {
            System.out.println("Goodbye");
            System.exit(0);
        }

        String username = input;

        System.out.print("Enter password: ");
        input = in.nextLine();
        if(input.equals("Q") || input.equals("q")) {
            System.out.println("Goodbye");
            System.exit(0);
        }
        String password = input;

       checkCredentials(username, password);
    }
    private void checkCredentials(String  username,String password) {
        List<Admin> adminsList = Admin.getAdmins();
        for (Admin admin: adminsList) {
            if(admin.getUserName().equals(username) && admin.getPassword().equals(password)) {
                System.out.println("Welcome, " + admin.getFirstName() + " " + admin.getLastName());
               Admin.runAdmin();
            } else {
                System.out.println("Sorry,we can't find you");
                System.out.println("Goodbay!");
                System.exit(0);
            }
        }
    }

    public void runDDUApp() {
        printWelcomMessage();
        signUp();
    }
}
