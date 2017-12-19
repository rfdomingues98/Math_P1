import java.util.*;
public class Ex305{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean opValid = false;
		int n;
		do{
			System.out.println("Introduza um número inteiro positivo: ");
			n = sc.nextInt();
			if(n>0){
				opValid = true;
			}
		}while (opValid == false);
		boolean notPrime = false;
		for(int i = 1; i < n; i++){
			if(n % i == 0){
				if(i != 1 && i != n){
					notPrime = true;
					break;
				}
			}
		}
		if(notPrime == true){
			System.out.printf("O número %d não é primo.\n", n);	
		} else {
			System.out.printf("O número %d é primo.\n", n);	
		}
	}
}