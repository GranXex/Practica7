package practica7;
public class SensorPresion extends Sensor {
    // Atributo adicional
    public double valorActual;

    // Constructor
    public SensorPresion(String fabricante, String modelo, double consumoEnergia, boolean estaCalibrado) {
        super(fabricante, modelo, consumoEnergia, "hPa", estaCalibrado);
    }

    // Sobreescritura del método abstracto
    @Override
    public double leerValor() {
        System.out.println("Leyendo presión atmosférica...");
        // Genera valor aleatorio entre 900.0 y 1100.0
        this.valorActual = 900.0 + (Math.random() * (1100.0 - 900.0));
        return this.valorActual;
    }
}