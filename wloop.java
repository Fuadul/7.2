import javax.swing.JOptionPane;
public class wloop {
public static void main(String[] args) {
String U, P;		
U = JOptionPane.showInputDialog("Enter Username :");
P = JOptionPane.showInputDialog("Enter Password :");
while (!U .equals("Fuad") || !P .equals("123")){			
U = JOptionPane.showInputDialog("Enter Username :");
P = JOptionPane.showInputDialog("Enter Password :");
}		
JOptionPane.showMessageDialog(null, "Welcome " + U);
}
}
