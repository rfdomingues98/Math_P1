import java.util.*;
public class Ex301{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0;
		for(int i = 0; i >= 0;){
			System.out.println("Introduza um número: ");
			i = sc.nextInt();
			n++;
		}
		System.out.printf("Introduziu %d números.\n", n);
	}
}