import java.util.*;
public class Ex110 {
	
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Celsius: ");
		
		double c = sc.nextDouble();
		double f = 1.8 * c + 32;
		
		System.out.printf("%2.2f ºC = %2.2f ºF", c, f);
	}
}

