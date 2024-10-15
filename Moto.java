public class Moto extends Vehiculo {
    private String tipo;
    private double tamanioRuedas;

    // Constructor
    public Moto(int placa, String marca, String modelo, int anio, String color, double capacidadMotor, double capacidadTanque, double velocidadMax, String tipoTransmision, double precio, String estado,
        String tipo, double tamanioRuedas) {
        super(placa, marca, modelo, anio, color, capacidadMotor, capacidadTanque, velocidadMax, tipoTransmision, precio, estado);
        this.tipo = tipo;
        this.tamanioRuedas = tamanioRuedas;
    }

    // Setters & Getters
    public String getTipo() {
		return this.tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getTamanioRuedas() {
		return this.tamanioRuedas;
	}

	public void setTamanioRuedas(double tamanioRuedas) {
		this.tamanioRuedas = tamanioRuedas;
	}
}
