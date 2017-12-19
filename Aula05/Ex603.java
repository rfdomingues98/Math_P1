import java.util.*;
public class Ex603{

	static Scanner sc = new Scanner(System.in);
	static final int maxSize = 50;
	static int[] array;
	static int[] newArray;

	public static void main(String[] args) {
		menu();
	}
	public static void menu(){
		clrscr();
		int op = 0;
		System.out.println("Análise de uma sequência de números inteiros");
		System.out.println("1 - Ler a sequência");
		System.out.println("2 - Escrever a sequência");
		System.out.println("3 - Calcular o máximo da sequência");
		System.out.println("4 - Calcular o mínimo da sequência");
		System.out.println("5 - Calcular a média da sequência");
		System.out.println("6 - Detetar se é uma sequência só constituída por números pares");
		System.out.println("10 - Terminar o programa");
		System.out.print("Opção -> ");
		op = sc.nextInt();
		System.out.println("");

		switch(op) {
			case 1:
				readSequence();
			case 2:
				writeSequence();
			case 3:
				maxArray();
			case 4:
				minArray();
			case 5:
				medArray();
			case 6:
				isOdd();
			case 10:
				System.exit(0);
			default:
				System.out.println("Opção inválida.");
				System.out.printf("\nPress any key to continue...\n");
				try{
					System.in.read();	
				} catch(Exception e){
					System.out.println("Error!");
				}
				menu();
		}
	}
	public static void readSequence(){
		int n, l = 0;
		array = new int[50];
		for(int i = 0; i < 50; i++){
			System.out.println("Número: ");
			n = sc.nextInt();
			if(n <= 0){
				l = i;
				break;
			} else {
				array[i] = n;
			}
		}
		newArray = new int[l];
		for(int i = 0; i < l; i++){
			newArray[i] = array[i];
		}
		array = null;

		System.out.println("Press any key to continue...");
		try{
			System.in.read();	
		} catch(Exception e){
			System.out.println("Error!");
		}
		menu();
	}

	public static void writeSequence(){
		for(int i = 0; i < newArray.length; i++){
			System.out.print(newArray[i] + " ");
		}

		System.out.printf("\nPress any key to continue...\n");
		try{
			System.in.read();	
		} catch(Exception e){
			System.out.println("Error!");
		}
		menu();
	}

	public static void maxArray(){
		int maxArray = newArray[0];
		for(int i = 0; i < newArray.length; i++){
			if(newArray[i] > maxArray){
				maxArray = newArray[i];
			}
		}

		System.out.printf("O máximo da sequência é %d\n", maxArray);

		System.out.printf("\nPress any key to continue...\n");
		try{
			System.in.read();	
		} catch(Exception e){
			System.out.println("Error!");
		}
		menu();
	}

	public static void minArray(){
		int minArray = newArray[0];
		for(int i = 0; i < newArray.length; i++){
			if(newArray[i] < minArray){
				minArray = newArray[i];
			}
		}

		System.out.printf("O minimo da sequência é %d\n", minArray);

		System.out.printf("\nPress any key to continue...\n");
		try{
			System.in.read();	
		} catch(Exception e){
			System.out.println("Error!");
		}
		menu();
	}

	public static void medArray(){
		int i = 0;
		double sum = 0, medArray = 0;
		for(i = 0; i < newArray.length; i++){
			sum += newArray[i];
		}
		//i = i - 1;
		medArray = sum/i;

		System.out.printf("A média da sequência é %f \n", medArray);

		System.out.printf("\nPress any key to continue...\n");
		try{
			System.in.read();	
		} catch(Exception e){
			System.out.println("Error!");
		}
		menu();

	}

	public static void isOdd(){
		boolean isOdd = true;
		for(int i = 0; i < newArray.length; i++){
			if(!(newArray[i] % 2 == 0)){
				isOdd = false;
				break;
			}
		}

		if(isOdd == false){
			System.out.println("A sequência não é constituida apenas por números pares!");
		} else {
			System.out.println("A sequência é constituida apenas por números pares!");
		}
		
		System.out.printf("\nPress any key to continue...\n");
		try{
			System.in.read();	
		} catch(Exception e){
			System.out.println("Error!");
		}
		menu();
	}

	public static void clrscr() {
   		System.out.print("\033[H\033[2J");
	}
}

