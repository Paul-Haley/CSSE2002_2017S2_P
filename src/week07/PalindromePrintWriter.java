package week07;
import java.util.*;
import java.io.*;

public class PalindromePrintWriter {
    public static final String LINE_SEPERATOR = System.lineSeparator();
    public static void main(String[] args) {
        PrintWriter pw = null;
        try {
            pw = new PrintWriter("filename.txt"); // creates file if it does not exist
        } catch (FileNotFoundException e) {
            System.out.println("file not found, closing");
            e.printStackTrace();
            System.exit(1);
        }

        Scanner scanner = new Scanner(System.in);
        String input; 
        
        do {  // guaranteed to run once, then will do while condition at end
            input = scanner.nextLine(); // wait for next stdin (user input) followed by enter
            if (Palindrome.palindrome(input)) { // test if palindrome
                pw.write(input + LINE_SEPERATOR); // write to file
                System.out.println(input); // print to stdout (console)
            }
            
        } while (!input.equals("exit")); // test if exit keyword is given
        // close everything
        pw.close();
        scanner.close();
    }

}
