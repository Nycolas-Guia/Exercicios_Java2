import javax.swing.JOptionPane;


public class Ex3 {
	public static void main
	(String[] args){
		int a = Integer.parseInt(JOptionPane.showInputDialog("Insira um numero inteiro: "));
		int b = Integer.parseInt(JOptionPane.showInputDialog("Insira outro numero inteiro: "));
		
		if(a>b && a%b == 0){			
			JOptionPane.showMessageDialog(null,"Sao Multiplo");
		}else if(a<b && b%a == 0){
			JOptionPane.showMessageDialog(null,"Sao Multiplo");
		}else 
			JOptionPane.showMessageDialog(null,"Nao sao Multiplos");			
	}
	
}
