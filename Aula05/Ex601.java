import java.util.*;
public class Ex601{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantos nºs quer introduzir? ");
		int n = sc.nextInt();
		int[] array = new int[n];
		
		for (int i = 0; i < n; i++){
			System.out.println("Numero: ");
			array[i] = sc.nextInt();
		}
		
		for (int i = array.length - 1; i >= 0; i--){
			System.out.println(array[i]);
		}
	}
}