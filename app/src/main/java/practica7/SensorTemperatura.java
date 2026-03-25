package practica7;
public class SensorTemperatura extends Sensor {
    // Atributo adicional
    public double valorActual;

    // Constructor
    public SensorTemperatura(String fabricante, String modelo, double consumoEnergia, boolean estaCalibrado) {
        super(fabricante, modelo, consumoEnergia, "°C", estaCalibrado);
    }

    // Sobreescritura del método abstracto
    @Override
    public double leerValor() {
        System.out.println("Leyendo temperatura...");
        // Genera valor aleatorio entre 20.0 y 35.0
        this.valorActual = 20.0 + (Math.random() * (35.0 - 20.0));
        return this.valorActual;
    }
}