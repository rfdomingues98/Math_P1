import java.io.*;
import java.util.*;
public class Ex705{
	static Scanner sc = new Scanner(System.in);
	static File validFile;
	static File fOut;
	static boolean isValid = false;

	public static void main(String[] args) throws IOException{
		System.out.println("Introduza o nome do ficheiro inicial: ");
		String fileName = sc.next();
		validateFile(fileName);
		System.out.println("Introduza o nome do novo ficheiro: ");
		fileName = sc.next();
		readFile(fileName);

	}

	public static void validateFile(String name) throws IOException{
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

	public static void readFile(String name) throws IOException{
		Scanner scf = new Scanner(validFile);
		fOut = new File(name);
		PrintWriter pw = new PrintWriter(fOut);
		int c = 0;
		while(scf.hasNext()){
			scf.next();
			c++;
		}
		scf.close();
		scf = new Scanner(validFile);
		while(scf.hasNext()){
			//if(!scf.next().startsWith("//")){
				// if(scf.next() == System.getProperty("line.separator")){
				// 	pw.println();
				// } else {
				// 	pw.print(scf.next());
				// }
				pw.print(scf.next());
				pw.println();
			//}
		}
		pw.close();
		scf.close();
	}
}