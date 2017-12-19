import java.io.*;
import java.util.*;

public class Ex702{
	static Scanner sc = new Scanner(System.in);
	static final int maxSize = 50;
	static int[] array = new int[0];
	static int[] newArray = new int[0];
	static boolean isValid = false;
	static File validFile;
	static File fOut;
	static String fileName;

	public static void main(String[] args) throws IOException{
		fileName = args[0];
		validateFile(fileName);
		menu();
	}
	public static void menu() throws IOException{
		clrscr();
		int op = 0;
		System.out.println("Análise de uma sequência de números inteiros");
		System.out.println("1 - Ler a sequência");
		System.out.println("2 - Escrever a sequência");
		System.out.println("3 - Calcular o máximo da sequência");
		System.out.println("4 - Calcular o mínimo da sequência");
		System.out.println("5 - Calcular a média da sequência");
		System.out.println("6 - Detetar se é uma sequência só constituída por números pares");
		System.out.println("7 - Ler uma sequência de números de um ficheiro de texto");
		System.out.println("8 - Adicionar números à sequência existente");
		System.out.println("9 - Gravar a sequência atual de número num ficheiro");
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
			case 7:
				readFileSequence();
			case 8:
				addToSequence();
			case 9:
				saveToFile(fileName);
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
	public static void readSequence() throws IOException{
		int n, l = 0;
		array = new int[maxSize];
		for(int i = 0; i < array.length; i++){
			System.out.printf("Número %d: \n", i+1);
			n = sc.nextInt();
			
			if(n < 0){
				break;
			} else {
				l++;
				if(i == 49){
					System.out.println("Limite atingido! (50 números)");
					array[i] = n;
					break;
				} else {
					array[i] = n;
				}
				
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

	public static void writeSequence() throws IOException{
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

	public static void maxArray() throws IOException{
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

	public static void minArray() throws IOException{
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

	public static void medArray() throws IOException{
		int i = 0;
		double sum = 0, medArray = 0;
		for(i = 0; i < newArray.length; i++){
			sum += newArray[i];
		}
		//i = i - 1;
		medArray = sum/i;

		System.out.printf("A média da sequência é %4.2f \n", medArray);

		System.out.printf("\nPress any key to continue...\n");
		try{
			System.in.read();	
		} catch(Exception e){
			System.out.println("Error!");
		}
		menu();

	}

	public static void isOdd() throws IOException{
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

	public static void validateFile(String name){
		isValid = false;
		String fileName = name;
		File file = new File(fileName);
		if(!file.isFile()){
			System.out.println("ERROR: That is not a valid file.");
		} else if(!file.canRead()){
			System.out.println("ERROR: Cannot read file.");
		} else {
			isValid = true;
			validFile = file;
		}
	}

	public static void readFileSequence() throws IOException {
		if(isValid == true){
			Scanner scf = new Scanner(validFile);
			int count = 0;
			while(scf.hasNext()){
				count++;
				scf.nextInt();
			}
			scf.close();
			scf = new Scanner(validFile);
			int i = 0;
			newArray = new int[count];
			while(scf.hasNext()){
				int num = Integer.parseInt(scf.next());
				newArray[i] = num;
				i++;
			}
			scf.close();
		}

		System.out.printf("\nPress any key to continue...\n");
		try{
			System.in.read();	
		} catch(Exception e){
			System.out.println("Error!");
		}
		menu();
	}

	public static void addToSequence() throws IOException {
		// if(newArray.length >= maxSize) {
		// 	System.out.println("A sequência já tem o tamanho máximo!");
		// } else {
		// 	int numToAdd = maxSize - newArray.length;
		// 	int n, l = 0;
		// 	System.out.printf("Quantos números quer introduzir? (Máx. %d números)\n", numToAdd);
		// 	l = sc.nextInt();
		// 	if(l > numToAdd || l <= 0){
		// 		System.out.println("Número inválido!");
		// 	} else {
		// 		newArray = new int[l];
		// 		for(int i = 0; i < l; i++){
		// 			System.out.printf("Número %d (termina com negativo): \n", i+1);
		// 			n = sc.nextInt();
		// 			if(n < 0){
		// 				l = i;
		// 				break;
		// 			} else {
		// 				newArray[i] = n;
		// 			}
		// 		}
		// 	}
		// }
		

		System.out.printf("\nPress any key to continue...\n");
		try{
			System.in.read();	
		} catch(Exception e){
			System.out.println("Error!");
		}
		menu();
	}

	public static void saveToFile(String name) throws IOException{
		String fileName = name;
		fOut = new File(fileName);
		PrintWriter pw = new PrintWriter(fOut);
		for(int i = 0; i < newArray.length; i++){
			int n = newArray[i];
			pw.println(n);
		}
		pw.close();

		System.out.printf("\nPress any key to continue...\n");
		try{
			System.in.read();	
		} catch(Exception e){
			System.out.println("Error!");
		}
		menu();
	}

	public static void clrscr(){
		System.out.print("\033[H\033[2J");
	}
}

