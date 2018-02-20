import javax.swing.JOptionPane;

public class PrimeOrNot {
public static void main(String[] args) {
	String response;
	response = JOptionPane.showInputDialog("Enter a integer.");
	int input = Integer.parseInt(response);
	if(input % 2 == 0) {
		JOptionPane.showMessageDialog(null, input + " is not prime.");
	}
	else {
		for(int i = 2; i < input; i++) {
			if(input % i == 0) {
				JOptionPane.showMessageDialog(null, input + " is not prime.");
				System.exit(0);
			}
			else if(input % i != 0) {
				JOptionPane.showMessageDialog(null, input + " is prime.");
				System.exit(0);
			}
		}
	}
}
}
