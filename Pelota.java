package geometria;

public class Pelota extends Esfera {
	private String marca;
	private int cantidad;

	public Pelota(Segmento radio, String marca, int cantidad) {
		super(radio);
		this.marca = marca;
		this.cantidad = cantidad;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	public double getVolumenTotal(){
		double volumen;
		volumen=getArea()*getRadio().getDistance()/3*cantidad;
		return volumen;	
	}
}
