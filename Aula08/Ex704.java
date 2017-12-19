import java.util.*;
import java.io.*;
public class Ex704{
	static Scanner sc = new Scanner(System.in);
	static boolean isValid = false;
	static File validFile;
	static int[] array;

	public static void main(String[] args) throws IOException{
		populateArray();

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

	public static void validateFile(){
		System.out.println("Introduza o nome do ficheiro: ");
		String name = sc.next();
		File file = new File(name);
		if(!file.isFile()){
			System.out.println("Erro! Ficheiro inválido!");
		} else if(!file.canRead()){
			System.out.println("Erro! Impossivel ler ficheiro!");
		} else {
			isValid = true;
			validFile = file;
		}
	}

	public static void populateArray() throws IOException{
		validateFile();
		if(isValid = true){
			Scanner scf = new Scanner(validFile);
			int c = 0;
			while(scf.hasNext()){
				scf.nextLine();
				c++;
			}
			scf.close();
			scf = new Scanner(validFile);
			array = new int[c];
			for(int i = 0; i < c; i++){
				array[i] = Integer.parseInt(scf.nextLine());
			}
		}
	}
}