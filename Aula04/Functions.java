/**
 * Function - Define several functions, and test them.
 * 
 * Nesta classe deve definir novas funções e testá-las na função main.
 * 
 * 
 **/
import java.util.*; 
public class Functions {
	static Scanner sc = new Scanner(System.in);
	public static void main (String args[]) {
		
		// Testar função sqr:
		System.out.printf("sqr(%f) = %f\n", 10.1, sqr(10.1));
		System.out.printf("sqr(%f) = %f\n", -2.0, sqr(-2.0));
	
		// Invoque as funções pedidas no enunciado para as testar:
		// Por exemplo, para testar func f (problema 5.2):
		//System.out.printf("f(%d) = %f\n", 5, f(5));

		// Testar as restantes funções desenvolvidas
		//System.out.printf("max(%f,%f) = %f\n", 3.1, 5.2, max(3.1, 5.2));
		//System.out.printf("max(%d,%d) = %d\n", 3, 2, max(3, 2));
		//int ano = getIntPos("Ano? ");
		//System.out.printf("ano = %d\n", ano);
	
	}
	/**
	 * sqr - calcula o quadrado de um número (real).
	 * (A classe Math tem uma função para a raiz quadrada, sqrt,
	 * mas falta-lhe uma para o quadrado: sqr colmata essa lacuna!)
	 **/
	public static double sqr(double x) {
		double y;	// variavel para resultado
		y = x*x;	// calculo do resultado a partir dos dados
		return y;	// devolver o resultado
	}
	
	// Defina as funções pedidas no enunciado:
	public static double f(int n){
		double y;
		y = 1/(1+sqr(n));
		return y;
	}
	public static double max(double n1, double n2) {
		double res;
		res = (n1>n2) ? n1 : n2;
		return res;
	}
	public static int max(int n1, int n2) {
		int res;
		res = (n1>n2) ? n1 : n2;
		return res;
	}
	public static double poly3(double a, double b, double c, double d, double x){
		double res = a*Math.pow(x, 3) + b*sqr(x) + c*x + d;
		return res;
	}
	public static int fact(int n){
		int f = 1;
		for(int i = 0; i < n; i++){
			f *= i;
		}
		return f;
	}
	public static int getIntPos(String msg){
		int n;
		do{
			System.out.println(msg);
			n = sc.nextInt();
		} while (n < 0);
		return n;
	}
	public static int getIntRange(int a, int b, String msg){
		int n;
		do{
			System.out.println(msg);
			n = sc.nextInt();
		} while (n < a || n > b);
		return n;
	}
	public static void printNtimes(int n, String msg){
		for (int i = 0; i < n; i++){
			System.out.print(msg);
		}
	}
}
