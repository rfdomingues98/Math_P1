import java.util.*;
public class Ex114 {
	
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Cateto A: ");
		double a = sc.nextDouble();
		System.out.println("Cateto B: ");
		double b = sc.nextDouble();
		double h = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
		double ang = Math.acos(b/h);
		//System.out.printf("Hipotenusa: %4.2f \nÂngulo: %4.2f", h, ((180*ang)/Math.PI));
		System.out.printf("Hipotenusa: %4.2f \nÂngulo: %4.2f", h, Math.toDegrees(ang));
	}
}

