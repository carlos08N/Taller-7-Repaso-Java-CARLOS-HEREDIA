package potencia;

import javax.swing.JOptionPane;

public class Potencia {

    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero"));
        int e = Integer.parseInt(JOptionPane.showInputDialog("Ingrese elevacion"));
        JOptionPane.showMessageDialog(null, "Resultado "+potenciar(n, e));
    }
    public static int potenciar(int n, int e){
        int r = n;
        for(int i=1;i<e;i++){
            int resul = 0;
            for(int i1=0;i1<n;i1++){
                resul = resul + r;
            }
            r = resul;
        }
        return r;
    }
    
}
