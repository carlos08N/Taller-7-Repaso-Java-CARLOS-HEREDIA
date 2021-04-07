package trenes;

public class tren {
    private int Identificacion;
    private String Marca;
    private String modelo;
    private int Año;
    private boolean AltaVelocidad=false;

    public int getIdentificacion() {
        return Identificacion;
    }

    public void setIdentificacion(int Identificacion) {
        this.Identificacion = Identificacion;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAño() {
        return Año;
    }

    public void setAño(int Año) {
        this.Año = Año;
    }

    public boolean isAltaVelocidad() {
        return AltaVelocidad;
    }

    public void setAltaVelocidad(boolean AltaVelocidad) {
        this.AltaVelocidad = AltaVelocidad;
    }

    public tren(int Identificacion, String Marca, String modelo, int Año) {
        this.Identificacion = Identificacion;
        this.Marca = Marca;
        this.modelo = modelo;
        this.Año = Año;
    }
    
    public static String Model(tren temp){
        String r="";
        int at = temp.getAño();
        if(at>=2022){
            r = "Modelo futuro";
        }else if(at==2021){
            r = "Ultimo modelo";
        }else if(at==2020){
            r = "Modelo nuevo";
        }else if(at<=2019 && at>=2017){
            r = "Modelo reciente";
        }else if(at<=2016){
            r = "Modelo antiguo";
        }
        return r;
    }
}
