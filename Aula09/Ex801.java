import java.util.Scanner;

public class Ex801 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Hora inicio = new Hora();  // tem de definir o novo tipo Hora!
		Hora fim = new Hora();
	
		
		inicio.h = 9;
		inicio.m = 23;
		inicio.s = 5;

		System.out.print("Começou às ");
		printHora(inicio);  // crie esta função!
		System.out.println(".");
		System.out.println("Quando termina?");
		fim = lerHora();  // crie esta função!
		System.out.print("Início: ");
		printHora(inicio);
		System.out.print(" Fim: ");
		printHora(fim);
		System.out.println();
	}

	public static void printHora(Hora hora){
		System.out.printf("%02d:%02d:%02d", hora.h, hora.m, hora.s);
	}

	public static Hora lerHora(){
		Hora fim = new Hora();
		do{
			System.out.println("Horas: ");
			fim.h = sc.nextInt();
		} while(fim.h < 0 || fim.h >= 24);
		do{
			System.out.println("Minutos: ");
			fim.m = sc.nextInt();
		} while(fim.m < 0 || fim.m >= 60);
		do{
			System.out.println("Segundos: ");
			fim.s = sc.nextInt();
		} while(fim.s < 0 || fim.s >= 60);
		return fim;
	}
}

class Hora {
	int h, m, s;
}