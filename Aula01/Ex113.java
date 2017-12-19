import java.util.*;
public class Ex113 {
	
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		final double scale = 100;
		double x1, x2, y1, y2;

		System.out.println("Cidade A (Coordenada X): ");
		x1 = sc.nextDouble();
		System.out.println("Cidade A (Coordenada Y): ");
		y1 = sc.nextDouble();
		System.out.println("Cidade B (Coordenada X): ");
		x2 = sc.nextDouble();
		System.out.println("Cidade B (Coordenada Y): ");
		y2 = sc.nextDouble();

		double dist = Math.sqrt(Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2));
		dist *= scale;
		
		System.out.printf("A distância entre as duas cidades é de %4.2f km.", dist);
	}
}

