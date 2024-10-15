public class Vehiculo{
    private int placa;
    private String marca;
    private String modelo;
    private int anio;
    private String color;
    private double capacidadMotor;
    private double capacidadTanque;
    private double velocidadMax;
    private String tipoTransmision;
    private double precio;
    private String estado;

    // Constructor
    public Vehiculo (int placa, String marca, String modelo, int anio, String color, double capacidadMotor, double capacidadTanque, double velocidadMax, String tipoTransmision, double precio, String estado){
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.color = color;
        this.capacidadMotor = capacidadMotor;
        this.capacidadTanque = capacidadTanque;
        this.velocidadMax = velocidadMax;
        this.tipoTransmision = tipoTransmision;
        this.precio = precio;
        this.estado = estado;
    }

    // Getters and Setters
    public int getPlaca() {
		return this.placa;
	}

	public void setPlaca(int placa) {
		this.placa = placa;
	}

	public String getMarca() {
		return this.marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return this.modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAnio() {
		return this.anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public String getColor() {
		return this.color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getCapacidadMotor() {
		return this.capacidadMotor;
	}

	public void setCapacidadMotor(double capacidadMotor) {
		this.capacidadMotor = capacidadMotor;
	}

	public double getCapacidadTanque() {
		return this.capacidadTanque;
	}

	public void setCapacidadTanque(double capacidadTanque) {
		this.capacidadTanque = capacidadTanque;
	}

	public double getVelocidadMax() {
		return this.velocidadMax;
	}

	public void setVelocidadMax(double velocidadMax) {
		this.velocidadMax = velocidadMax;
	}

	public String getTipoTransmision() {
		return this.tipoTransmision;
	}

	public void setTipoTransmision(String tipoTransmision) {
		this.tipoTransmision = tipoTransmision;
	}

	public double getPrecio() {
		return this.precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getEstado() {
		return this.estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
}