package week07;

import java.io.*;

public class MyFileReader {
    public static void main(String[] args) { 
        // try this for an argument:
        // src/week07/MyFileReader.java
        
        for (String arg : args) { // read all the arguments (files)
            try {
                LineNumberReader fd = new LineNumberReader(new FileReader(arg));
                String line;
                while ((line = fd.readLine()) != null) {
                    System.out.println(line);
                }
                fd.close();
            } catch (FileNotFoundException e) {
                System.err.println("file: " + arg + "\nNot found");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
