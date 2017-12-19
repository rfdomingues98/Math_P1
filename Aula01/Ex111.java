import java.util.*;

public class Ex111 {
	
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dólares: ");
		double usd = sc.nextDouble();
		System.out.println("Taxa de conversão: ");
		double tax = sc.nextDouble();
		double eur = usd*tax;
		
		System.out.printf("%4.1f USD = %4.1f EUR\n", usd, eur);
	}
}

