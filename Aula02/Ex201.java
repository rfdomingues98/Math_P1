import java.util.*;
public class Ex201 {
	
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nota da TP1: ");
		double tp1 = sc.nextDouble();
		System.out.println("Nota da TP2: ");
		double tp2 = sc.nextDouble();
		System.out.println("Nota da API: ");
		double api = sc.nextDouble();
		System.out.println("Nota da EP: ");
		double ep = sc.nextDouble();
		
		double notaf = (tp1*0.10)+(tp2*0.10)+(api*0.3)+(ep*0.5);
		
		if(notaf >= 9.5) {
			System.out.println("Aprovado");
		} else {
			System.out.println("Reprovado");
		}
	}
}
