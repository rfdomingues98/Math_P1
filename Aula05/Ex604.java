import java.util.*;
public class Ex604{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, l = 0, dim = 0;
		System.out.println("Quantas notas quer introduzir? (Máximo 50)");
		do{
			dim = sc.nextInt();
			if(dim < 0 || dim > 50){
				System.out.println("Número inválido! Entre 0 e 50.");
			}	
		} while(dim < 0 || dim > 50);
		
		int[] array = new int[dim];
		System.out.println("Introduza as notas <0-20> ");
		
		for(int i = 0; i < dim; i++){
			System.out.printf("%dª nota: ", i+1);
			do{
				n = sc.nextInt();
				if(n > 20 || n < 0){
					System.out.println("Nota inválida! Entre 0 e 20.");
				}
			} while(n > 20 || n < 0);
			
			array[i] = n;
		}
		System.out.println("Histograma de notas");
		System.out.println("-------------------------------------------------------");
		for(int i = 20; i >= 0; i--){
			if(i >= 10){
				System.out.printf("%d | ", i);
			} else {
				System.out.printf("0%d | ", i);
			}
			
			for(int j = 0; j < array.length; j++){
				if(array[j] == i){
					System.out.print("*");
				}

			}
			System.out.println();
		}
	}
}