import javax.swing.JOptionPane;

public class Ex5 {
    public static void main (String[] args){       
        int cdItem = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual item deseja?\n1- Cachorro quente\n2- X-Salada\n3- X-Bacon\n4- Torrada Simples\n5- Refrigerante"));
        int qtItem = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual a quantidade?"));
               
        switch(cdItem){

            case 1:
            JOptionPane.showMessageDialog(null, "Saída:\nTotal: R$" + qtItem * 4);
            break;
            case 2:
            JOptionPane.showMessageDialog(null, "Saída:\nTotal: R$" + qtItem * 4.50);
            break;
            case 3:
            JOptionPane.showMessageDialog(null, "Saída:\nTotal: R$" + qtItem * 5);
            break;
            case 4:
            JOptionPane.showMessageDialog(null, "Saída:\nTotal: R$" + qtItem * 2);
            break;
            case 5:
            JOptionPane.showMessageDialog(null, "Saída:\nTotal: R$" + qtItem * 1.50);
            break;
            
        }
    }
}
