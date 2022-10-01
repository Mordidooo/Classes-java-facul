
public class meiodetransporte {

	public static void main(String[] args) {
		
		carro c1 = new carro();
		
		c1.nome = "Volkswagen";
		c1.marca = "gol";
		c1.ano = 2000;
		c1.vel = 68;
		
		c1.acelerar(10);
		
		System.out.println(c1.vel + "Km/h");
		
		c1.freiar(40);
		
		System.out.println(c1.vel + "Km/h");
		
moto m1 = new moto();
		
		m1.nome = "honda";
		m1.marca = "hornet";
		m1.ano = 2002;
		m1.vel = 55;
		
		m1.acelerar(10);
		
		System.out.println(m1.vel + "Km/h");
		
		m1.freiar(30);
		
		System.out.println(m1.vel + "Km/h");
		
	}

}
