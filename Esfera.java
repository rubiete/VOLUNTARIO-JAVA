package geometria;

public class Esfera {
	private Segmento radio;
	private Punto centro;
	
	public Esfera(Segmento radio, Punto centro) {		
		this.radio = radio;
		this.centro = centro;
	}

	public Segmento getRadio() {
		return radio;
	}

	public void setRadio(Segmento radio) {
		this.radio = radio;
	}
	
	public Punto getCentro() {
		return centro;
	}

	public void setCentro(Punto centro) {
		this.centro = centro;
	}

	public double getArea(){
		double area;
		area=radio.getDistance()*radio.getDistance()*4*3.14159265359;
		return area;	
	}
	public double getVolumen(){
		double volumen;
		volumen=getArea()*radio.getDistance()/3;
		return volumen;	
	}
	
}
