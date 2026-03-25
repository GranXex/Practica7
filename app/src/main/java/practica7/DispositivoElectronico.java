package practica7;

public class DispositivoElectronico {
    // Atributos solicitados
    public String fabricante;
    public String modelo;
    public double consumoEnergia;
    public boolean encendido;

    // Constructor
    public DispositivoElectronico(String fabricante, String modelo, double consumoEnergia) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.consumoEnergia = consumoEnergia;
        this.encendido = false; // Por defecto, un dispositivo suele iniciar apagado
    }

    // Método para encender
    public void encender() {
        this.encendido = true;
        System.out.println("El dispositivo " + modelo + " se ha encendido.");
    }

    // Método para apagar
    public void apagar() {
        this.encendido = false;
        System.out.println("El dispositivo " + modelo + " se ha apagado.");
    }

    // Método para obtener el estado
    public String obtenerEstado() {
        String estado = encendido ? "Encendido" : "Apagado";
        return "DispositivoElectronico {" +
                "fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", consumoEnergia=" + consumoEnergia + "W" +
                ", estado=" + estado +
                '}';
    }
}