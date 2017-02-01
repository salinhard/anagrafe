package anagrafe;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;


public class DB {
	
	private static final String nome_file = "db.txt";
	
	private static PrintWriter output;
	private static Scanner input;
	
	
	// COSTRUTTORE
	public DB() {
		
	
		
		
	} // fine costruttore
	
	
	public static void aggiungi_cittadino( Cittadino cittadino ) {
		
	try {
			
			output = new PrintWriter( new FileOutputStream(nome_file , true ));
			
		} catch (FileNotFoundException e) {
			
			System.out.print("Errore apertura file " + nome_file);
			System.exit(0);
		}
		
		output.print(cittadino.getNome());
		output.print(" ");
		output.print(cittadino.getCognome());
		output.print(" ");
		output.print(cittadino.getNato_il());
		output.print(" ");
		output.println(cittadino.getNato_a());
		
		output.close();
		
	}
	
	
	
	public static void recupera_cittadini() {
		
		try {
			
			input = new Scanner( new File(nome_file) );
			
		} catch (FileNotFoundException e) {
			
			System.out.print("Errore apertura file " + nome_file);
			System.exit(0);
			
		}
		
		while (input.hasNextLine()) {
			String riga = input.nextLine();
			System.out.println(riga);
		}
		
	}
	
	
	


	
}
