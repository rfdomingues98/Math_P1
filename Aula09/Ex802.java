import java.util.*;
public class Ex802{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int c = 0;
		double soma = 0;
		Ponto2D o = new Ponto2D();
		o.x = 0;
		o.y = 0;
		Ponto2D a = new Ponto2D();
		Ponto2D b = new Ponto2D();
		do{
			a = lerPonto();
			c++;
			soma += distAB(a,o);
			if(distAB(a,o) > distAB(b,o)){
				b = a;
			}
		} while((a.x != 0) || (a.y != 0));
		c--;
		System.out.printf("A soma das distâncias dos %d pontos à origem é %.1f\n", c, soma);
		System.out.print("O ponto mais afastado da origem foi: ");
		escreverPonto(b);
	}

	public static Ponto2D lerPonto(){
		Ponto2D p = new Ponto2D();
		System.out.println("Introduza um ponto:");
		System.out.print("Coordenada X: ");
		p.x = sc.nextDouble();
		System.out.print("Coordenada Y: ");
		p.y = sc.nextDouble();
		return p;
	}

	public static void escreverPonto(Ponto2D p){
		System.out.printf("(%2.1f, %2.1f)\n", p.x, p.y);
	}

	public static double distAB(Ponto2D a, Ponto2D b){
		double dist = Math.sqrt(Math.pow((b.x - a.x), 2) + Math.pow((b.y - a.y), 2));
		return dist;
	}
}

class Ponto2D{
	double x;
	double y;
}