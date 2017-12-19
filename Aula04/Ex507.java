import java.util.*;
public class Ex507{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introdura o número A: ");
		int a = sc.nextInt();
		System.out.println("Introdura o número B: ");
		int b = sc.nextInt();
		int res = mdc(a,b);
		System.out.printf("O máximo divisor comum é %d\n", res);
	}
	
	public static int mdc(int a, int b){
		while (b != 0){
			double q = a / b;
	    	double r = a % b;
	       	a = b;
	       	b = (int)r;
		}
		return a;
	}
}