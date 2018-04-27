package geometria;

public class Cuadrado {
	private Segmento lado;

	public Cuadrado(Segmento lado) {
				this.lado = lado;
	}

	public Segmento getLado() {
		return lado;
	}

	public void setLado(Segmento lado) {
		this.lado = lado;
	}
	public double getArea(){
		double area;
		area=lado.getDistance()*lado.getDistance();
		return area;	
}
}