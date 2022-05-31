package ed.ruben;

public class Alumne {
	public String nom;
	public String cognoms;
	public int any;
	public String cicleFormatiu;
	
	@Override
	public String toString() {
		return "n = " + nom + System.lineSeparator() +
				"c = " + cognoms + System.lineSeparator() +
				"a = " + any + System.lineSeparator() +
				"cl = " + cicleFormatiu;
	}
}
