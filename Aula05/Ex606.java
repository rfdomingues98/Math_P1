import java.util.*;
public class Ex606{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escreva uma frase: ");
		String f = sc.nextLine();
		int fSize = f.length();
		char[] array = new char[fSize];
		//array[0] = f.charAt(0);
		boolean exists = false;
		for(int i = 0; i < fSize; i++){
			exists = false;
			for(char c : array){	
				if(c == f.charAt(i)){
					exists = true;
				}
			}	
			if(exists == false){
				for(int k = 0; k < fSize; k++){
					if(array[k] == 0){
						if(f.charAt(i) != ' '){
							array[k] = f.charAt(i);
							break;	
						}
					}
				}
			}
		}

		System.out.println("As letras contidas na frase são as seguintes:");
		for(int i = 0; i < array.length; i++){
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
}