package co.edu.unac.poo1.unidad1.ejercicios.uno;

public class cafe {
    private String serial;
    private String variedad;
    private Integer alturaCultivos;

    //Constructor vacio
    public cafe(){
    }

    //Constructor lleno
    public cafe (String serial, String variedad, Integer alturaCultivos){
        this.serial = serial;
        this.variedad = variedad;
        this.alturaCultivos = alturaCultivos;
    }
    //Getter del serial
    public String obtenerSerial(){
        return this.serial;
    }

    //Setter del serial
    public void ponerSerial(String serial){
        this.serial = serial;
    }

    //Getter de la variedad
    public String obtenerVariedad(){
        return this.variedad;
    }

    //Setter de la variedad
    public void ponerVariedad(String variedad){
        this.variedad = variedad;
    }

    //Getter de la altura de los cultivos
    public Integer obtenerAltura(){return this.alturaCultivos;}

    //Setter de la altura de los cultivos
    public void ponerAltura(Integer alturaCultivos){
        this.alturaCultivos = alturaCultivos;
   }
}
