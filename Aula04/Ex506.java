import java.util.*;
public class Ex506{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Número (0-100): ");
		int n = getIntRange(0, 100, "Número inválido");
		int res;
		System.out.println("-------------------");
		String header;
		if(n>=10 && n < 100){
			System.out.printf("| Tabuada dos  %d |\n", n);
		} else if(n == 100) {
			System.out.printf("| Tabuada dos %d |\n", n);
		} else {
			System.out.printf("| Tabuada  dos  %d |\n", n);
		}
		System.out.println("-------------------");
		for(int i = 1; i<=10; i++){
			res = n * i;
			if(n>=10 && n < 100){
				System.out.printf("|  %d  x  %d  | %d |\n", n, i, res);
			} else if(n == 100) {
				System.out.printf("| %d x %d | %d |\n", n, i, res);
			} else {
				System.out.printf("|  %d  x %d | %d |\n", n, i, res);
			}
			
			//System.out.printf("%d x %d = %d\n", n, i, res);
		}

	}
	
	public static int getIntRange(int a, int b, String msg){
		int n;
		do{
			n = sc.nextInt();
			System.out.println(msg);
		} while (n < a || n > b);
		return n;
	}
}