package anagrafe;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import java.awt.Font;
import javax.swing.JButton;

public class Grafica extends JFrame  {

	private static final long serialVersionUID = 1L;
	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	
	private JLabel lblNewLabel;
	private JLabel lblNome;
	private JLabel lblCognome;
	private JLabel lblDataDiNascita;
	private JLabel lblNatoA;
	
	private JButton btnNewButton;
	
	
	public Grafica() {
		
		inizializza();
	}
	
	
	private void inizializza(){
		
		init_frame();
		init_display();
		
	}
	
	// costruisce la finestra dove è contenuta la calcolatrice
	private void init_frame() {
		
		setResizable(false);
		setBounds(100, 100, 450, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);

		
	}
	
	
	private void init_display() {
		
		textField = new JTextField();
		textField.setBounds(155, 64, 249, 26);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		lblNewLabel = new JLabel("Nuovo cittadino");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.BOLD, 25));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel.setBounds(61, 6, 343, 46);
		getContentPane().add(lblNewLabel);
		
		lblNome = new JLabel("Nome");
		lblNome.setBounds(82, 69, 61, 16);
		getContentPane().add(lblNome);
		
		lblCognome = new JLabel("Cognome");
		lblCognome.setBounds(82, 116, 61, 16);
		getContentPane().add(lblCognome);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(155, 111, 249, 26);
		getContentPane().add(textField_1);
		
		lblDataDiNascita = new JLabel("Nato il");
		lblDataDiNascita.setBounds(82, 158, 61, 16);
		getContentPane().add(lblDataDiNascita);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(155, 153, 249, 26);
		getContentPane().add(textField_2);
		
		lblNatoA = new JLabel("Nato a");
		lblNatoA.setBounds(82, 201, 61, 16);
		getContentPane().add(lblNatoA);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(155, 196, 249, 26);
		getContentPane().add(textField_3);
		
		btnNewButton = new JButton("INSERISCI");
		btnNewButton.setBounds(155, 234, 147, 38);
		getContentPane().add(btnNewButton);
		
		

		
	}
	
	
}
