import java.util.*;
public class Ex_4_4 {
	static Scanner sc = new Scanner(System.in);
	public static void main (String[] args) {
		double i, n, leib=1, d=3, soma=3.14159265359/4;
		System.out.print("Introduza o valor de N:");
		n = sc.nextDouble();
		for(i=1;i<n;i++){
			if(n==1)break;
			if(i%2!=0)
			leib=leib-(1/d);
			else
			leib=leib+(1/d);
			d=d+2;	
		}
		System.out.printf("O valor da soma dos N termos da serie de Leibnitz e %.15f e compara-se com %.15f", leib, soma);
	}
}

