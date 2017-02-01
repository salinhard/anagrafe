package anagrafe;

import java.awt.event.MouseAdapter;
import java.util.Scanner;
import java.awt.event.MouseEvent;


public class Sportello {
	
	private static Scanner scanner;

	
	public static void main ( String[] args ) {
		
		scanner = new Scanner(System.in);

	
		Cittadino cittadino = new Cittadino();
		Gui_inserisci gui_inserisci = new Gui_inserisci();
		Gui_mostra gui_mostra = new Gui_mostra();
		
		String comando = "x";
		
		
		while(true) {
			
			System.out.println("Premi i per inserire un nuovo cittadino");
			//System.out.println("Premi e per eliminare un cittadino");
			System.out.println("Premi m per mostrare l'elenco dei cittadini");
			
			// catturo la stringa inserita da tastiera
			comando = scanner.next();
			

			// SE PREMO IL TASTO i CREAO LA FINESTRA 'INSERISCI CITTADINO'
			if( comando.equals("i") ) {
				
				
				java.awt.EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							
							gui_inserisci.setVisible(true);	
							
							
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
				
				
			} // fine if
			
			// SE PREMO IL TASTO m CREAO LA FINESTRA 'MOSTRA CITTADINO'
			 if(  comando.equals("m") ) {
				 
					java.awt.EventQueue.invokeLater(new Runnable() {
						public void run() {
							try {
								
								gui_mostra.setVisible(true);	
								
								
							} catch (Exception e) {
								e.printStackTrace();
							}
						}
					});
			
		} // fine if
			 
			 
				// AL CLICK DEL TASTO INSERISCI
				gui_inserisci.getBtnNewButton().addMouseListener(new MouseAdapter() {	
					@Override
					public void mouseClicked(MouseEvent e) {
						
						// valorizzo le proprieta dell'oggetto cittadino
						cittadino.setNome(gui_inserisci.getTextNome());
						cittadino.setCognome(gui_inserisci.getTextCognome());
						cittadino.setNato_a(gui_inserisci.getTextNatoA());
						cittadino.setNato_il(gui_inserisci.getTextNatoIl());
						
						// passo l'oggetto cittadino al metodo statico della classe db
						DB.aggiungi_cittadino( cittadino );
				
					}
				});
				
DB.recupera_cittadini();
			 
		} // fine while

	} // fine main
		
		
		

	

} // fine classe
