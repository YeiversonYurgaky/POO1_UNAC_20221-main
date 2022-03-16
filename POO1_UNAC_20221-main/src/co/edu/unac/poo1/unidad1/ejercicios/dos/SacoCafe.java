package co.edu.unac.poo1.unidad1.ejercicios.dos;

import co.edu.unac.poo1.unidad1.ejercicios.uno.cafe;

public class SacoCafe {
    private String codigoBarras;
    private Float costo;
    private Cafe cafeAsignado;

    public SacoCafe() {
    }

    public SacoCafe(String codigoBarras, Float costo, Cafe cafeAsignado) {
        this.codigoBarras = codigoBarras;
        this.costo = costo;
        this.cafeAsignado = cafeAsignado;
    }

    public String obtenerCodigoBarras2 (){
        return this.codigoBarras;
    }
    public void ponerCodigoBarras2(String codigoBarras){
        this.codigoBarras = codigoBarras;
    }

    public Float obtenerCosto2 (){return this.costo;}
    public void ponerCosto2(Float costo){
        this.costo = costo;
    }

    public Cafe obtenerCafeAsignado2 (){
        return this.cafeAsignado;
    }
    public void ponerCafeAsignado2(Cafe cafeAsignado){
        this.cafeAsignado = cafeAsignado;
    }



}
