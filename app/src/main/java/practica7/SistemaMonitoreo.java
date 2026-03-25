package practica7;
import java.util.ArrayList;

public class SistemaMonitoreo {
    public static void main(String[] args) {
        
        // 1. Crear el contenedor (ArrayList) de tipo Sensor
        ArrayList<Sensor> listaSensores = new ArrayList<>();

        // 2. Instanciar al menos dos objetos de cada tipo y añadirlos a la lista
        
        // Instanciamos 2 Sensores de Temperatura
        SensorTemperatura temp1 = new SensorTemperatura("DHT", "DHT11", 0.5, false);
        SensorTemperatura temp2 = new SensorTemperatura("Texas Instruments", "LM35", 0.3, true);
        listaSensores.add(temp1);
        listaSensores.add(temp2);

        // Instanciamos 2 Sensores de Presión
        SensorPresion pres1 = new SensorPresion("Bosch", "BMP280", 1.2, false);
        SensorPresion pres2 = new SensorPresion("NXP", "MPL3115", 1.5, true);
        listaSensores.add(pres1);
        listaSensores.add(pres2);

        // Instanciamos 2 Sensores de Aceleración
        SensorAceleracion acel1 = new SensorAceleracion("InvenSense", "MPU6050", 2.0, false);
        SensorAceleracion acel2 = new SensorAceleracion("Analog Devices", "ADXL345", 1.8, false);
        listaSensores.add(acel1);
        listaSensores.add(acel2);

        System.out.println("--- INICIANDO PRUEBA DE SENSORES ---");

        // 3. Polimorfismo en Acción: Iterar sobre la lista
        for (Sensor sensor : listaSensores) {
            System.out.println("\n------------------------------------------------");
            System.out.println("Dispositivo: " + sensor.modelo + " (" + sensor.fabricante + ")");
            
            // a) Invocar encender() (Heredado de DispositivoElectronico)
            sensor.encender();
            
            // b) Invocar calibrar()
            sensor.calibrar();
            
            // c) Invocar leerValor() (Método polimórfico)
            double lectura = sensor.leerValor();
            
            // 4. Desplegar el resultado de la lectura de cada sensor
            // Usamos printf para redondear a 2 decimales y mostrar la unidad de medida
            System.out.printf("Resultado de la lectura: %.2f %s%n", lectura, sensor.unidadMedida);
        }
    }
}