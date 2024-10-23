import Abstractas.Vehiculo;
public class Camion extends Vehiculo {
    @Override
    protected void Encender() {
        System.out.println("El camion esta encendido");
    }

    @Override
    protected void Apagar() {
        System.out.println("El camion se a apagado correctamente");
    }

    @Override
    protected void mostrarInformacion() {
        System.out.println("La informacion del vehiculo es la siguiente:\t");
        System.out.println("marca\n:"+getMarca()+"\t");
        System.out.println("marca\n:"+getModelo()+"\t");
        System.out.println("marca\n:"+getCombustible()+"\t");

    }

    public Camion() {
    }

    public Camion(String marca, String modelo, String combustible) {
        super(marca, modelo, combustible);
    }

    @Override
    public String toString() {
        return "Camion{}";
    }

}
