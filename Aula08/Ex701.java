import java.io.*;
import java.util.*;

public class Ex701{
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		boolean isValid = false;
		do{
			System.out.println("Introduza o nome do ficheiro: ");
			String fileName = sc.nextLine();
			File file = new File(fileName);
			if(!file.isFile()){
				System.out.println("ERROR: That is not a valid file.");
			} else if(!file.canRead()){
				System.out.println("ERROR: Cannot read file.");
			} else {
				isValid = true;
				Scanner scf = new Scanner(file);
				while(scf.hasNextLine())
					System.out.println(scf.nextLine());
				scf.close();
			}
		} while(isValid == false);
	}
}