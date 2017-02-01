package anagrafe;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;


public class DB {
	
	private static final String nome_file = "db.txt";
	
	private PrintWriter output;
	
	
	// COSTRUTTORE
	public DB() {
		
	
		
		
	} // fine costruttore
	
	
	public void aggiungi_cittadino( Cittadino cittadino ) {
		
	try {
			
			output = new PrintWriter( new FileOutputStream(nome_file , true ));
			
		} catch (FileNotFoundException e) {
			
			System.out.print("Errore apertura file " + nome_file);
			System.exit(0);
		}
		
		output.print(cittadino.getNome());
		output.print("#");
		output.print(cittadino.getCognome());
		output.print("#");
		output.print(cittadino.getNato_il());
		output.print("#");
		output.println(cittadino.getNato_a());
		
		output.close();
		
	}
	
	
	
	
	//output = new PrintWriter(nome_file);


	
}
