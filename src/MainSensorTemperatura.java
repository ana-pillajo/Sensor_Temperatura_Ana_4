public class MainSensorTemperatura {

    public static void main(String[] args) {

        // Crear los sensores (sin constructor con parámetros)
        SensorTemperatura sensor1 = new SensorTemperatura();
        SensorTemperatura sensor2 = new SensorTemperatura();

        // Asignar valores mediante métodos set
        sensor1.setIdSensor("S-001");
        sensor1.setValorActual(29.3);
        sensor1.setUnidad("°C");

        sensor2.setIdSensor("S-002");
        sensor2.setValorActual(69.9);
        sensor2.setUnidad("°F");

        // Mostrar lecturas
        System.out.println(" Lecturas de los sensores ");
        sensor1.mostrarLectura();
        sensor2.mostrarLectura();

        // Uso de los métodos get
        System.out.println("\nValor del sensor 1 : " + sensor1.getValorActual() + " " + sensor1.getUnidad());
    }
}