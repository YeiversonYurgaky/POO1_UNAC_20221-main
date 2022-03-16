package co.edu.unac.poo1.unidad1.ejercicios.dos;

public class Cafe {
    private String serial;
    private String variedad;
    private Integer alturaCultivos;

    //Constructor vacio
    public Cafe(){
    }

    //Constructor lleno
    public Cafe (String serial, String variedad, Integer alturaCultivos){
        this.serial = serial;
        this.variedad = variedad;
        this.alturaCultivos = alturaCultivos;
    }
    //Getter del serial
    public String obtenerSerial2 (){
        return this.serial;
    }

    //Setter del serial
    public void ponerSerial2 (String serial){
        this.serial = serial;
    }

    //Getter de la variedad
    public String obtenerVariedad2 (){
        return this.variedad;
    }

    //Setter de la variedad
    public void ponerVariedad2 (String variedad){
        this.variedad = variedad;
    }

    //Getter de la altura de los cultivos
    public Integer obtenerAltura2 (){return this.alturaCultivos;}

    //Setter de la altura de los cultivos
    public void ponerAltura2(Integer alturaCultivos){
        this.alturaCultivos = alturaCultivos;
    }
}
