import java.awt.FlowLayout;
import java.awt.event.ItemListener;
import java.text.DecimalFormat;
import java.awt.event.ItemEvent;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import java.util.ArrayList;

public class Payer extends JFrame{
	
	public static String newline = System.getProperty("line.separator");
	
	BoutonHandler handler = new BoutonHandler();
	
	 JTextArea Commande=new JTextArea();
	 JTextArea Commande2=new JTextArea();
	 JPanel Main_Pay = new JPanel();
	 JPanel Order_Panel = new JPanel();
	 JLabel VCommande = new JLabel("Votre Commande :");
	 JLabel Payement = new JLabel();
	
	 JButton Fermer = new JButton("Fermer");
	
	public Payer(){
		 
		  //Crée le deuxieme window avec c'est JLabel,JTextAreas,etc
		super("Payement");
		 
		 Fermer.addActionListener(handler);
		 
		 Main_Pay.setLayout(new BorderLayout());
		 Order_Panel.setLayout(new GridLayout(3,1,5,5));
		 Main_Pay.add(VCommande,BorderLayout.NORTH);
		 
		 Order_Panel.add(Commande);
		 Order_Panel.add(Commande2);
		 Order_Panel.add(Payement);
		 Main_Pay.add(Order_Panel, BorderLayout.CENTER);
		 Main_Pay.add(Fermer,BorderLayout.SOUTH);
		 
		 Main_Pay.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		 Order_Panel.setBorder(BorderFactory.createEmptyBorder(15,15,15,15));
		  
		 this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         this.setSize(350, 500);
         this.setLocationRelativeTo(null);
         this.setResizable(false);
        
         this.setContentPane(Main_Pay);
		 
		  
	}
	//BoutonHandler control
	private class BoutonHandler implements ActionListener{
		@Override
		public void actionPerformed (ActionEvent e){
			
			 JButton boutonCliqué = (JButton) e.getSource();
			 String libelléBoutonCliqué = boutonCliqué.getText();
			 
			 if (libelléBoutonCliqué == "Fermer"){
				 dispose();
			 }
			 
		}
	}
	//Calcul le prix total
	public void calcul_total(double prix_brevage, double prix_pizza){
		double prix_total;String prix = null;
		prix_total = (prix_brevage + prix_pizza)*1.13;
		DecimalFormat decimalFormat = new DecimalFormat("#.00");
		prix = decimalFormat.format(prix_total);
		Payement.setText("Total : "+prix+"$");
	
	}
	//Affiche le liste des pizzas
	public void afficher_list_pizza (ArrayList<Creation> pizza_list){
		String order = " ";
		
		for (int i = 0;i<=pizza_list.size()-1;i++){
			order = order.concat(String.format("%s %s %s %d %s %d %s","Pizza : ", pizza_list.get(i).getType()," Nombre de pizza : ",pizza_list.get(i).getNum()," Garnitures : ",pizza_list.get(i).getGar(),newline));
			
		}
		
	
		Commande.setText(order);
	}
	//Affiche le liste des brevages
	public void afficher_list_Beuvrage (ArrayList<Creation_Jue> brevage_list){
		String order = " ";
		
		for (int i = 0;i<=brevage_list.size()-1;i++){
			order = order.concat(String.format("%s %s %s %d %s", "Type : ", brevage_list.get(i).getType(), "Nombre de boisson : ", brevage_list.get(i).getNum(), newline));
			
		}
		
	
		Commande2.setText(order);
	}
	

}

