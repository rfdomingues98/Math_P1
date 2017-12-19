import java.util.*;
public class Ex109 {
	
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduza a medida da base menor do retângulo: ");
		double l1 = sc.nextDouble();
		System.out.println("Introduza a medida da base maior do retângulo: ");
		double l2 = sc.nextDouble();
		double p, a;
		p = l1 + l1 + l2 + l2;
		a = l1*l2;
		System.out.printf("Perimetro: %2.2f ; Área: %2.2f \n", p, a);
	}
}

