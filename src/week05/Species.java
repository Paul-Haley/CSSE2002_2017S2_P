package week05;

import java.io.Serializable;

/**
 * Representation of Species in a biological taxonomy
 *
 * @author Dr Phil
 * @version (22/08/2017)
 */

public class Species extends Genus implements Serializable {
	protected String species;

	// No javadoc comment here, deliberately: wait until enum types covered.
	public Species(String k, String g, String s) {
		super(k, g);
		species = s;
	}

	public String getSpecies() {
		return species;
	}

	public String toString() {
		return super.toString() + "\nSpecies: " + species;
	}
}
