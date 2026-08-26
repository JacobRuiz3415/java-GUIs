//import joption
import javax.swing.JOptionPane;

public class dialog{
    public static void main(String[] args) {
        //dialog boxes
        System.out.println("Hello world");

        String name = JOptionPane.showInputDialog(null, "What is your name");
        if (name != null && !name.isEmpty()){
            JOptionPane.showMessageDialog(null, "Hello " + name);
            System.out.println("Hello " + name);
        }
        else
            JOptionPane.showMessageDialog(null, "no name have been entered");
    }
}