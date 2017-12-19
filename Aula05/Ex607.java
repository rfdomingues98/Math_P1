import java.util.*;
public class Ex607{
	static int totalCount;
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

		duplicate(newArray);
	}

	public static void duplicate(int[] a){
		int j = 0, count, recount, temp;
		for(int i = 0; i < a.length; i++){
			count = 1;
			recount = 0;
			j = i + 1;
			while(j < a.length){
				if(a[i] == a[j]){
					count++;
				}
				j++;
			}
			if(count > 0){
				temp = a[i];
				for(int x = 0; x < i; x++){
					if(a[x] == temp){
						recount++;
					}
				}
				if(recount == 0){
					totalCount++;
					if(count > 1){
						System.out.println(+a[i]+" ocorre "+count+" vezes.");
					} else {
						System.out.println(+a[i]+" ocorre "+count+" vez.");
					}
					
				}
			}
		}
	}
}
