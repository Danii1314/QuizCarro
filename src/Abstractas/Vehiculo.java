package Abstractas;

public abstract class Vehiculo {
    String marca;
    String modelo;
    String combustible;

    public Vehiculo() {
    }

    public Vehiculo(String marca, String modelo, String combustible) {
        this.marca = marca;
        this.modelo = modelo;
        this.combustible = combustible;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "marca='" + marca + '\'' +
                ", modelo=" + modelo +
                ", combustible='" + combustible + '\'' +
                '}';
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCombustible() {
        return combustible;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }

    public abstract void Encender();
    public abstract  void Apagar();
    public abstract void mostrarInformacion();

    public String abastecerCombustible(){

        return combustible;
    }



}
