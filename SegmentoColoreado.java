package geometria;

public class SegmentoColoreado extends Segmento {
    private String color;

	public SegmentoColoreado(Punto p1, Punto p2, String color) {
		super(p1, p2);
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}
