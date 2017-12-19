import java.util.Scanner;

// Complete o programa
public class Ex803 {
	static final Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// Cria um registo de estatisticas:
		Statistics xstat = new Statistics();

		// Enquanto houver um valor para ler:
		while (sc.hasNextDouble()) {
			// Lê um valor:
			double x = sc.nextDouble();
			// Atualiza o registo de estatisticas:
			updateStats(xstat, x);
		}

		// Escreve resultados:
		System.out.printf("numero de valores = %d\n", xstat.num);
		System.out.printf("soma dos valores = %f\n", xstat.sum);
		System.out.printf("soma dos quadrados = %f\n", xstat.sum2);
		
		if (xstat.num > 0) {
			System.out.printf("min = %f\n", xstat.min);
			System.out.printf("max = %f\n", xstat.max);
			System.out.printf("média = %f\n", mean(xstat));
			System.out.printf("variancia = %f\n", variance(xstat));
		} else {
			System.out.printf("Lista vazia!\n");
		}
	}

	// Definir funções updateStats, mean e variance!
	public static void updateStats(Statistics stat, double b){
		stat.sum += b;
		stat.sum2 += Math.pow(b, 2);

		if(b > stat.max || stat.num == 0){
			stat.max = b;
		}
		if(b < stat.min || stat.num == 0){
			stat.min = b;
		}

		stat.num++;
	}

	public static double mean(Statistics stat){
		double mean;
		mean = stat.sum / stat.num;
		return mean;
	}

	public static double variance(Statistics stat){
		double mean;
		mean = mean(stat);
		double variance;
		variance = stat.sum2 / stat.num - Math.pow(mean, 2);
		return variance;
	}
}

class Statistics{
	int num;
	double max, min, sum, sum2;
}
