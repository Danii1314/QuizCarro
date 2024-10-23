import Abstractas.Vehiculo;
import Interfaces.vehiculoElectrico;

public class CarroElectrico extends Vehiculo implements vehiculoElectrico {
    @Override
    public void Encender() {
        System.out.println("El carro electrico se encendio correctamente");
    }

    @Override
    public void Apagar() {
        System.out.println("el carro electrico se apago correctamente");
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("La informacion del carro electrico es  la siguiente es la siguiente:\t");
        System.out.println("marca\n:"+getMarca()+"\t");
        System.out.println("marca\n:"+getModelo()+"\t");
        System.out.println("marca\n:"+getCombustible()+"\t");

    }

    @Override
    public void cargarBateria() {

    }

    @Override
    public void niveldebateria() {

    }

    public CarroElectrico() {
    }

    public CarroElectrico(String marca, String modelo, String combustible) {
        super(marca, modelo, combustible);
    }

    @Override
    public String toString() {
        return "CarroElectrico{}";
    }
}
