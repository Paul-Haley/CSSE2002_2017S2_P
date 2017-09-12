package week05;

/**
 * Representation of a Biological organism in a biological taxonomy
 *
 * @author Dr Phil
 * @version (22/08/2017)
 */

public class BioOrg extends Species {
	protected String name;

	// No javadoc comment here, deliberately: wait until enum types covered.
	public BioOrg(String k, String g, String s, String n) {
		super(k, g, s);
		name = n;
	}

	public String getName() {
		return name;
	}

	public String toString() {
		return super.toString() + "\nName: " + name;
	}
}
