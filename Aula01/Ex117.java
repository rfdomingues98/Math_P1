import java.util.*;
public class Ex117 {
	
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Valor dos produtos: ");
		double prod = sc.nextDouble();
		System.out.println("Valor dos descontos(%): ");
		double desc = sc.nextDouble();
		System.out.println("Taxa do IVA(%): ");
		double iva = sc.nextDouble();
		
		desc = toPercent(desc);
		iva = toPercent(iva);
		
		System.out.printf("%.3f", desc);
	}
	
	public static double toPercent(double tax) {
		return tax/100;
	}
}

