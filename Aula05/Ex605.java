import java.util.*;
public class Ex605{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, l = 0, dim = 0;
		System.out.println("Quantos números quer introduzir?");
		do{
			dim = sc.nextInt();
			if(dim < 0){
				System.out.println("Número inválido!");
			}	
		} while(dim < 0);
		int[] array = new int[dim];
		System.out.println("Introduza os números:");
		
		for(int i = 0; i < dim; i++){
			System.out.printf("%dº número: ", i+1);
			n = sc.nextInt();
			array[i] = n;
		}
		double media = media(array, dim);
		double desvio = desvio(array, dim, media);
		System.out.printf("Média: %4.2f\n", media);
		System.out.printf("Desvio padrão: %4.2f\n", desvio);
		System.out.println("Números maiores que a média");
		System.out.println("-----------------------------------------------------");
		for(int i = 0; i < dim; i++){
			if(array[i] > media){
				System.out.println(array[i]);
			}
		}
	}

	public static double media(int[] array, int n){
		int sum = 0;
		double count = n;
		for(int i = 0; i < n; i++){
			sum += array[i];
		}
		double media = sum/count;
		return media;
	}

	public static double desvio(int[] array, int n, double media){
		int var = 0;
		for(int i = 0; i < n; i++){
			var += Math.pow(array[i] - media, 2);
		}
		var = var/(n-1);
		double desvio = Math.sqrt(var);
		return desvio;
	}
}