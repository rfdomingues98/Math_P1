import java.util.*;
public class Ex602{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduza uma sequencia de números positivos (para com negativo): ");
		int[] array = new int[100];
		int n, l = 0;
		for(int i = 0; i < 100; i++){
			System.out.println("Número: ");
			n = sc.nextInt();
			if(n < 0){
				l = i;
				break;
			} else {
				array[i] = n;
			}
		}
		int[] newArray = new int[l];
		for(int i = 0; i < l; i++){
			newArray[i] = array[i];
		}
		array = null;
		System.out.println("Qual número quer contar? ");
		n = sc.nextInt();
		int count = 0;
		for(int i = 0; i < newArray.length; i++){
			if(newArray[i] == n){
				count += 1;
			}
		}
		System.out.printf("Introduziu o nº %d %d vezes.\n", n, count);
	}
}