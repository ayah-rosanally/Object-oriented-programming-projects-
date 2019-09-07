import javax.swing.JFrame;

public class PizzaTest {

	public static void main(String[] args) {
		//Crée le window pizza
		  Pizza pizza = new Pizza();
          pizza.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          pizza.setSize(650, 450);
          pizza.setLocationRelativeTo(null);
          pizza.setVisible(true);
          pizza.setResizable(false);
         
	}

}
