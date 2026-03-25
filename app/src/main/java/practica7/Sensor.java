package practica7;
// Se añade la palabra "abstract" a la declaración de la clase
public abstract class Sensor extends DispositivoElectronico {
    
    // Atributos específicos del sensor
    public String unidadMedida;
    public boolean estaCalibrado;

    // Constructor que llama a la clase base
    public Sensor(String fabricante, String modelo, double consumoEnergia, String unidadMedida, boolean estaCalibrado) {
        // super(...) inicializa los atributos de DispositivoElectronico
        super(fabricante, modelo, consumoEnergia); 
        this.unidadMedida = unidadMedida;
        this.estaCalibrado = estaCalibrado;
    }

    // Método para calibrar
    public void calibrar() {
        this.estaCalibrado = true;
        System.out.println("El sensor " + modelo + " ha sido calibrado correctamente.");
    }

    // MÉTODO ABSTRACTO: No tiene cuerpo (llaves), termina en punto y coma
    public abstract double leerValor();
}