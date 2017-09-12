package week07;

import java.io.*;
import java.util.Scanner;

public class LectureScanner { //example input /Users/paulhaley/coding/DNUI/CC/README.md
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter name of file: ");
        String filename = scan.next();

        try {
            Scanner fileScan = new Scanner(new FileInputStream(filename));
            fileScan.useDelimiter(System.lineSeparator());

            while (fileScan.hasNext()) {
                System.out.println(fileScan.next());
            }
            fileScan.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        scan.close();
    }
}

