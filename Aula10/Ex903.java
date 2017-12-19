import java.util.*;

public class Ex903{
	static Scanner sc = new Scanner(System.in);
	static String phrase;
	public static void main(String[] args) {
		System.out.println("Escreva uma frase: ");
		phrase = sc.nextLine();
		int c = countWords(phrase);
		System.out.printf("A frase tem %d palavras.\n", c);
	}

	public static int countWords(String phrase){
		char current;
		int c;
		if(phrase.length() == 0){
			c = 0;	
		} else {
			c = 1;
			boolean isOut = false;
			for(int i = 0; i < phrase.length(); i++){
				current = phrase.charAt(i);
				if(current == ' ' || current == '\t' || current == '\n'){
					isOut = true;
				} else {
					isOut = false;	
				} 
				if(isOut){
					c++;
				}
			}	
		}
		
		return c;
	}
}