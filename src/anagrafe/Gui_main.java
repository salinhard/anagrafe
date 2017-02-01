package anagrafe;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;

public class Gui_main extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JButton btnInserisciNuovoCittadino;
	private JButton btnMostraCittadino;
	private JLabel lblAnagrafe;

	
	
public Gui_main() {

		
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
		getContentPane().setLayout(null);

		
	}
	
	
	private void init_display() {
		
		
		btnInserisciNuovoCittadino = new JButton("Inserisci nuovo cittadino");
		btnInserisciNuovoCittadino.setBounds(20, 67, 200, 117);
		getContentPane().add(btnInserisciNuovoCittadino);
		
		btnMostraCittadino = new JButton("Mostra cittadino");
		btnMostraCittadino.setBounds(232, 67, 200, 117);
		getContentPane().add(btnMostraCittadino);
		
		lblAnagrafe = new JLabel("ANAGRAFE");
		lblAnagrafe.setBounds(144, 6, 162, 49);
		getContentPane().add(lblAnagrafe);
		
		
	
	}
	
	

}
