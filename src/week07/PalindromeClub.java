package week07;
import java.util.*;
import java.io.*;
public class PalindromeClub {
    public static void main(String[] args) {
        try {
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(
                    new FileOutputStream("filename.txt"), "utf-8"));
            
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            while (!input.equals("exit")) {
                if (Palindrome.palindrome(input)) {
                    bw.write(input + "\n");
                }
                input = scanner.nextLine();
            }
            bw.close();
            scanner.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
