package trenes;

import javax.swing.JOptionPane;

public class Trenes {

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "A contunuacion introdusca los datos de los trenes");
        tren lista[] = Crear();
        String data = "";
        for(int i=1;i<=5;i++){
            data = data + "Tren #"+i;
            data = data + "\nIdentificacion = " + lista[i-1].getIdentificacion();
            data = data + "\nMarca = " + lista[i-1].getMarca();
            data = data + "\nModelo = " + lista[i-1].getModelo();
            data = data + "\nAño = " + lista[i-1].getAño();
            if(lista[i-1].isAltaVelocidad()){
                data = data + "\nTren de alta velocidad = Si";
            }else{
                data = data + "\nTren de alta velocidad = No";
            }
            data = data + "\n"+tren.Model(lista[i-1]);
            data = data + "\n\n\n";
        }
        JOptionPane.showMessageDialog(null, data);
        System.out.println(data);
        
    }
    public static tren[] Crear(){
        tren Lista[]=new tren[5];
        for(int i=1;i<=5;i++){
            int id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese identificacion de el tren #"+i));
            String marca = JOptionPane.showInputDialog("Ingrese marca de el tren #"+i);
            String modelo = JOptionPane.showInputDialog("Ingrese modelo de el tren #"+i);
            int año = Integer.parseInt(JOptionPane.showInputDialog("Ingrese año de el tren #"+i));
            int v = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero 1 si el tren es de alta velocidad en el caso contrario ingrese 2"));
            tren temp = new tren(id, marca, modelo, año);
            if(v==1){
                temp.setAltaVelocidad(true);
            }
            Lista[i-1]=temp;  
        }
        return Lista;
    }
    
}
