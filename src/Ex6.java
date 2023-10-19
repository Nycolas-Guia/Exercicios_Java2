import javax.swing.JOptionPane;

public class Ex6 {
    public static void main (String[] args){
        
        double num;

        num = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira um número."));        
        
        if (num < 0 || num > 100){
            JOptionPane.showMessageDialog(null, "Saída:\nFora do intervalo");            
        } else if (num < 25){
            JOptionPane.showMessageDialog(null, "Saída:\nIntervalo (0, 25)");
        } else if (num < 50){
            JOptionPane.showMessageDialog(null, "Saída:\nIntervalo (25, 50)");
        } else if (num < 75){
            JOptionPane.showMessageDialog(null, "Saída:\nIntervalo (50, 75)");
        } else {
            JOptionPane.showMessageDialog(null, "Saída:\nIntervalo (75, 100)");
        }
    }
}
