package ed.victor;

public class Alumne {
	
	
	public String nombre;
	public String cognoms;
	public int any;
	public String cicleFormatiu;
	
	@Override
	public String toString() {
		
		return  "nombre = " + nombre + System.lineSeparator() +
				"cognoms = " + cognoms + System.lineSeparator() +
				"any = " + any + System.lineSeparator() +
				"cicleFormatiu = " + cicleFormatiu;
				
		
	}

}
