package week05;

import java.io.Serializable;

/**
 * Top level class in a biological taxonomy
 *
 * @author Dr Phil
 * @version (22/08/2017)
 */

public class Kingdom  implements Serializable {
	protected String kingdom;

	// No javadoc comment here, deliberately: wait until enum types covered.
	public Kingdom(String k) {
		kingdom = k;
	}

	public String getKingdom() {
		return kingdom;
	}

	public String toString() {
		return "Kingdom: " + kingdom;
	}
}
