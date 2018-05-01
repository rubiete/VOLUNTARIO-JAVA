package geometria;

public class Esfera {
	private Segmento radio;
	
	public Esfera(Segmento radio) {
		this.radio = radio;
	}
	
	public Segmento getRadio() {
		return radio;
	}

	public void setRadio(Segmento radio) {
		this.radio = radio;
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
