package anagrafe;

import java.awt.event.MouseAdapter;
import java.util.Scanner;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class Sportello {
	
	private static Scanner scanner;

	
	static Gui_inserisci gui = new Gui_inserisci();
	
	
	
	
	public static void main ( String[] args ) {
		
		DB db = new DB();
		Cittadino cittadino = new Cittadino();
		
		
		gui.getBtnNewButton().addMouseListener(new MouseAdapter() {	
			@Override
			public void mouseClicked(MouseEvent e) {
				
				System.out.println("Pcisu");
				cittadino.setNome(gui.getTextNome());
				cittadino.setCognome(gui.getTextCognome());
				cittadino.setNato_a(gui.getTextNatoA());
				cittadino.setNato_il(gui.getTextNatoIl());
				
				db.aggiungi_cittadino( cittadino );
		
			}
		});
		
		scanner = new Scanner(System.in);
		String comando = "x";
		
		while(true) {
			
			System.out.println("Premi i per inserire un nuovo cittadino");
			//System.out.println("Premi e per eliminare un cittadino");
			System.out.println("Premi l per leggere l'elenco dei cittadini");
			
			comando = scanner.next();
			
			System.out.println(comando);


			if( comando.equals("i") ) {
				
				System.out.println("jd");
				
				java.awt.EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							
							gui.setVisible(true);	
							
							
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
				
				
			} // fine if
			

		}

	} // fine main
		
		
		

	

}
