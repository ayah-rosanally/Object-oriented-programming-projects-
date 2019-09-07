
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.awt.event.ItemEvent;
import javax.swing.JPanel;
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

public class Pizza extends JFrame{
	
	public ArrayList<Creation> pizza_list = new ArrayList<Creation>();//ArrayList pour les pizzas
	public ArrayList<Creation_Jue> brevage_list = new ArrayList<Creation_Jue>();//ArrayList pour mes brevages
	
	private JPanel Main_conteneur = new JPanel();//Conteneur primaire
	private JPanel Prices = new JPanel();//Panel pour les prix
	//Les Panels
	private JPanel Order_Pizza = new JPanel();
	private JPanel Order_Breuvage = new JPanel();
	private JPanel Control_Boutons = new JPanel();
	//Les boutons
	private JButton Ajouter = new JButton("Ajouter");
	private JButton Payer = new JButton("Payer");
	private JButton Quitter = new JButton("Quitter");
	//Les labels
	private JLabel Taille = new JLabel("Taille :");
	private JLabel Nombre = new JLabel("Nombre :");
	private JLabel Garnitures = new JLabel("Garnitures :");
	private JLabel Sorte = new JLabel("Sorte :");
	private JLabel BNombre = new JLabel("Nombre :");
	private JLabel Pizza_Price = new JLabel(String.format("<html>Pizza:<br/><br/>Petit: 6.79$<br/>Moyen: 8.29$<br/>Large: 9.49<br/>Extra Large: 10.29$<br/>Party size: 15.99$<br/><br/>Garnitures:<br/><br/>Small: 1.20$<br/>Moyen: 1.40$<br/>Large: 1.60$<br/>Extra Large: 1.80$<br/>Party: 2.30$<br/><br/>Breuvage :<br/><br/>Pop: 1.10$<br/>Jus: 1.35$<br/>Water: 1.00$<html>"));
	//Les CheckBoxs
	private JCheckBox Petit = new JCheckBox("Petit");
	private JCheckBox Moyen = new JCheckBox("Moyen");
	private JCheckBox Large = new JCheckBox("Large");
	private JCheckBox XLarge = new JCheckBox("XLarge");
	private JCheckBox Fete = new JCheckBox("Fete");
	private JCheckBox Pop = new JCheckBox("Pop");
	private JCheckBox Jue = new JCheckBox("Jue");
	private JCheckBox Eau = new JCheckBox("Eau");
	//Les nombres dans les comboBoxs
	public static final String [] nombre = {"0","1","2","3","4","5"};
	//Les comboBoxs
	private final JComboBox<String> NPetit = new JComboBox<String>(nombre);
	private final JComboBox<String> NMoyen = new JComboBox<String>(nombre);
	private final JComboBox<String> NLarge = new JComboBox<String>(nombre);
	private final JComboBox<String> NXLarge = new JComboBox<String>(nombre);
	private final JComboBox<String> NFete = new JComboBox<String>(nombre); 
	private final JComboBox<String> GPetit = new JComboBox<String>(nombre);
	private final JComboBox<String> GMoyen = new JComboBox<String>(nombre);
	private final JComboBox<String> GLarge = new JComboBox<String>(nombre);
	private final JComboBox<String> GXLarge = new JComboBox<String>(nombre);
	private final JComboBox<String> GFete = new JComboBox<String>(nombre);
	private final JComboBox<String> NPop = new JComboBox<String>(nombre);
	private final JComboBox<String> NJue = new JComboBox<String>(nombre);
	private final JComboBox<String> NEau = new JComboBox<String>(nombre);
	
	
	
	
public Pizza() {
		
		super ("Commande");
		this.setSize(650, 400);//Taille du window
		
		//Bouton handler
		BoutonHandler handler = new BoutonHandler();
		
		//Les boutons qui utilises le handler
		Quitter.addActionListener(handler);         
		Payer.addActionListener(handler);
		Ajouter.addActionListener(handler);
	
		//Crée des border vide autour du window
		Main_conteneur.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
		Order_Pizza.setBorder(BorderFactory.createEmptyBorder(15,15,15,15));
		//Set mes layouts
		Main_conteneur.setLayout(new BorderLayout());
		Prices.setLayout(new FlowLayout());
		Order_Pizza.setLayout(new GridLayout(6,3));
		Order_Breuvage.setLayout(new GridLayout(4,2,5,5));
		Control_Boutons.setLayout(new FlowLayout());
		//Ajoute toutes les JLabel boutons checkbox et combobox 
		Control_Boutons.add(Ajouter);
		Control_Boutons.add(Payer);
		Control_Boutons.add(Quitter);
		
		Prices.add(Pizza_Price);
		
		Order_Pizza.add(Taille);
		Order_Pizza.add(Nombre);
		Order_Pizza.add(Garnitures);
		Order_Pizza.add(Petit);
		Order_Pizza.add(NPetit);
		Order_Pizza.add(GPetit);
		Order_Pizza.add(Moyen);
		Order_Pizza.add(NMoyen);
		Order_Pizza.add(GMoyen);
		Order_Pizza.add(Large);
		Order_Pizza.add(NLarge);
		Order_Pizza.add(GLarge);
		Order_Pizza.add(XLarge);
		Order_Pizza.add(NXLarge);
		Order_Pizza.add(GXLarge);
		Order_Pizza.add(Fete);
		Order_Pizza.add(NFete);
		Order_Pizza.add(GFete);
		
		Order_Breuvage.add(Sorte);
		Order_Breuvage.add(BNombre);
		Order_Breuvage.add(Pop);
		Order_Breuvage.add(NPop);
		Order_Breuvage.add(Jue);
		Order_Breuvage.add(NJue);
		Order_Breuvage.add(Eau);
		Order_Breuvage.add(NEau);
		
		
		
		
		Main_conteneur.add(Prices,BorderLayout.WEST);
		Main_conteneur.add(Order_Pizza, BorderLayout.CENTER);
		Main_conteneur.add(Order_Breuvage,BorderLayout.EAST);
		Main_conteneur.add(Control_Boutons,BorderLayout.SOUTH);
		
		this.setContentPane(Main_conteneur);
		
	}

	
//Bouton handler control
private class BoutonHandler implements ActionListener{
	@Override
	public void actionPerformed (ActionEvent e){
		
		 JButton boutonCliqué = (JButton) e.getSource();
		 String libelléBoutonCliqué = boutonCliqué.getText();
		 // bouton Quitter ferme le system 
		 if (libelléBoutonCliqué == "Quitter"){
			 System.exit(0);
		 }
		 //Bouton ajouter ajoute ton ordre
		 else if (libelléBoutonCliqué == "Ajouter"){
			 
			 if (Petit.isSelected()){
		 		  Creation pizza = new Creation("petit", NPetit.getSelectedIndex(), GPetit.getSelectedIndex());
		 		  pizza_list.add(pizza);
		 	 }
			 if (Moyen.isSelected()){
				 Creation pizza = new Creation("moyen", NMoyen.getSelectedIndex(),GMoyen.getSelectedIndex());
				 pizza_list.add(pizza);
			 }
			 if (Large.isSelected()){
				 Creation pizza = new Creation("large", NLarge.getSelectedIndex(),GLarge.getSelectedIndex());
				 pizza_list.add(pizza);
			 }
			 if (XLarge.isSelected()){
				 Creation pizza = new Creation("Xlarge",NXLarge.getSelectedIndex(),GXLarge.getSelectedIndex());
				 pizza_list.add(pizza);
			 }
			 if (Fete.isSelected()){
				 Creation pizza = new Creation ("Fete",NFete.getSelectedIndex(),GFete.getSelectedIndex());
				 pizza_list.add(pizza);
			 }
			 if (Pop.isSelected()){
				 Creation_Jue brevage = new Creation_Jue ("pop",NPop.getSelectedIndex());
				 brevage_list.add(brevage);
			 }
			 if (Jue.isSelected()){
				 Creation_Jue brevage = new Creation_Jue ("jue",NJue.getSelectedIndex());
				 brevage_list.add(brevage);
			 }
			 if (Eau.isSelected()){
				 Creation_Jue brevage = new Creation_Jue ("eau",NEau.getSelectedIndex());
				 brevage_list.add(brevage);
			 }
			 
			 
		 }
		 //Crée le deuxieme window pour payer et vide ton premiere window pour faire une autre ordre
		 else if (libelléBoutonCliqué == "Payer"){
			double prix_pizza,prix_brevage,prix_total;
			Payer pay_Frame = new Payer();
			pay_Frame.afficher_list_pizza(pizza_list);
			pay_Frame.afficher_list_Beuvrage(brevage_list);
			prix_pizza = calcul_food(pizza_list);
			prix_brevage = calcul_brevage(brevage_list);
			pay_Frame.calcul_total(prix_pizza,prix_brevage);
			
			pay_Frame.setVisible(true);
			
			Petit.setSelected(false); 
			Moyen.setSelected(false); 
			Large.setSelected(false); 
			XLarge.setSelected(false); 
			Fete.setSelected(false); 
			Pop.setSelected(false); 
			Jue.setSelected(false); 
			Eau.setSelected(false); 
			
			NPetit.setSelectedIndex(0);
			NMoyen.setSelectedIndex(0);
			NLarge.setSelectedIndex(0);
			NXLarge.setSelectedIndex(0);
			NFete.setSelectedIndex(0);
			GPetit.setSelectedIndex(0);
			GMoyen.setSelectedIndex(0);
			GLarge.setSelectedIndex(0);
			GXLarge.setSelectedIndex(0);
			GFete.setSelectedIndex(0);
			NPop.setSelectedIndex(0);
			NJue.setSelectedIndex(0);
			NEau.setSelectedIndex(0);
			pizza_list.clear();
			brevage_list.clear();
			
			
			
	          
		 }
	}
	
}
//Calcul le prix du pizza
 public double calcul_food (ArrayList<Creation> pizza_list ){
	 double prix_pizza = 0;
	 if (pizza_list.isEmpty()){
		 
	 }
	 else{
		 for (int i = 0;i<=pizza_list.size()-1;i++){
			 if (pizza_list.get(i).getType() == "petit"){
				 prix_pizza = prix_pizza+(6.79*pizza_list.get(i).getNum())+(1.20*pizza_list.get(i).getGar());
			 }
			 else if (pizza_list.get(i).getType() == "moyen"){
				 prix_pizza = prix_pizza+(8.29*pizza_list.get(i).getNum())+(1.40*pizza_list.get(i).getGar());
			 }
			 else if (pizza_list.get(i).getType() == "large"){
				 prix_pizza = prix_pizza+(9.49*pizza_list.get(i).getNum())+(1.60*pizza_list.get(i).getGar());
			 }
			 else if (pizza_list.get(i).getType() == "Xlarge"){
				 prix_pizza = prix_pizza+(10.29*pizza_list.get(i).getNum())+(1.80*pizza_list.get(i).getGar());
			 }
			 else if (pizza_list.get(i).getType() == "Fete"){
				 prix_pizza = prix_pizza+(15.99*pizza_list.get(i).getNum())+(2.30*pizza_list.get(i).getGar());
			 }
		 }
	 }
	 return prix_pizza;
	
 }
 //Calcul le prix des brevages
 public double calcul_brevage (ArrayList<Creation_Jue> brevage_list ){
	 double prix_brevage = 0;
	 if (brevage_list.isEmpty()){
		 
	 }
	 else{
		 for (int i = 0;i<=brevage_list.size()-1;i++){
			 if (brevage_list.get(i).getType() == "pop"){
				 prix_brevage = prix_brevage+(1.10*brevage_list.get(i).getNum());
			 }
			 else if (brevage_list.get(i).getType() == "jue"){
				 prix_brevage = prix_brevage+(1.35*brevage_list.get(i).getNum());
			 }
			 else if (brevage_list.get(i).getType() == "eau"){
				 prix_brevage = prix_brevage+(1.00*brevage_list.get(i).getNum());
			 }
			 
		 }
	 }
	 return prix_brevage;
 }

}
