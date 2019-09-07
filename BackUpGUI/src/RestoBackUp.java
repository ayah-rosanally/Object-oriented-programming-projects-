import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;

public class RestoBackUp extends JFrame{
//JPanel
	private static JPanel conteneur =  new JPanel();//JPanel principal
	
	//les différents section
	private static JPanel contMenu = new JPanel(), contPizza = new JPanel(), contBreuvage = new JPanel(), Payer = new JPanel();
	
	//ArrayList
	private static ArrayList <Pizza> listPizza = new ArrayList<Pizza>(); 
	private static ArrayList <Breuvage> listBreuvage= new ArrayList<Breuvage>(); 
	
	
//JLabel
	private final static JLabel labelMenu = new JLabel("<html>Menu <br/><br/> Pizza <br/> Petit: 6,79$ <br/> Moyen: 8,79$ <br/>"
			+ " Large: 9,49$ <br/> Extra: 10,29$ <br/> Fete: 15,99$ <br/><br/> Garniture <br/> Petit: 1,20$ <br/>"
		+"	Moyen: 1,40$ <br/> Large: 1,60$ <br/> Extra: 1,80$ <br/> Fete: 2,30$ <br/><br/> Breuvage"
		+ " <br/> Pop: 1,10$ <br/> Jus: 1,35$ <br/> Eau: 1,00$ <html>");
	private final static JLabel emptyspace = new JLabel ("<html><br/><html>");
	private final static JLabel labPizza = new JLabel("#Pizza");
	private final static  JLabel labGarniture = new JLabel("Garniture");
    private final static JLabel labBreuvage = new JLabel("Breuvage");
    private final static JLabel taille = new JLabel("Taille");
	
//JCheckBox
    private static JCheckBox checkPetit = new JCheckBox ("Petit");
    private static JCheckBox checkMoyen = new JCheckBox ("Moyen"); 
    private static JCheckBox checkLarge = new JCheckBox ("Large"); 
    private static JCheckBox checkExlarge = new JCheckBox ("Extra Large"); 
    private static JCheckBox checkFete = new JCheckBox ("Fête"); 
    private static JCheckBox checkpop = new JCheckBox ("Pop");
    private static JCheckBox checkeau = new JCheckBox ("Eau");
    private static JCheckBox checkjus = new JCheckBox ("Jus");
//Tableau
     private static final String[] nombre = {"1", "2", "3", "4", "5"};
 //JComboBox  
    private final JComboBox<String> PizzapetitJCB = new JComboBox<String> (nombre);
    private final JComboBox<String> PizzamoyenJCB= new JComboBox<String> (nombre);
    private final JComboBox<String> PizzalargeJCB = new JComboBox<String> (nombre);
    private final JComboBox<String> PizzaexlargeJCB = new JComboBox<String> (nombre);
    private final JComboBox<String> PizzafeteJCB = new JComboBox<String> (nombre);
  
    private final JComboBox<String> GarnpetitJCB = new JComboBox<String> (nombre);
    private final JComboBox<String> GarnmoyenJCB= new JComboBox<String> (nombre);
    private final JComboBox<String> GarnlargeJCB = new JComboBox<String> (nombre);
    private final JComboBox<String> GarnexlargeJCB = new JComboBox<String> (nombre);
    private final JComboBox<String> GarnfeteJCB = new JComboBox<String> (nombre);
   
    private final JComboBox<String> popJCB = new JComboBox<String> (nombre);
    private final JComboBox<String> eauJCB = new JComboBox<String> (nombre);
    private final JComboBox<String> jusJCB =new JComboBox<String> (nombre);
//Boutton
    private static JButton ajouter = new JButton("Ajouter");
    private static JButton quitter = new JButton("Quitter");
    private static JButton payer = new JButton("Payer");
    
