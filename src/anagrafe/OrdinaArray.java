package anagrafe;

public class OrdinaArray {
	
	//-------------------------------------------
	// ORDINA ARRAY DI INTERI IN ORDINE CRESCENTE
	//-------------------------------------------
	
	public static void selectionSort( int[] unArray) {
		
		for(int i = 0; i < unArray.length-1; i++) {
			
			int indiceDelSuccessivoPiuPiccolo = getIndiceDelPiuPiccolo( i , unArray );
			scambio(i , indiceDelSuccessivoPiuPiccolo, unArray);
		}
	}
	
	public static int getIndiceDelPiuPiccolo( int indiceInizio, int[] a) {
		
		int minimo = a[indiceInizio];
		int indiceDelMinimo = indiceInizio;
		
		for( int indice = indiceInizio + 1; indice < a.length; indice++) {
			if(a[indice] < minimo) {
				minimo = a[indice];
				indiceDelMinimo = indice;
			}
		}
		return indiceDelMinimo;
		
	}
	
	
	public static void scambio(int i , int j, int[] a) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	
	
	//-------------------------------------------
	// ORDINA ARRAY DI STRINGHE IN ORDINE CRESCENTE
	//-------------------------------------------
	
	public static void selectionSort( String[] unArray) {
		
		for(int i = 0; i < unArray.length-1; i++) {
			
			int indiceDelSuccessivoPiuPiccolo = getIndiceDelPiuPiccolo( i , unArray );
			scambio(i , indiceDelSuccessivoPiuPiccolo, unArray);
		}
	}
	
	public static int getIndiceDelPiuPiccolo( int indiceInizio, String[] a) {
		
		String minimo = a[indiceInizio];
		int indiceDelMinimo = indiceInizio;
		
		for( int indice = indiceInizio + 1; indice < a.length; indice++) {
			if(a[indice].compareTo(minimo) < 0) {
				minimo = a[indice];
				indiceDelMinimo = indice;
			}
		}
		return indiceDelMinimo;
		
	}
	
	
	public static void scambio(int i , int j, String[] a) {
		String temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}


}
