package geometria;

public class ManejaEsferas {
	public static void main(String args[]){
		Punto a,b,c,d,e,f;
		Segmento ab,cd,ef;
		
		a=new Punto(2,3,'A');
		b=new Punto(3,1,'B');
		ab=new Segmento(a,b);
		Esfera bola;
		bola=new Esfera(ab);
		
		System.out.println("La esfera tiene un radio "+ab.getDistance()+" cm");
		System.out.println("La esfera tiene un area de "+bola.getArea()+" cm2");
		System.out.println("La esfera tiene un volumen de "+bola.getVolumen()+" cm3");
		
		c= new Punto(1,1,'C');
		d=new Punto(2,2,'D');
		cd=new Segmento(c,d);
		PelotaGolf golfball;
		golfball=new PelotaGolf(cd,"nike",5,'k',1.23);
		
		System.out.println("La pelota de golf tiene las siguientes características: marca "+golfball.getMarca()+", tipo "+golfball.getTipo()+ " y tiene una densidad de "+golfball.getDensidad()+" gramos/cm3");
		System.out.println("La pelota de golf tiene un radio "+cd.getDistance()+" cm");
		System.out.println("La pelota de golf tiene un area de "+golfball.getArea()+" cm2");
		System.out.println("Una pelota de golf tiene un volumen de "+golfball.getVolumen()+" cm3");
		System.out.println("Una pelota de golf tiene un peso de "+golfball.getPeso()+" gramos");
		System.out.println("El volumen de las " +golfball.getCantidad()+ " pelotas de golf es "+golfball.getVolumenTotal()+" cm3");
		System.out.println("El peso de las " +golfball.getCantidad()+ " pelotas de golf es "+golfball.getPesoTotal()+" gramos");
		
		e=new Punto(0,0,'E');
		f=new Punto(0,12,'F');
		ef= new Segmento(e,f);
		PelotaBasket basketball;
		basketball= new PelotaBasket(ef,"puma",9,10.8,5);
		
		System.out.println("La pelota de basket tiene las siguientes características: marca "+basketball.getMarca());
		System.out.println("La pelota de basket tiene un radio "+ef.getDistance()+" cm");
		System.out.println("La pelota de basket tiene un area de "+basketball.getArea()+" cm2");
		System.out.println("Una pelota de basket tiene un volumen de "+basketball.getVolumen()+" cm3");
		System.out.println("El volumen de las " +basketball.getCantidad()+ " pelotas de golf es "+basketball.getVolumenTotal()+" cm3");
		System.out.println("Una pelota de basket lleva una velovidad de "+basketball.getVelocidad()+" metros/segundo");
		System.out.println("En " +basketball.getTiempo()+ " segundos, una pelota de basket recorre "+basketball.getEspacio()+" metros");
				
	}
	
}
