package split_casero;

public class Split_casero {
	
	public static void main (String[]args) {
		
		String texto = "Hola la caracola";
		
		String[] arrayString = miSplit(texto);
		
		for(String i: arrayString) {
			System.out.println(i);
		}
		
	}
	
	public static String[] miSplit(String palabraEntrada) {
		
		char delimitador = ' ';
		int inicioPalabra = 0; 
		int cantidadPalabras = contarPalabras(palabraEntrada); 
		
		
		String[] palabras = new String[cantidadPalabras];
		int indice = 0; 
		
		for(int b = 0; b < palabraEntrada.length(); b++) {
			
			if(palabraEntrada.charAt(b) == delimitador || b == palabraEntrada.length() - 1) {
				
				String palabra = palabraEntrada.substring(inicioPalabra, (b == palabraEntrada.length() - 1) ? b + 1 : b);
				
				palabras[indice++] = palabra;
				
				inicioPalabra = b + 1;
				
			}
			
		}
		
		return palabras; 
	}
	
	public static int contarPalabras(String palabraEntrada) {
		
		char delimitador = ' ';
		int cantidadPalabras = 0; 
		
		for(int a = 0; a < palabraEntrada.length(); a++) {
			
			if(palabraEntrada.charAt(a) == delimitador) {
				cantidadPalabras++; 
			}
			
		}
		
		return cantidadPalabras + 1 ;
		
	}
	

}
