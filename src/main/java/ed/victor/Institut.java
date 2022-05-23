package ed.victor;

public class Institut {

	public static void main(String[] args) {
		
		Alumne p = new Alumne();
		
		p.nombre = "Victor";
		p.cognoms = "Perez";
		p.cicleFormatiu = "1º DAW";
		p.any = 2021;
		
		System.out.println(p.toString());

	}

}
