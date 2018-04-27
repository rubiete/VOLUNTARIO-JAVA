package geometria;

public class ManejaCuadrado {
	public static void main(String args[]){
		Punto a,b;
		Segmento ab;
		a=new Punto(2,3,'A');
		b=new Punto(3,1,'B');
		ab=new Segmento(a,b);
		Cuadrado miBonitoCuadradito;
		miBonitoCuadradito=new Cuadrado(ab);
		
		System.out.println("El cuadrado tiene un area de "+miBonitoCuadradito.getArea());
	}
}
