public class SensorTemperatura {

    // Atributos privados
    private String idSensor;
    private double valorActual;
    private String unidad;

    // Get y Set de idSensor
    public String getIdSensor() {
        return idSensor;
    }

    public void setIdSensor(String idSensor) {
        this.idSensor = idSensor;
    }

    // Get y Set de valorActual
    public double getValorActual() {
        return valorActual;
    }

    public void setValorActual(double valorActual) {
        this.valorActual = valorActual;
    }

    // Get y Set de unidad
    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    // Metodo utilitario para mostrar la lectura

    public void mostrarLectura() {
        System.out.println("Sensor: " + idSensor + " | Lectura: " + valorActual + " " + unidad);
    }
}