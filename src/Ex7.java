import javax.swing.JOptionPane;

public class Ex7 {
    public static void main (String[] args){
        
        double pontoX, pontoY;

        pontoX = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o X."));
        pontoY = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o Y."));
        JOptionPane.showMessageDialog(null, "Entrada:\n" + pontoX + "\n" + pontoY);

        if (pontoX > 0){
            if(pontoY > 0)
            JOptionPane.showMessageDialog(null, "Saída:\nQ1");
            else if(pontoY < 0)
            JOptionPane.showMessageDialog(null, "Saída:\nQ4");            
        } else if (pontoX < 0){
            if(pontoY > 0)
            JOptionPane.showMessageDialog(null, "Saída:\nQ2");
            else if(pontoY < 0)
            JOptionPane.showMessageDialog(null, "Saída:\nQ3");   
        } else
            JOptionPane.showMessageDialog(null, "Saída:\nOrigem");   
    }
}    

