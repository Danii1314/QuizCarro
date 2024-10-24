import Abstractas.Vehiculo;

public class Carro extends Vehiculo {
    @Override
    public void Encender() {
        System.out.println("El carro se encendio correctamente");
    }

    @Override
    public void Apagar() {
        System.out.println("El carro se a apagado correctamente");
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("La informacion del vehiculo es la siguiente:\t");
        System.out.println("marca\n:"+getMarca()+"\t");
        System.out.println("marca\n:"+getModelo()+"\t");
        System.out.println("marca\n:"+getCombustible()+"\t");

    }

    public Carro() {
    }

    public Carro(String marca, String modelo, String combustible) {
        super(marca, modelo, combustible);
    }

    @Override
    public String toString() {
        return "Carro{}";
    }
}
