
import javax.swing.JOptionPane;

public class adding {
    public static void main(String[] args) {
        System.out.println("start program");

        JOptionPane.showMessageDialog(null, "Enter two numbers");

        int firstNumber = Integer.parseInt(JOptionPane.showInputDialog("Enter the first number"));

        int secondNumber = Integer.parseInt(JOptionPane.showInputDialog("Enter the Second number"));
        
        int result = secondNumber + firstNumber;

        //output box
        JOptionPane.showMessageDialog(null,  firstNumber + " + " + secondNumber + " = " + result);

        System.out.println("Program ended");
    }
}
