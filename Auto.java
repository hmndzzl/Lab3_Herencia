public class Auto extends Vehiculo {
    private int noPuertas;
    private double tamanioRuedas;
    private double capacidadMaletero;


    // Constructor 
    public Auto(int placa, String marca, String modelo, int anio, String color, double capacidadMotor, double capacidadTanque, double velocidadMax, String tipoTransmision, double precio, String estado,
		int noPuertas, double tamanioRuedas, double capacidadMaleter) {
        super(placa, marca, modelo, anio, color, capacidadMotor, capacidadTanque, velocidadMax, tipoTransmision, precio, estado);
        this.noPuertas = noPuertas;
        this.tamanioRuedas = tamanioRuedas;
        this.capacidadMaletero = capacidadMaleter;
    }

    // Setters & Getters
    public int getNoPuertas() {
		return this.noPuertas;
	}

	public void setNoPuertas(int noPuertas) {
		this.noPuertas = noPuertas;
	}

	public double getTamanioRuedas() {
		return this.tamanioRuedas;
	}

	public void setTamanioRuedas(double tamanioRuedas) {
		this.tamanioRuedas = tamanioRuedas;
	}

	public double getCapacidadMaletero() {
		return this.capacidadMaletero;
	}

	public void setCapacidadMaletero(double capacidadMaletero) {
		this.capacidadMaletero = capacidadMaletero;
	}
}