	public RestoBackUp() {
		super("Restaurant");	
		this.setContentPane(conteneur);
		this.setSize(670,500);
		
		conteneur.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
		contPizza.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
		contBreuvage.setBorder(BorderFactory.createEmptyBorder(15,15,15,15));
		conteneur.setLayout(new BorderLayout());
		
		
		contMenu.setLayout(new FlowLayout());
		contPizza.setLayout(new GridLayout(6,3));
		contBreuvage.setLayout(new GridLayout(4, 0));
		Payer.setLayout(new FlowLayout());
    
		
		   CheckBoxHandler handler = new CheckBoxHandler();
         	checkPetit.addItemListener(handler);         
         	checkMoyen.addItemListener(handler); 
         	checkLarge.addItemListener(handler); 
         	checkExlarge.addItemListener(handler); 
         	checkFete.addItemListener(handler); 
         	
		conteneur.add(contMenu, BorderLayout.WEST);
		conteneur.add(contPizza, BorderLayout.CENTER);
		conteneur.add(contBreuvage, BorderLayout.EAST);
		conteneur.add(Payer, BorderLayout.SOUTH);
		
		contMenu.add(labelMenu);
		
		contPizza.add(taille);
		contPizza.add(labPizza);
		contPizza.add(labGarniture);
		contPizza.add(checkPetit);
		contPizza.add(PizzapetitJCB);
		contPizza.add(GarnpetitJCB);
		contPizza.add(checkMoyen);
		contPizza.add(PizzamoyenJCB);
		contPizza.add(GarnmoyenJCB);
		contPizza.add(checkLarge);
		contPizza.add(PizzalargeJCB);
		contPizza.add(GarnlargeJCB);
		contPizza.add(checkExlarge);
		contPizza.add(PizzaexlargeJCB);
		contPizza.add(GarnexlargeJCB);
		contPizza.add(checkFete);
		contPizza.add(PizzafeteJCB);
		contPizza.add(GarnfeteJCB);

		contBreuvage.add(labBreuvage);
		contBreuvage.add(emptyspace);
		contBreuvage.add(checkpop);
		contBreuvage.add(popJCB);
		contBreuvage.add(checkeau);
		contBreuvage.add(eauJCB);
		contBreuvage.add(checkjus);
		contBreuvage.add(jusJCB);
		
		Payer.add(ajouter);
		Payer.add(payer);
		Payer.add(quitter);
	}//fin de la class RestoBackUp
	
	private class BoutonHandler implements ActionListener{
		public void actionPerformed (ActionEvent e){
			
			JButton BoutonCliqué = (JButton) e.getSource();
			String labelBoutonCliqué = BoutonCliqué.getText();
			
			if(labelBoutonCliqué == "Ajouter"){
								
						if (checkPetit.isSelected()){
							Pizza petit = new Pizza("petit", PizzapetitJCB.getSelectedIndex(), GarnpetitJCB.getSelectedIndex());
							listPizza.add(petit);
						}
						if (checkMoyen.isSelected()){
							Pizza moyen = new Pizza("moyen", PizzamoyenJCB.getSelectedIndex(), GarnmoyenJCB.getSelectedIndex());
							listPizza.add(moyen);
						}
						if (checkLarge.isSelected()){
							Pizza large = new Pizza("large", PizzalargeJCB.getSelectedIndex(), GarnlargeJCB.getSelectedIndex());
							listPizza.add(large);
						}
						if (checkMoyen.isSelected()){
							Pizza exlarge = new Pizza("exlarge", PizzaexlargeJCB.getSelectedIndex(), GarnexlargeJCB.getSelectedIndex());
							listPizza.add(exlarge);
						}
						if (checkMoyen.isSelected()){
							Pizza fete = new Pizza("fete", PizzafeteJCB.getSelectedIndex(), GarnfeteJCB.getSelectedIndex());
							listPizza.add(fete);
						}
						if (checkpop.isSelected()){
							Breuvage pop = new Breuvage("pop", popJCB.getSelectedIndex());
							listBreuvage.add(pop);
						}
						if (checkeau.isSelected()){
							Breuvage eau = new Breuvage("eau", eauJCB.getSelectedIndex());
							listBreuvage.add(eau);
						}
						if (checkjus.isSelected()){
							Breuvage jus = new Breuvage("jus", jusJCB.getSelectedIndex());
							listBreuvage.add(jus);
						}
				
				Cheque commande = new Cheque(listPizza, listBreuvage);
														
			}//fin de l'instruction if Ajouter
			else if(labelBoutonCliqué == "Quitter"){
				System.exit(0);
			}//fin de la 1ère l'instruction else if
			else if(labelBoutonCliqué == "Payer"){
				
			}//fin de la 2ème classe else if
			
		}
	}
	
	private class CheckBoxHandler implements ItemListener {
       
       @Override
       public void itemStateChanged(ItemEvent event){
          Font font = null; 
          int x = 0;
          // détermine le quels des cases qui est coché
          if (checkPetit.isSelected())
        	   x = 1;
          else if (checkMoyen.isSelected())
        	  	x = 2;
          else if (checkLarge.isSelected())
	            x = 3;
          else if(checkExlarge.isSelected())
        	  	x = 4;
          else if(checkFete.isSelected())
        	  	x = 5;
         
       }//fin de la class CheckBoxHandler
    }
	
	
	
    public static void main(String[] args)
    {
    	RestoBackUp resto = new RestoBackUp();
         resto.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         resto.setSize(670, 500);
         resto.setLocationRelativeTo(null);
         resto.setVisible(true);
         
        
    }//fin de la classe main
    
}//fin de la classe principale RestoBackUp

