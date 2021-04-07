package numeromayor;

import javax.swing.JOptionPane;

public class NumeroMayor {

    public static void main(String[] args) {
        int AT = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Cuantos numeros se va a comparar"));
        int numeros[] = new int [AT];
        for(int i=0;i<numeros.length;i++){
            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero"));
        }
        JOptionPane.showMessageDialog(null, "El numero mayor es " + Comparar(numeros));
    }
    public static int Comparar(int numeros[]){
        int mayor = 0;
        for(int i=0;i<numeros.length;i++){
            if(numeros[i]>mayor){
                mayor = numeros[i];
            }
        }
        return mayor;
    }
    
}
