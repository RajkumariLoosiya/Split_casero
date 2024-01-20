package split_casero;

public class Split_casero {
	
	public static void main (String[]args) {
		
		// hola caracola asd hola usa caracola
		
		
		String texto = " Hola la caracola cola hola ola ";
		
		String[] arrayString = miSplit(texto);
		
//		for(String i: arrayString) {
//			System.out.println(i);
//		}
		
		String subcadena = "ola";
		
		System.out.println("En la palabra '" + texto + "' hay " + contarSubcadenas(arrayString, subcadena)
			
							+ " ocurrencias de la subcadena '" + subcadena + "'");
		
		
	}
	
	
	
	public static String[] miSplit(String palabraEntrada) {
		
		char delimitador = ' ';
		int inicioPalabra = 0; 
		palabraEntrada = palabraEntrada.trim(); 
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
		
		palabraEntrada = palabraEntrada.trim().replaceAll("\\s++", " "); 
		
		for(int a = 0; a < palabraEntrada.length(); a++) {
			
			if(palabraEntrada.charAt(a) == delimitador) {
				cantidadPalabras++; 
			}
			
		}
		
		return cantidadPalabras + 1;
		
	}
	
	public static int contarSubcadenas(String[] arrayEntrada, String subcadena) {
		
		int contador = 0; 
		
		for(String i: arrayEntrada) {
			
			if(i.contains(subcadena)) {
				contador ++; 
			}
			
			
		}
		
		return contador; 
		
	}
	

}
