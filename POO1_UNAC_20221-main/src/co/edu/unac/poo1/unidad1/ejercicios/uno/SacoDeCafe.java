package co.edu.unac.poo1.unidad1.ejercicios.uno;

public class SacoDeCafe {
    private String codigoBarras;
    private Float costo;
    private cafe cafeAsignado;

    public SacoDeCafe() {
    }

    public SacoDeCafe(String codigoBarras, Float costo, cafe cafeAsignado) {
        this.codigoBarras = codigoBarras;
        this.costo = costo;
        this.cafeAsignado = cafeAsignado;
    }

    public String obtenerCodigoBarras(){
        return this.codigoBarras;
    }
    public void ponerCodigoBarras(String codigoBarras){
        this.codigoBarras = codigoBarras;
    }

    public Float obtenerCosto(){
        return this.costo;
    }
    public void ponerCosto(Float costo){
        this.costo = costo;
    }

    public cafe obtenerCafeAsignado(){
        return this.cafeAsignado;
    }
    public void ponerCafeAsignado(cafe cafeAsignado){
        this.cafeAsignado = cafeAsignado;
    }

































}
