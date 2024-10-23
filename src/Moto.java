import Abstractas.Vehiculo;

public class Moto extends Vehiculo {
    @Override
    public void Encender() {
        System.out.println("la moto se encendio correctamente");
    }

    @Override
    public void Apagar() {
        System.out.println("la moto se a apagado correctamente");
    }

    @Override
    public void mostrarInformacion() {
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
