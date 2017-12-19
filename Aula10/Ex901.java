import java.util.*;

public class Ex901{
	static Scanner sc = new Scanner(System.in);
	static int upper, lower, num, vowel, cons;
	static String text;
	public static void main(String[] args) {
		System.out.println("Análise de uma frase");
		System.out.print("Frase de entrada -> ");
		text = sc.nextLine();
		analyze(text);
		System.out.printf("Número de carateres minúsculos -> %d\n", lower);
		System.out.printf("Número de carateres maiúsculos -> %d\n", upper);
		System.out.printf("Número de carateres numéricos -> %d\n", num);
		System.out.printf("Número de vogais -> %d\n", vowel);
		System.out.printf("Número de consoantes -> %d\n", cons);
	}

	public static void analyze(String text){
		char current;
		for(int i = 0; i < text.length(); i++){
			current = text.charAt(i);
			if(Character.isUpperCase(current)){
				upper++;
			}
			if(Character.isLowerCase(current)){
				lower++;
			}
			if(Character.isDigit(current)){
				num++;
			}
			if(isVowel(Character.toLowerCase(current))){
				vowel++;
			}
			if((current >= 'A' && current <= 'Z') && !isVowel(Character.toLowerCase(current)) || (current >= 'a' && current <= 'z') && !isVowel(Character.toLowerCase(current))){
				cons++;
			}
		}
	}
	public static boolean isVowel(char c){
		if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
			return true;
		} else {
			return false;
		}
	}
}