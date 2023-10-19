import javax.swing.JOptionPane;


public class Ex1 {
	public static void main(String[] args){
		int x = Integer.parseInt(JOptionPane.showInputDialog("Insira um numero inteiro: "));
		
		if(x<0){
			JOptionPane.showMessageDialog(null, "NEGATIVO");
		}else
			JOptionPane.showMessageDialog(null, "NAO NEGATIVO");
			
	}
}
