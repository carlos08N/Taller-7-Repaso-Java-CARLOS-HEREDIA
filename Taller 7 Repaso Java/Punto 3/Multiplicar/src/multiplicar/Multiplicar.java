package multiplicar;

import javax.swing.JOptionPane;

public class Multiplicar {

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Ingrese los numeros a multiplicar");
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese primer numero"));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese segundo numero"));
        JOptionPane.showMessageDialog(null, "Resultado "+multiplicar(n1, n2));
    }
    public static int multiplicar(int n1, int n2){
        int resul = 0;
        for(int i=0;i<n1;i++){
            resul = resul + n2;
        }
        return resul;
    }
    
}
