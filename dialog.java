
import javax.swing.JOptionPane;


public class dialog{
    public static void main(String[] args) {
        //dialog boxes
        System.out.println("Hello world");

        String name = JOptionPane.showInputDialog(null, "What is your name");
        if (name != null && !name.isEmpty()){
            System.out.println("Hello " + name);
        }
        else
            System.out.println("no name have been entered");
    }
}