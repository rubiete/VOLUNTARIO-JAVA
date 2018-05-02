package geometria;

public class PelotaGolf extends Pelota{
	private char tipo;
	private double densidad;
	
	public PelotaGolf(Segmento radio,Punto centro, String marca, int cantidad, char tipo, double densidad) {
		super(radio,centro, marca, cantidad);
		this.tipo = tipo;
		this.densidad = densidad;
	}


	public char getTipo() {
		return tipo;
	}

	public void setTipo(char tipo) {
		this.tipo = tipo;
	}
	public double getDensidad() {
		return densidad;
	}

	public void setDensidad(int densidad) {
		this.densidad = densidad;
	}
	public double getPeso() {
		double peso;
		peso= getVolumen()*densidad;
		return peso;
	}
	public double getPesoTotal() {
		double peso;
		peso= getPeso()*getCantidad();
		return peso;
	}
}
