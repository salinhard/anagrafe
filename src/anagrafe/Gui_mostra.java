package anagrafe;

import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.BorderLayout;

public class Gui_mostra extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JLabel titolo;
	private JButton btnCancellaTutti;
	private JList list;
	private DefaultListModel model;
	private JScrollPane pane;


	// GETTER E SETTER
	
	public JButton getBtnCancellaTutti() {
		return btnCancellaTutti;
	}


	public void setBtnCancellaTutti(JButton btnCancellaTutti) {
		this.btnCancellaTutti = btnCancellaTutti;
	}

	
	
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
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

		
	}
	
	
	private void init_display() {
		
		
		titolo= new JLabel("Mostra cittadini");
		titolo.setFont(new Font("Lucida Grande", Font.BOLD, 25));
		titolo.setBounds(61, 6, 343, 46);
		titolo.setHorizontalAlignment(SwingConstants.CENTER);
		getContentPane().add(titolo,  BorderLayout.NORTH);
		
		btnCancellaTutti = new JButton("Cancella tutti i cittadini");
		btnCancellaTutti.setBounds(120, 223, 252, 38);
		getContentPane().add(btnCancellaTutti,  BorderLayout.SOUTH);
		

		model = new DefaultListModel();
		
		list = new JList(model);
		
		pane = new JScrollPane(list);
		
		/*
		//JButton addButton = new JButton("Add Element");
		    //JButton removeButton = new JButton("Remove Element");
		    for (int i = 0; i < 15; i++)
		      model.addElement("Element " + i);
		*/
	    getContentPane().add(pane, BorderLayout.CENTER);
	   
		
	
	}
	
	
	public void aggiorna_select() {
		
		String[] lista;
		
		lista = DB.recupera_cittadini().toArray(new String[DB.recupera_cittadini().size()]);
		
		model.clear();
		
		for( int i = 0 ; i < lista.length ; i++ ) {
			
			model.addElement(lista[i]);

		}
		
			
	} // fine aggiorna select
	

} // fine classe
