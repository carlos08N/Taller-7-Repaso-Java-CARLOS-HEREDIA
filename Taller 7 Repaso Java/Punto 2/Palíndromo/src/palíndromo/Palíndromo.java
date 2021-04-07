package palíndromo;

import javax.swing.JOptionPane;

public class Palíndromo {

    public static void main(String[] args) {
        String PL = JOptionPane.showInputDialog("Ingrese una palabra");
        if(ProcesarP(PL) ==  true){
            JOptionPane.showMessageDialog(null, "La palabra "+ PL + " Es un palíndromo");
        }else{JOptionPane.showMessageDialog(null, "La palabra "+ PL + " No es un palíndromo");}
    }
    public static boolean ProcesarP (String palabra){
        char Cadena[] = palabra.toCharArray();
        char temp[] = new char[Cadena.length];
        int i1 = 0;
        for(int i=Cadena.length-1;i>=0;i--){
            temp[i1]= Cadena[i];
            i1++;
        }
        String Comp = new String(temp);
        if(Comp.equals(palabra)){
            return true;
        }else{
            return false;
        }
        
    }   
}
