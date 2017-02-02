package anagrafe;

public class CheckInput {
	
	
	
	
	public static boolean valida( Cittadino cittadino , Gui_inserisci gui) {
		
		boolean a = false;
		boolean b = false;
		boolean c = false;
		boolean d = false;
		
		boolean risultato = false;
		
		String nome = cittadino.getNome();
		String cognome = cittadino.getCognome();
		String natoIl = cittadino.getNato_il();
		String natoA = cittadino.getNato_a();
		
		
		// -----------------
		// MESSAGGI DI ERRORE
		// -----------------
		
		if( nome.equals("")) {	
			gui.setLblNomeAlert("Inserisci il nome");	
		} else {
			nome = nome.trim();
			nome = nome.toUpperCase();
			cittadino.setNome(nome);
			
			gui.setLblNomeAlert("");
			a = true;
			//System.out.println(nome);
		} 
		
		
		if( cognome.equals("")) {	
			gui.setLblCognomeAlert("Inserisci il cognome");	
		} else {
			cognome = cognome.trim();
			cognome = cognome.toUpperCase();
			cittadino.setCognome(cognome);
			
			gui.setLblCognomeAlert("");
			b = true;
		}
		
		if( natoIl.equals("")) {	
			gui.setLblNatoIlAlert("Inserisci la data di nascita");	
		} else {
			natoIl = natoIl.trim();
			natoIl = natoIl.toUpperCase();
			cittadino.setNato_il(natoIl);
			
			gui.setLblNatoIlAlert("");
			c = true;
		}
		
		if( natoA.equals("")) {	
			gui.setLblNatoAAlert("Inserisci il luogo di nascita");	
		} else {
			
			natoA = natoA.trim();
			natoA = natoA.toUpperCase();
			cittadino.setNato_a(natoA);
			
			gui.setLblNatoAAlert("");
			d = true;
		}
		
		
		// se nessuno dei campi e vuoto fa ritornare true
		if( a && b && c && d ) {
			risultato = true;
		}
		
		
		return risultato;
		
	}
	
	/*
	public static boolean isNumber(String[] string) {
		
		
		for( int i = 0 ; i < string.length ; i++) {
			System.out.println(string[i]);
		    try {
		        Long.parseLong(string[i]);
		    } catch (Exception e) {
		        isNumber(string);
		    }
			
		}
	
	    return false;
	}
	*/

}
