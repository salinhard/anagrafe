package anagrafe;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import java.awt.Color;
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
	
	private JLabel lblNomeAlert;
	private JLabel lblCognomeAlert;
	private JLabel lblNatoIlAlert;
	private JLabel lblNatoAAlert;
	
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


	public String getLblNomeAlert() {
		return lblNomeAlert.getText();
	}
	public void setLblNomeAlert(String stringa) {
		this.lblNomeAlert.setText(stringa);
	}
	public String getLblCognomeAlert() {
		return lblCognomeAlert.getText();
	}
	public void setLblCognomeAlert(String stringa) {
		this.lblCognomeAlert.setText(stringa);
	}
	public String getLblNatoIlAlert() {
		return lblNatoIlAlert.getText();
	}
	public void setLblNatoIlAlert(String stringa) {
		this.lblNatoIlAlert.setText(stringa);
	}
	public String getLblNatoAAlert() {
		return lblNatoAAlert.getText();
	}
	public void setLblNatoAAlert(String stringa) {
		this.lblNatoAAlert.setText(stringa);
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
		
		lblNomeAlert = new JLabel();
		lblNomeAlert.setForeground(Color.RED);
		lblNomeAlert.setBounds(155, 84, 249, 26);
		getContentPane().add(lblNomeAlert);
		
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
		
		lblCognomeAlert = new JLabel();
		lblCognomeAlert.setBounds(155, 130, 249, 26);
		lblCognomeAlert.setForeground(Color.RED);
		getContentPane().add(lblCognomeAlert);
		
		textCognome = new JTextField();
		textCognome.setColumns(10);
		textCognome.setBounds(155, 111, 249, 26);
		getContentPane().add(textCognome);
		
		lblDataDiNascita = new JLabel("Nato il");
		lblDataDiNascita.setBounds(82, 158, 61, 16);
		getContentPane().add(lblDataDiNascita);
		
		lblNatoIlAlert = new JLabel();
		lblNatoIlAlert.setBounds(155, 171, 249, 26);
		lblNatoIlAlert.setForeground(Color.RED);
		getContentPane().add(lblNatoIlAlert);
		
		textNatoIl = new JTextField();
		textNatoIl.setColumns(10);
		textNatoIl.setBounds(155, 153, 249, 26);
		getContentPane().add(textNatoIl);
		
		lblNatoA = new JLabel("Nato a");
		lblNatoA.setBounds(82, 201, 61, 16);
		getContentPane().add(lblNatoA);
		
		lblNatoAAlert = new JLabel();
		lblNatoAAlert.setBounds(155, 214, 249, 26);
		lblNatoAAlert.setForeground(Color.RED);
		getContentPane().add(lblNatoAAlert);
		
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
