public class Main {
    public static void main(String[] args) {

        Carro carro=new Carro("chevrolet","camaro","gasolina");
        carro.Apagar();
        carro.Encender();
        carro.mostrarInformacion();
        Camion camion=new Camion("chevrolet","JAC","Diesel");
        camion.Apagar();
        camion.Encender();
        camion.mostrarInformacion();
        Moto moto=new Moto("Yamaha","MT-15","Gasolina");
        moto.Apagar();
        moto.Encender();
        moto.mostrarInformacion();
        CarroElectrico carroElectrico=new CarroElectrico("Tesla","ModelX","Bateria");
        carroElectrico.Apagar();
        carroElectrico.Encender();
        carroElectrico.mostrarInformacion();
        carroElectrico.niveldebateria();
        carroElectrico.cargarBateria();

        System.out.println();


    }
}