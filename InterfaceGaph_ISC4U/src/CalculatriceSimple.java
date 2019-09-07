import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class CalculatriceSimple extends JFrame {
		
	    private final JLabel label1 = new JLabel("Nombre 1 :");
	    private final JLabel label2 = new JLabel("Nombre 2 :");
	    private final JLabel label3 = new JLabel("Somme :");
	    private  JTextField nombre1= new JTextField(10);
	   
	    private JTextField nombre2 = new JTextField(10);
	    private JTextField somme = new JTextField(20);
	    private JButton boutonAjouter = new JButton();
	    private JButton boutonSoustraire = new JButton();
	    private JPanel conteneur = new JPanel();
	    
	    public CalculatriceSimple(){
	    	
	    	super("Calculatrice simple");
	    	
	    	this.setSize(400, 200);
	    	
	    	BoutonHandler handler = new BoutonHandler();
	    	
	    	boutonAjouter.setText("Additionner");
	    	
	    	boutonSoustraire.setText("Soustraire");
	    	conteneur.setLayout(new FlowLayout());
	    	somme.setHorizontalAlignment(JTextField.CENTER);
	    	
	    	conteneur.add(label1);
	    	conteneur.add(nombre1);
	    	conteneur.add(label2);
	    	conteneur.add(nombre2);
	    	conteneur.add(label3);
	    	conteneur.add(somme);
	    	conteneur.add(boutonAjouter);
	    	conteneur.add(boutonSoustraire);
	    	this.setContentPane(conteneur);
	    	// Lier chaque bouton à son listener
	    	// Première façon avec une classe interne
	    	boutonAjouter.addActionListener(handler);
	    	// Deuxième façon avec une classe anonyme
	    	
	    	boutonSoustraire.addActionListener(handler);
	    	
	    	/*
	    	boutonSoustraire.addActionListener(new ActionListener(){
	    		@Override
	    		
	    		public void actionPerformed(ActionEvent e){
	    				int n1, n2, s;
		    		   n1 = Integer.parseInt(nombre1.getText());
		    		   n2 = Integer.parseInt(nombre2.getText());
		    		   s = n1- n2;
		    		   somme.setText(String.valueOf(s));
	    		}
	    	});*/
	    		    	
	    }
	    
	    // Classe interne
	    private class BoutonHandler implements ActionListener
	    {
	    	@Override
	    	public void actionPerformed (ActionEvent e){
	    		
	    		
	    		   JButton boutonCliqué = (JButton) e.getSource();
				   String libelléBoutonCliqué = boutonCliqué.getText();
	    		   int n1, n2, s;
	    		   s= 0;
	    		   n1 = Integer.parseInt(nombre1.getText());
	    		   n2 = Integer.parseInt(nombre2.getText());
	    		   
	    		   if( libelléBoutonCliqué == "Additionner") {
	    		   
	    		   s = n1+n2;
	    		   
	    		   }
	    		   else if (libelléBoutonCliqué == "Soustraire"){
	    			   s = n1-n2;
	    			   
	    		   }
	    		   somme.setText(String.valueOf(s));
	    		
	    		
	    	}
	    }

	    
}
