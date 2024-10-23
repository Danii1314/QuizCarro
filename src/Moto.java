import Abstractas.Vehiculo;

public class Moto extends Vehiculo {
    @Override
    protected void Encender() {
        System.out.println("la moto se encendio correctamente");
    }

    @Override
    protected void Apagar() {
        System.out.println("la moto se a apagado correctamente");
    }

    @Override
    protected void mostrarInformacion() {
        System.out.println("La informacion de la moto es la siguiente:\t");
        System.out.println("marca\n:"+getMarca()+"\t");
        System.out.println("marca\n:"+getModelo()+"\t");
        System.out.println("marca\n:"+getCombustible()+"\t");
    }

    public Moto() {
    }

    public Moto(String marca, String modelo, String combustible) {
        super(marca, modelo, combustible);
    }

    @Override
    public String toString() {
        return "Moto{}";
    }
}
