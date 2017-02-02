package anagrafe;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import java.awt.Color;

public class prova extends JPanel {

  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

  DefaultListModel model;

  int counter = 15;

  public prova() {
    setLayout(new BorderLayout());
    model = new DefaultListModel();
    JScrollPane pane = new JScrollPane();
    for (int i = 0; i < 15; i++)
      model.addElement("Element " + i);

    add(pane, BorderLayout.NORTH);
    
    JLabel lblNewLabel = new JLabel("New label");
    lblNewLabel.setForeground(Color.RED);
    lblNewLabel.setBackground(Color.RED);
    add(lblNewLabel, BorderLayout.CENTER);
  }

  public static void main(String s[]) {
    JFrame frame = new JFrame("List Model Example");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setContentPane(new prova());
    frame.setSize(260, 200);
    frame.setVisible(true);
  }
}
           
         