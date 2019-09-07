
// Exemple avec les boutons à cocher et utilisation de la classe
// ItemEvent et de l'interface ItemListener
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JCheckBox;

   public class CaseAcocher extends JFrame {
	   
	   private final JTextField textField; // zone de texte pour afficher le texte
	   private final JCheckBox boldJCheckBox; // pour mettre le texte en gras   
	   private final JCheckBox italicJCheckBox; // pour mettre le texte en italic
	  
	   // CheckBoxFrame constructor adds JCheckBoxes to JFrame
	   public CaseAcocher()
	    {
		   super("Les cases à cocher");
		   setLayout(new FlowLayout());
	   
	     
	         textField = new JTextField(35);
	         textField.setFont(new Font("Serif", Font.PLAIN, 14));
	         textField.setHorizontalAlignment(JTextField.CENTER);
	         add(textField); // add textField to JFrame
	   
	          boldJCheckBox = new JCheckBox("Bold");
	          italicJCheckBox = new JCheckBox("Italic");
	          add(boldJCheckBox); 
	          add(italicJCheckBox); 
	   
	          // enregistrer les listeners pour les JCheckBoxes           
	          CheckBoxHandler handler = new CheckBoxHandler();
	          	boldJCheckBox.addItemListener(handler);         
	          	italicJCheckBox.addItemListener(handler);       
	     }
	   
	   
	   // Classe interne pour répondre aux événements liés aux checkbox
	         private class CheckBoxHandler implements ItemListener
	         {
	            
	            @Override
	            public void itemStateChanged(ItemEvent event)
	            {
	               Font font = null; 
	    
	               // détermine le quels des cases qui est coché
	               if (boldJCheckBox.isSelected() && italicJCheckBox.isSelected())
	                  font = new Font("Serif", Font.BOLD + Font.ITALIC, 14);
	               else if (boldJCheckBox.isSelected())
	                  font = new Font("Serif", Font.BOLD, 14);
	               else if (italicJCheckBox.isSelected())
	                  font = new Font("Serif", Font.ITALIC, 14);
	               else
	                  font = new Font("Serif", Font.PLAIN, 14);
	    
	               textField.setFont(font);
	              
	            }
	         }
	      
	         public static void main(String[] args)
	            {
	                 CaseAcocher checkBoxFrame = new CaseAcocher();
	                 checkBoxFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	                 checkBoxFrame.setSize(450, 100);
	                 checkBoxFrame.setLocationRelativeTo(null);
	                 checkBoxFrame.setVisible(true);
	            }
	         
	         
	   } // Fin de la classe CaseAcocher 

