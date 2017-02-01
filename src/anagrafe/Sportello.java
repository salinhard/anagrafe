package anagrafe;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class Sportello {
	
	
	static Cittadino cittadino = new Cittadino();
	static Gui_main gui_main = new Gui_main();
	static Gui_inserisci gui_inserisci = new Gui_inserisci();
	static Gui_mostra gui_mostra = new Gui_mostra();

	
	public static void main ( String[] args ) {
	
		
			// viene creata e visualizzata la finestra principale
			java.awt.EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						
						gui_main.setVisible(true);	
						
						
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
			
			
	// ------------------------------------------------------		
	// ---------- EVENTI AL CLICK SUI BOTTONI ---------------
	// ------------------------------------------------------	
			
			
			// ------------ EVENTI DELLA FINESTRA MAIN GUI
			
			// click tasto inserisci cittadino
			gui_main.getBtnInserisciNuovoCittadino().addMouseListener(new MouseAdapter() {	
				@Override
				public void mouseClicked(MouseEvent e) {
					
					//gui_main.setVisible(false);
					crea_finestra_inserimento();
					
			
				}
			});
			
			
			// click tasto mostra cittadini
			gui_main.getBtnMostraCittadino().addMouseListener(new MouseAdapter() {	
				@Override
				public void mouseClicked(MouseEvent e) {
					
					//gui_main.setVisible(false);
					crea_finestra_mostrare();
					
			
				}
			});
			
		
			// ------------ EVENTI DELLA FINESTRA GUI_INSERISCI
			 
				// click tasto inserisci
				gui_inserisci.getBtnNewButton().addMouseListener(new MouseAdapter() {	
					@Override
					public void mouseClicked(MouseEvent e) {
						
						// valorizzo le proprieta dell'oggetto cittadino recuperandole dalla gui
						cittadino.setNome(gui_inserisci.getTextNome());
						cittadino.setCognome(gui_inserisci.getTextCognome());
						cittadino.setNato_a(gui_inserisci.getTextNatoA());
						cittadino.setNato_il(gui_inserisci.getTextNatoIl());
						
						gui_inserisci.resetta();
						gui_mostra.riempi_select(DB.recupera_cittadini());
						
						// passo l'oggetto cittadino al metodo statico della classe db
						DB.aggiungi_cittadino( cittadino.formatta_cittadino() );
				
					}
				});
				
				
				// ------------ EVENTI DELLA FINESTRA GUI_MOSTRA
				
				// click tasto cancella tutti i cittadini
				gui_mostra.getBtnCancellaTutti().addMouseListener(new MouseAdapter() {	
					@Override
					public void mouseClicked(MouseEvent e) {
						
						DB.cancella_cittadini();
						gui_mostra.aggiorna_select();
				
					}
				});
				
		
	

	} // fine main
	
	
	// ----------- METODI ----------
		
	// crea la finestra dovo si inseriscono i cittadini
	public static void crea_finestra_inserimento() {
		
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					gui_inserisci.setVisible(true);
					
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}	
	
	// crea la finestra dove vengono elencati i cittadini
	public static void crea_finestra_mostrare() {
			
			java.awt.EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						
						gui_mostra.setVisible(true);	
						gui_mostra.riempi_select(DB.recupera_cittadini());
						
						
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
			
		}	

	

} // fine classe
