//import IOptionPane
import javax.swing.JOptionPane;

public class dialog{
    public static void main(String[] args) {
        //dialog boxes
        System.out.println("Hello world");

        //create input box
        String name = JOptionPane.showInputDialog(null, "What is your name");
        
        //output name in a dialog box. output error message if no name was entered
        if (name != null && !name.isEmpty()){
            JOptionPane.showMessageDialog(null, "Hello " + name);
            System.out.println("Hello " + name);
        }
        else
            JOptionPane.showMessageDialog(null, "no name have been entered");
    }
}