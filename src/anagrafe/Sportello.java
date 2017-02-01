package anagrafe;

public class Sportello {
	
	static Grafica gui = new Grafica();
	
	
	public static void main ( String[] args ) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					gui.setVisible(true);	
					
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	} // fine main
		
		
		

	

}
