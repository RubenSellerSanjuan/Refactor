package ed;

import ed.ruben.Alumne;

public class Institut {
	private static final int ANY = 2019;
	private static final String CICLE_FORMATIU = "1er DAM";
	private static final String COGNOMS_ALUMNE = "Seller";
	private static final String NOM_ALUMNE = "Rubén";

	public static void main(String[] args) {
		Alumne p = new Alumne();
		
		p.nom = NOM_ALUMNE;
		p.cognoms = COGNOMS_ALUMNE;
		p.cicleFormatiu = CICLE_FORMATIU;
		p.any = ANY;
		
		ImprimirDadesAlumne(p);
	}

	private static void ImprimirDadesAlumne(Alumne p) {
		System.out.println(p.toString());
	}
}
