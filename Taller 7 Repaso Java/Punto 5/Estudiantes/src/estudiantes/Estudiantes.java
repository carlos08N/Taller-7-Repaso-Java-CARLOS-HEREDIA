package estudiantes;

import javax.swing.JOptionPane;

public class Estudiantes {

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "A continuacion ingrese datos de los 5 estudiantes");
        Estudiante lista[] = Crear();
        String r = "";
        for(int i=1;i<=lista.length;i++){
            r = r + ("Estudiante " + i);
            r = r + "\n Cedula = "+ lista[i-1].getCedula();
            r = r + "\n Nombre = "+ lista[i-1].getNombres();
            r = r + "\n Apellidos = "+ lista[i-1].getApellidos();
            r = r + "\n Direccion = "+ lista[i-1].getDirrecion();
            if(lista[i-1].isBecado()){
                r = r + "\n Esta becado";
            }else{r = r + "\n No Esta becado";}
            r = r + "\n Valor de la Matricula = "+ lista[i-1].getValor();
            r = r + "\n\n\n";
        }
        JOptionPane.showMessageDialog(null, r);
        System.out.println(r);
    }
    
    public static Estudiante[] Crear(){
        Estudiante Lista[] = new Estudiante[5];
        for(int i=1;i<=5;i++){
            int cedula = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cedula de el estudiante "+i));
            String nombre = JOptionPane.showInputDialog("Ingrese nombres de el estudiante "+i);
            String apellidos = JOptionPane.showInputDialog("Ingrese apellidos de el estudiante "+i);
            String dirrecion = JOptionPane.showInputDialog("Ingrese Direccion de el estudiante "+i);
            int v = Integer.parseInt(JOptionPane.showInputDialog("Ingrese 1 si es becado o Ingrese 2 si no es becado el estudiante "+i));
            Estudiante temp = new Estudiante(cedula, nombre, apellidos, dirrecion, 0);
            if(v==1){
                temp.setBecado(true);
            }
            temp = Estudiante.valor(temp);
            Lista[i-1]=temp;
        }
        return Lista;
    }
    
}
