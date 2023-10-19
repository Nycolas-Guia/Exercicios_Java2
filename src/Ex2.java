import javax.swing.JOptionPane;

public class Ex2 {
	public static void main(String[] args){
			int x = Integer.parseInt(JOptionPane.showInputDialog("Insira um numero inteiro: "));
			
			if(x%2 == 0){
				JOptionPane.showMessageDialog(null, "PAR");
			}else
				JOptionPane.showMessageDialog(null, "IMPAR");
	}
}
