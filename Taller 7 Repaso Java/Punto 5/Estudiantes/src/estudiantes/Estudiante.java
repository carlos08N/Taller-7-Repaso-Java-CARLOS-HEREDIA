package estudiantes;

import javax.swing.JOptionPane;

public class Estudiante {
    private int Cedula;
    private String Nombres;
    private String Apellidos;
    private String Dirrecion;
    private boolean Becado=false;
    private int Valor;

    public int getCedula() {
        return Cedula;
    }

    public void setCedula(int Cedula) {
        this.Cedula = Cedula;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getDirrecion() {
        return Dirrecion;
    }

    public void setDirrecion(String Dirrecion) {
        this.Dirrecion = Dirrecion;
    }

    public boolean isBecado() {
        return Becado;
    }

    public void setBecado(boolean Becado) {
        this.Becado = Becado;
    }

    public int getValor() {
        return Valor;
    }

    public void setValor(int Valor) {
        this.Valor = Valor;
    }

    public Estudiante(int Cedula, String Nombres, String Apellidos, String Dirrecion, int Valor) {
        this.Cedula = Cedula;
        this.Nombres = Nombres;
        this.Apellidos = Apellidos;
        this.Dirrecion = Dirrecion;
        this.Valor = Valor;
    }

    public static Estudiante valor (Estudiante Est){
        int Valor = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Valor de la matricula"));
        if(Est.Becado == true){
            Valor = (int) (Valor*0.1);
        }
        Est.Valor = Valor;
        return Est;
    }
}
