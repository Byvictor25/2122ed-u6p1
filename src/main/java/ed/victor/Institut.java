package ed.victor;

public class Institut {

	private static final int ANY = 2021;
	private static final String CICLE_FORMATIU = "1º DAW";
	private static final String COGNOMS_ALUMNE = "Perez";
	private static final String NOM_ALUMNE = "Victor";

	public static void main(String[] args) {
		
		Alumne p = new Alumne();
		
		p.nombre = NOM_ALUMNE;
		p.cognoms = COGNOMS_ALUMNE;
		p.cicleFormatiu = CICLE_FORMATIU;
		p.any = ANY;
		
		System.out.println(p.toString());

	}

}
