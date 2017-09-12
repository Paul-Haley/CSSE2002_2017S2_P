package week05;

import java.io.Serializable;

/**
 * Representation of Genus in a biological taxonomy
 *
 * @author Dr Phil
 * @version (22/08/2017)
 */

public class Genus extends Kingdom implements Serializable {
	protected String genus;

	// No javadoc comment here, deliberately: wait until enum types covered.
	public Genus(String k, String g) {
		super(k);
		genus = g;
	}

	public String getGenus() {
		return genus;
	}

	public String toString() {
		return super.toString() + "\nGenus: " + genus;
	}
}
