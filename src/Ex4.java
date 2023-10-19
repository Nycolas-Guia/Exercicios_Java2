import javax.swing.JOptionPane;


public class Ex4 {
	public static void main(String[] args){			
		int hrInicial = Integer.parseInt(JOptionPane.showInputDialog("Digite a hora inicial: "));
		int hrFinal = Integer.parseInt(JOptionPane.showInputDialog("Digite a hora final: "));
		
		if(hrInicial>=0 && hrInicial<=23 && hrFinal>=0 && hrFinal <=23){
			if(hrInicial < hrFinal){
            JOptionPane.showMessageDialog(null, "Saída: \nO jogo durou " + (hrFinal - hrInicial) + " horas");
        } else if(hrInicial == hrFinal){         
            JOptionPane.showMessageDialog(null, "Saída:\nO jogo durou 24 horas");
        } else {
            JOptionPane.showMessageDialog(null, "Saída:\nO jogo durou " + ((hrFinal + 24) - hrInicial) + " horas");
        }
		}
	}
}
