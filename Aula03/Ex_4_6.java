import java.util.*;
public class Ex_4_6 {
	static Scanner sc = new Scanner(System.in);
	public static void main (String[] args) {
		int l, a, l1, a1;
		System.out.print("Introduza a largura:");
		l = sc.nextInt();
		System.out.print("Introduza a altura:");
		a = sc.nextInt();
		for(a1=1;a1<=a;a1++){
			for(l1=1;l1<=l;l1++){
				if(l1==l) System.out.println("*");
				else
				System.out.print("*");
			}
		}
	}
}

