import java.util.*;
public class Ex304{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Tenta acertar o número (1 a 100): ");
		int secret = (int)(100*(Math.random()) + 1);
		System.out.println(secret);
		int n;
		do {
			n = sc.nextInt(); 
			if (n == secret){
				System.out.println("Acertou!");
			} else if (n > secret) {
				System.out.println("Demasiado alto!");
			} else if (n < secret){
				System.out.println("Demasiado baixo!");
			}

		} while(n != secret);
	}
}