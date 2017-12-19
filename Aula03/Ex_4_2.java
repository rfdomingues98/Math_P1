import java.util.*;
public class Ex_4_2 {
	static Scanner sc = new Scanner (System.in);
	public static void main (String[] args) {
		int x, i;
		System.out.print("Introduza um numero inteiro entre 0 e 100:");
		x = sc.nextInt();
		if(x<0 || x>100)
			do{ 
			System.out.print("Introduza um número correto:");
			x = sc.nextInt();
			}while(x<0 || x>100);
		else	
			System.out.print("-------------------\n");
			System.out.printf("  Tabuada dos %d\n", x);
			System.out.print("-------------------\n");
			for(i=1;i<=10;i++){
				System.out.printf("| %3d x  %3d |  %4d  |\n", x, i, x*i);
			}
	}
}

