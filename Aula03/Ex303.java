import java.util.*;
public class Ex303{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduza uma lista de números (terminada com o 1º introduzido): ");
		float f, num, max, min, m;
		int c;
		boolean isFirst = false;
		num = sc.nextFloat();
		f = num;
		max = num;
		min = num;
		m = num;
		c = 1;
		do{
			System.out.println("Introduza uma lista de números (terminada com o 1º introduzido): ");
			num = sc.nextFloat();
			max = (num > max) ? num : max;
			min = (num < min) ? num : min;
			c++;
			m += num;
		} while (num != f);
		m /= c; 
		System.out.printf("Máximo = %4.2f\n", max);
		System.out.printf("Minimo = %4.2f\n", min);
		System.out.printf("Média = %4.2f\n", m);
		System.out.printf("Nº de elementos = %d\n", c);
	}
}