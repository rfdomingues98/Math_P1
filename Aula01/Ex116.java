import java.util.*;
public class Ex116 {
	
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		final int dias = 4;
		System.out.println("Quanto gastou o turista no primeiro dia?");
		double d1 = sc.nextDouble();
		double d2 = d1 + (d1*0.2);
		double d3 = d2 + (d2*0.2);
		double d4 = d3 + (d3*0.2);
		
		System.out.printf("%4.2f - %4.2f - %4.2f - %4.2f\n", d1, d2, d3, d4);
		
		double media = (d1+d2+d3+d4)/4;
		
		System.out.printf("Em média, o turista gastou %4.2f€ por dia.", media);
	}
}

