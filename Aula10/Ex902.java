import java.util.*;

public class Ex902{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		String text = new String();
		do{
			System.out.println("Introduza o nome: ");
			text = sc.nextLine();
			acronimo(text);
		} while (!text.isEmpty());
		
	}

	public static void acronimo(String text){
		String acronimo = new String();
		char current;
		for(int i = 0; i < text.length(); i++){
			current = text.charAt(i);
			if(Character.isUpperCase(current)){
				acronimo += current;
			}
		}
		System.out.println(acronimo);
	}
}