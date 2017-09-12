package week07;

import java.io.*;

import week05.Species;
import week06.Account;

public class Serialiser {

    public static void main(String[] args) {
        // making some objects to serialise
        String otherS = null, s = new String("I think we know how this will look when serialised");
        Account otherA = null, a = new Account(20); // account class from tutorials
        Species otherSpec = null, spec = new Species("felin", "nyan", "cat");

        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("serialised.txt"));
            oos.writeObject(s);
            //oos.writeChars("\n");
            oos.writeObject(a);
            //oos.writeChars("\n");
            oos.writeObject(spec);
            //oos.writeChars("\n");
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("serialised.txt"));
            otherS = (String) ois.readObject();
            otherA = (Account) ois.readObject();
            otherSpec = (Species) ois.readObject();
            ois.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(otherA);
        System.out.println(a);
        System.out.println("DO they all match?\n" + s.equals(otherS) + a.equals(otherA) + spec.equals(otherSpec));
    }

}
