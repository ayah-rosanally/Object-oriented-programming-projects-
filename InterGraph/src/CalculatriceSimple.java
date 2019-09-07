import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class CalculatriceSimple extends JFrame {

	private JPanel contentPane;

	 	private final static JLabel label1 = new JLabel("Nombre 1 :");
	    private final static JLabel label2 = new JLabel("Nombre 2 :");
	    private final static JLabel label3 = new JLabel("Somme :");
	    private static  JTextField nombre1= new JTextField(10);
	   
	    private static JTextField nombre2 = new JTextField(10);
	    private static JTextField somme = new JTextField(20);
	    private static JButton boutonAjouter = new JButton();
	    private static JButton boutonSoustraire = new JButton();
	    private static JPanel conteneur = new JPanel();
	    
	public static void main(String[] args) {
		
    	boutonAjouter.setText("Additionner");
    	boutonSoustraire.setText("Soustraire");
    	conteneur.setLayout(new FlowLayout());
    	somme.setHorizontalAlignment(JTextField.CENTER);
    	conteneur.setVisible(true);
    	CalculatriceSimple frame = new CalculatriceSimple();
					frame.setVisible(true);
		conteneur.add(label1);
    	conteneur.add(nombre1);
    	conteneur.add(label2);
    	conteneur.add(nombre2);
    	conteneur.add(label3);
    	conteneur.add(somme);
    	conteneur.add(boutonAjouter);
    	conteneur.add(boutonSoustraire);
    	
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					
					
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CalculatriceSimple() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

}
