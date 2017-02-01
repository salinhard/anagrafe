package anagrafe;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;

public class prova {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					prova window = new prova();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public prova() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnInserisciNuovoCittadino = new JButton("Inserisci nuovo cittadino");
		btnInserisciNuovoCittadino.setBounds(20, 67, 200, 117);
		frame.getContentPane().add(btnInserisciNuovoCittadino);
		
		JButton btnMostraCittadino = new JButton("Mostra cittadino");
		btnMostraCittadino.setBounds(232, 67, 200, 117);
		frame.getContentPane().add(btnMostraCittadino);
		
		JLabel lblAnagrafe = new JLabel("ANAGRAFE");
		lblAnagrafe.setBounds(144, 6, 162, 49);
		frame.getContentPane().add(lblAnagrafe);
	}

}
