package utils;

public class Utils {

    public static boolean isExit(String input) {
        if(input.equals("q") || input.equals("Q")) {
            System.out.println("Goodbye");
            System.exit(0);
            return true;
        }
        return false;
    }
}
