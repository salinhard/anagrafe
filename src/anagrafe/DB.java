package anagrafe;

import java.io.FileNotFoundException;
import java.io.PrintWriter;


public class DB {
	
	private static final String nome_file = "db.txt";
	
	private PrintWriter output;
	
	
	// COSTRUTTORE
	public DB() {
		
		try {
			
			output = new PrintWriter(nome_file);
			
		} catch (FileNotFoundException e) {
			
			System.out.print("Errore apertura file " + nome_file);
			System.exit(0);
		}
		
		
	} // fine costruttore
	
	
	public void aggiungi_cittadino() {
		
		
		
	}
	
	
	
	
	//output = new PrintWriter(nome_file);

	//output.println("riga n1 ");
	//output.close();
	
}
