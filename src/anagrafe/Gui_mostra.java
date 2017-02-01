package anagrafe;

import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import java.awt.BorderLayout;

public class Gui_mostra extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JLabel titolo;
	private JComboBox comboBox;
	
	private String[] lista;



	
	
public Gui_mostra() {

		
		inizializza();
	}
	
	
	private void inizializza(){
		
		init_frame();
		init_display();
		
	}
	
	
	private void init_frame() {
		
		setResizable(false);
		setBounds(100, 100, 450, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		
	}
	
	
	private void init_display() {
		
		
		titolo= new JLabel("Mostra cittadini");
		titolo.setFont(new Font("Lucida Grande", Font.BOLD, 25));
		titolo.setBounds(61, 6, 343, 46);
		titolo.setHorizontalAlignment(SwingConstants.CENTER);

		getContentPane().add(titolo,  BorderLayout.NORTH);
		
	
	}
	
	
	public void riempi_select( ArrayList<String> arrayLista ) {
		
		// trasformo l'array list in un array
		lista = arrayLista.toArray(new String[arrayLista.size()]);
	
		// riempio la jcombo con l'array
		comboBox = new JComboBox(lista);
		getContentPane().add(comboBox, BorderLayout.CENTER);
		
		
	}
	
	

}
