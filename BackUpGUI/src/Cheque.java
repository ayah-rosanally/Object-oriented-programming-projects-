import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;

public class Cheque extends JFrame{
	
	private static JPanel cheque = new JPanel ();//cheque
	private static ArrayList <Pizza> listP = new ArrayList<Pizza>(); 
	private static ArrayList <Breuvage> listB = new ArrayList<Breuvage>(); 
	
	private final static JLabel facture = new JLabel("Facture");
	
	public Cheque(ArrayList <Pizza> listP, ArrayList <Breuvage> listB) {
		this.listP = listP;
		this.listB = listB;
		
	}


	public static ArrayList<Pizza> getListP() {
		return listP;
	}


	public static void setListP(ArrayList<Pizza> listP) {
		Cheque.listP = listP;
	}


	public static ArrayList<Breuvage> getListB() {
		return listB;
	}


	public static void setListB(ArrayList<Breuvage> listB) {
		Cheque.listB = listB;
	}

	

	
	
	
}
