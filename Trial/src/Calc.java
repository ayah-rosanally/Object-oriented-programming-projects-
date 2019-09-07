import javax.swing.JFrame;

public class Calc extends Trial {


	public static void main(String[] args) {
		Trial calculatrice = new Trial();
		
		calculatrice.setTitle("Calculatrice");
		calculatrice.setSize(400,500);
		calculatrice.setLocationRelativeTo(null);
		calculatrice.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		calculatrice.setVisible(true);

	}

}
