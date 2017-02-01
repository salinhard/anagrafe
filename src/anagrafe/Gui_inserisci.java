package anagrafe;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import java.awt.Font;
import javax.swing.JButton;

public class Gui_inserisci extends JFrame  {
	
	

	private static final long serialVersionUID = 1L;
	private JTextField textNome;
	private JTextField textCognome;
	private JTextField textNatoIl;
	private JTextField textNatoA;
	
	private JLabel lblNewLabel;
	private JLabel lblNome;
	private JLabel lblCognome;
	private JLabel lblDataDiNascita;
	private JLabel lblNatoA;
	
	private JButton btnNewButton;
	
	
	// GETTER E SETTER
	public String getTextNome() {
		return textNome.getText();
	}
	public void setTextNome(String textField) {
		this.textNome.setText(textField);
	}
	public String getTextCognome() {
		return textCognome.getText();
	}
	public void setTextCognome(String textField_1) {
		this.textCognome.setText(textField_1);
	}
	public String getTextNatoIl() {
		return textNatoIl.getText();
	}
	public void setTextNatoIl(String textField_2) {
		this.textNatoIl.setText(textField_2);
	}
	public String getTextNatoA() {
		return textNatoA.getText();
	}
	public void setTextNatoA(String textField_3) {
		this.textNatoA.setText(textField_3);
	}
	public JButton getBtnNewButton() {
		return btnNewButton;
	}
	public void setBtnNewButton(JButton btnNewButton) {
		this.btnNewButton = btnNewButton;
	}


	// COSTRUTTORE
	public Gui_inserisci() {

		
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
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		getContentPane().setLayout(null);

		
	}
	
	
	private void init_display() {
		
		textNome = new JTextField();
		textNome.setBounds(155, 64, 249, 26);
		getContentPane().add(textNome);
		textNome.setColumns(10);
		
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
		
		textCognome = new JTextField();
		textCognome.setColumns(10);
		textCognome.setBounds(155, 111, 249, 26);
		getContentPane().add(textCognome);
		
		lblDataDiNascita = new JLabel("Nato il");
		lblDataDiNascita.setBounds(82, 158, 61, 16);
		getContentPane().add(lblDataDiNascita);
		
		textNatoIl = new JTextField();
		textNatoIl.setColumns(10);
		textNatoIl.setBounds(155, 153, 249, 26);
		getContentPane().add(textNatoIl);
		
		lblNatoA = new JLabel("Nato a");
		lblNatoA.setBounds(82, 201, 61, 16);
		getContentPane().add(lblNatoA);
		
		textNatoA = new JTextField();
		textNatoA.setColumns(10);
		textNatoA.setBounds(155, 196, 249, 26);
		getContentPane().add(textNatoA);
		
		btnNewButton = new JButton("INSERISCI");
		btnNewButton.setBounds(155, 234, 147, 38);
		getContentPane().add(btnNewButton);
		
	
	}
	
	
	public void resetta() {
		
		textNome.setText("");
		textCognome.setText("");
		textNatoIl.setText("");
		textNatoA.setText("");

	}
	
	
}
