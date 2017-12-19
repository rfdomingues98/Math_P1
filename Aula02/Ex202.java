import java.util.*;
public class Ex202 {
	
	public static void main (String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Primeiro número: ");
		double n1, n2;
		n1 = sc.nextDouble();
		System.out.println("Segundo número: ");
		n2 = sc.nextDouble();
		
		if(n1 > n2){
			System.out.println("O primeiro número é maior.");
		} else if(n1 == n2){
			System.out.println("Os números são iguais.");
		} else {
			System.out.println("O segundo número é maior.");
		}
		
	}
}

