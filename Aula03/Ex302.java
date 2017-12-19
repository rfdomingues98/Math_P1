import java.util.*;
public class Ex302{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduza uma lista de números (terminada com 0): ");
		float n, p = 1;
		do {
			n = sc.nextFloat();
			p = (n != 0) ? p*n : p;
		} while(n != 0);
		System.out.printf("Produto = %4.2f\n", p);
	}
}