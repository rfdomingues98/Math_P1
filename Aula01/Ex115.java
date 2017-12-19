import java.util.*;
public class Ex115 {
	
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
		
		double notaf = (tp1*0.15)+(tp2*0.15)+(api*0.3)+(ep*0.4);
		
		System.out.printf("A nota final do aluno é de %4.2f valores.\n", notaf);
	}
}

