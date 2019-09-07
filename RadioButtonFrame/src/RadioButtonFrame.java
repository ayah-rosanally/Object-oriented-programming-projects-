// Exemple avec les Radios boutons 
    import java.awt.FlowLayout;
    import java.awt.Font;
    import java.awt.event.ItemListener;
    import java.awt.event.ItemEvent;
    import javax.swing.JFrame;
    import javax.swing.JTextField;
    import javax.swing.JRadioButton;
    import javax.swing.ButtonGroup;
    public class RadioButtonFrame extends JFrame
   {
      private final JTextField textField; 
     private final Font boldFont; 
      private final Font italicFont; 
      private final Font boldItalicFont; 
      private final JRadioButton plainJRadioButton;   
      private final JRadioButton boldJRadioButton;  
      private final JRadioButton italicJRadioButton;  
      private final JRadioButton boldItalicJRadioButton; 
      private final ButtonGroup radioGroup;    
      
   // Constructeur
            public RadioButtonFrame()
            {
               super("Exemple des RadioButton");
               setLayout(new FlowLayout());
       
               textField = new JTextField( 25);
               add(textField); 
                  
               plainJRadioButton = new JRadioButton("Plain", true);            
               boldJRadioButton = new JRadioButton("Bold", false);             
               italicJRadioButton = new JRadioButton("Italic", false);         
               boldItalicJRadioButton = new JRadioButton("Bold/Italic", false);
               add(plainJRadioButton); 
               add(boldJRadioButton); 
               add(italicJRadioButton); 
               add(boldItalicJRadioButton); 
       
               // Regrouper les radios boutons dans un ButtonGroup
               // pour ne pas selectionner deux bouton au même temps
                radioGroup = new ButtonGroup(); // on crée un objet de type ButtonGroup         
                // On ajoute les JRadioButton au radioGroup
               radioGroup.add(plainJRadioButton);      
               radioGroup.add(boldJRadioButton);        
               radioGroup.add(italicJRadioButton);    
               radioGroup.add(boldItalicJRadioButton); 
       
               // Création d'un objet fonte
               Font plainFont = new Font("Serif", Font.PLAIN, 14);
               boldFont = new Font("Serif", Font.BOLD, 14);
               italicFont = new Font("Serif", Font.ITALIC, 14);
               boldItalicFont = new Font("Serif", Font.BOLD + Font.ITALIC, 14);
               textField.setFont(plainFont);
       
               // enregister les événement pour chaque radio bouton      
               plainJRadioButton.addItemListener(new RadioButtonHandler(plainFont));     
               boldJRadioButton.addItemListener(new RadioButtonHandler(boldFont));      
               italicJRadioButton.addItemListener(new RadioButtonHandler(italicFont));    
               boldItalicJRadioButton.addItemListener(new RadioButtonHandler(boldItalicFont));
            }
         // Déclaration de la classe interne
                 private class RadioButtonHandler implements ItemListener
                  {
                     private Font font; 
             
                     public RadioButtonHandler(Font f)
                     {
                        font = f;
                     }
                                  
                     @Override
                     public void itemStateChanged(ItemEvent event)
                     {
                        textField.setFont(font);
                     }
                  }
                 
                 // Déclaration de la méthode main
                 public static void main(String[] args)
                       {
                          RadioButtonFrame radioButtonFrame = new RadioButtonFrame();
                          radioButtonFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                          radioButtonFrame.setSize(350, 100);
                          radioButtonFrame.setVisible(true);
                     }
               } // Fin de la classe RadioButtonFrame