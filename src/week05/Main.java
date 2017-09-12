package week05;

import java.util.*;

public class Main {
	// Menagerie testing
	public static void main(String [] args) {
		BioOrg [] zoo = new BioOrg[3];

		zoo[0] = new BioOrg("Animalia", "Bos", "Bos Taurus", "Cow");
		zoo[1] = new BioOrg("Animalia", "Alces", "Alces Alces", "Moose");
		zoo[2] = new BioOrg("Animalia", "Aptenodytes", "Aptenodytes Forsteri", "Emperor Penguin");
	
		for (BioOrg b : zoo)
			System.out.println("\n" + b);
	}
}
