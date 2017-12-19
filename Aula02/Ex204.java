import java.util.*;
public class Ex204{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Mês (minusculas e sem acentos): ");
		String m = sc.next();
		System.out.println("Ano: ");
		int y = sc.nextInt();
		
		boolean isLeap = false;
		if(y % 400 == 0) {
			isLeap = true;
		} else if((y % 4 == 0) && (y % 100 != 0)) {
			isLeap = true;
		} else {
			isLeap = false;
		}

		switch(m){
			case "janeiro": case "março": case "maio": case "julho": case "agosto": case "outubro": case "dezembro":
				System.out.println("Mês tem 31 dias.");
				break;
			case "abril": case "junho": case "setembro": case "novembro":
				System.out.println("Mês tem 30 dias.");
				break;
			case "fevereiro":
				if (isLeap == true){
					System.out.println("Mês tem 29 dias.");
				} else {
					System.out.println("Mês tem 28 dias.");
				}
				break;
			default:
				System.out.println("Data inválida");
		}
	}
}