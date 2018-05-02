package geometria;

public class PelotaBasket extends Pelota {
	private double velocidad;
	private int tiempo;
	
	public PelotaBasket(Segmento radio,Punto centro, String marca, int cantidad, double velocidad, int tiempo) {
		super(radio,centro, marca, cantidad);
		this.velocidad = velocidad;
		this.tiempo = tiempo;
	}
	
	public double getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(double velocidad) {
		this.velocidad = velocidad;
	}

	public int getTiempo() {
		return tiempo;
	}

	public void setTiempo(int tiempo) {
		this.tiempo = tiempo;
	}

	public double getEspacio() {
		double espacio;
		espacio= getVelocidad()*getTiempo();
		return espacio;
	}
}
