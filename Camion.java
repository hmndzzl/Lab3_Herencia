public class Camion extends Vehiculo{
    private double capacidad;
    private int noEjes;
    private double tamanioRuedas;

    // Constructor
    public Camion(int placa, String marca, String modelo, int anio, String color, double capacidadMotor, double capacidadTanque, double velocidadMax, String tipoTransmision, double precio, String estado,
        double capacidad, int noEjes, double tamanioRuedas) {
        super(placa, marca, modelo, anio, color, capacidadMotor, capacidadTanque, velocidadMax, tipoTransmision, precio, estado);
        this.capacidad = capacidad;
        this.noEjes = noEjes;
        this.tamanioRuedas = tamanioRuedas;
    }

    // Setters & Getters
	public double getCapacidad() {
		return this.capacidad;
	}

	public void setCapacidad(double capacidad) {
		this.capacidad = capacidad;
	}

	public int getNoEjes() {
		return this.noEjes;
	}

	public void setNoEjes(int noEjes) {
		this.noEjes = noEjes;
	}

	public double getTamanioRuedas() {
		return this.tamanioRuedas;
	}

	public void setTamanioRuedas(double tamanioRuedas) {
		this.tamanioRuedas = tamanioRuedas;
	}

    //Métodos 

    public String info() {
        return super.info() + 
               ", Capacidad de carga: " + capacidad + " toneladas" + ", Número de ejes: " + noEjes + ", Tamaño de ruedas: " + tamanioRuedas + " pulgadas";
    }
}
