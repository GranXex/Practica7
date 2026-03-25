package practica7;
public class SensorAceleracion extends Sensor {
    // Atributos adicionales
    public double valorEjeX;
    public double valorEjeY;
    public double valorEjeZ;

    // Constructor
    public SensorAceleracion(String fabricante, String modelo, double consumoEnergia, boolean estaCalibrado) {
        super(fabricante, modelo, consumoEnergia, "m/s^2", estaCalibrado);
    }

    // Sobreescritura del método abstracto
    @Override
    public double leerValor() {
        // Generando valores aleatorios para simular la medición (ej. entre -10.0 y 10.0)
        this.valorEjeX = -10.0 + (Math.random() * 20.0);
        this.valorEjeY = -10.0 + (Math.random() * 20.0);
        this.valorEjeZ = -10.0 + (Math.random() * 20.0);
        
        // Imprimiendo el mensaje con las 3 lecturas simuladas
        System.out.printf("Leyendo aceleración... [X: %.2f, Y: %.2f, Z: %.2f]%n", valorEjeX, valorEjeY, valorEjeZ);
        
        // Retornando la magnitud (raíz cuadrada de la suma de los cuadrados)
        double magnitud = Math.sqrt(Math.pow(valorEjeX, 2) + Math.pow(valorEjeY, 2) + Math.pow(valorEjeZ, 2));
        
        return magnitud;
    }
}