import java.util.*;
public class Ex_4_3 {
	static Scanner sc = new Scanner(System.in);
	public static void main (String[] args) {
		int n, m, i, fact=1;
		System.out.print("Introduza um numero ate 10:");
		n = sc.nextInt();
		while(n > 10 || n < 1){
			System.out.print("Tente novamente:");
			n = sc.nextInt();		
		}
		for(i=1;i<=n;i++){	
			fact=fact*i;
			System.out.printf("%d! = %d\n", i, fact);
		}
	}	
}




