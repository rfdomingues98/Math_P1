import java.util.*;
public class Ex306{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introdura o número A: ");
		int a = sc.nextInt();
		System.out.println("Introdura o número B: ");
		int b = sc.nextInt();
		int r, mdc = 0;
		//Torna a>b caso não o seja
		if(b>a){
			int c;
			c = a;
			a = b;
			b = c;
		}
		
		do{
			r = a % b;	
			a = b;
			b = r;
		}while(b != 0);
		mdc = a;
		
		System.out.printf("O máximo divisor comum é %d\n", mdc);
	}
}