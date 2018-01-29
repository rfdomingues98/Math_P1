import java.util.*;
import java.io.*;

public class Pilotos {
	static Scanner sc = new Scanner(System.in);
	static final int maxPilots = 10;

	public static void main(String[] args) {
		int op;
		Piloto[] p = new Piloto[maxPilots];

		do{
			op = menu();
			switch(op){
				case 1:
					addPilots(p);
					break;
				case 2:
					SortByCarNum(p);
					break;
				case 3:
					editPilot(p);
					break;
				case 4:
					deleteByCarNum(p);
					break;
				case 5:
					SortByName(p);
					break;
				case 6:
					deleteByName(p);
					break;
				case 7:
					validatePlates(p);
					break;
				case 8:
					System.out.println("A terminar . . .");
					break;
				default:
					System.out.println("Opção inválida");
					break;
			}
		} while(op != 8);
	}

	public static int menu() {
		System.out.println("Gestão de uma prova automóvel:");
		System.out.println("1 - Inserir informação dos pilotos");
		System.out.println("2 - Listar pilotos ordenados pelo número da viatura");
		System.out.println("3 - Alterar informação de um piloto");
		System.out.println("4 - Remover piloto com base no número da viatura");
		System.out.println("5 - Listar pilotos ordenados pelo nome");
		System.out.println("6 - Remover piloto(s) com base no nome");
		System.out.println("7 - Validar matriculas");
		System.out.println("8 - Terminar o programa");
		System.out.println("Opção -> ");
		return sc.nextInt();
	}

	public static int addPilots(Piloto[] p) {
		int n = pilotCount(p);
		int k = n;
		String temp, plate;
		do{
			sc.nextLine();
			System.out.println("Introduza o nome do piloto: ");
			temp = sc.nextLine();
			if(temp.length() == 0){
				break;
			} else {
				p[n] = new Piloto();
				p[n].name = temp;
				System.out.println("Introduza a matricula do veículo (aa-bb-cc): ");
				plate = sc.next();
				String[] plateParts = plate.split("-");
				p[n].aa = plateParts[0];
				if(plateParts.length > 1) {
					p[n].nn = plateParts[1];
					if(plateParts.length > 2){
						p[n].bb = plateParts[2];
					}
				}
				p[n].carNum = n+1;
				p[n].count = k++;
			}
			n++;
		} while(n < 10);
		return n;
	}

	public static void SortByCarNum(Piloto[] p) {
		boolean swap = false;
		int n = pilotCount(p);
		do{
			swap = false;
			for(int i = 0; i < n - 1; i++){
				if(p[i].carNum > p[i+1].carNum){
					Piloto[] temp = new Piloto[1];
					temp[0] = p[i];
					p[i] = p[i+1];
					p[i+1] = temp[0];
					swap = true;
				}
			}
		} while(swap);

		printInfo(p);
	}

	public static void editPilot(Piloto[] p) {
		int n = pilotCount(p);
		boolean exists = false;
		System.out.println("Qual piloto deseja editar? ");
		int k = sc.nextInt();
		for(int i = 0; i < n; i++){
			if(p[i].carNum == k){
				exists = true;
				k = i;
				break;
			}
		}

		if(exists == false) {
			System.out.println("O número que introduziu não existe na base de dados!");
		} else {
			sc.nextLine();
			System.out.println("Introduza o nome do piloto: ");
			String temp = sc.nextLine();
			if(temp.length() != 0){
				p[k].name = temp;
				System.out.println("Introduza a matricula do veículo (aa-bb-cc): ");
				String plate = sc.next();
				String[] plateParts = plate.split("-");
				p[k].aa = plateParts[0];
				if(plateParts.length > 1) {
					p[k].nn = plateParts[1];
					if(plateParts.length > 2){
						p[k].bb = plateParts[2];
					}
				}
			} else {
				System.out.println("Nome inválido!");
			}
		}
	}

	public static void deleteByCarNum(Piloto[] p){
		int n = pilotCount(p);
		boolean exists = false;
		System.out.println("Qual piloto deseja eliminar? ");
		int k = sc.nextInt();
		for(int i = 0; i < n; i++){
			if(p[i].carNum == k){
				exists = true;
				k = i;
				break;
			}
		}

		if(exists == false) {
			System.out.println("O número que introduziu não existe na base de dados!");
		} else {
			for(int i = k; i < n; i++){
				p[i] = p[i+1];
				if(i == n){
					p[i] = null;
				}
			}
		}
	}

	public static void SortByName(Piloto[] p) {
		int n = pilotCount(p);
		Piloto[] temp = new Piloto[maxPilots];
		for(int i = 0; i < maxPilots; i++){
			temp[i] = new Piloto();
			temp[i] = p[i];
		}

		for(int i = 0; i < n; i++){
			for(int j = i; j < n; j++) {
				if(temp[i].name.compareToIgnoreCase(temp[j].name) > 0) {
					Piloto temp1 = temp[i];
					temp[i] = temp[j];
					temp[j] = temp1;
				}
			}
		}

		printInfo(temp);
	}

	public static void deleteByName(Piloto[] p) {
		int n = pilotCount(p);
		Piloto[] temp = new Piloto[maxPilots];
		for(int i = 0; i < maxPilots; i++) {
			temp[i] = new Piloto();
			temp[i] = p[i];
		}
		sc.nextLine();
		System.out.println("Qual o nome do(s) piloto(s) que deseja eliminar? ");
		String name = sc.nextLine();
		for(int i = 0; i <= n; i++) {
			if(p[i].name.indexOf(name) >= 0){
				temp[i] = p[i];
			}
		}
		int u = pilotCount(temp);
		if(u == 0){
			System.out.println("Não existe nenhum piloto com esse nome na base de dados!");
		} else {
			System.out.println("Qual deseja eliminar?");
			printDeleteByName(temp);
			System.out.println("Opção -> ");
			int op = sc.nextInt();
			for(int i = 0; i < u; i++) {
				if(op > 0 && op < u) {
					if(p[i] == temp[op-1]){
						for(int j = i; j < u; j++) {
							p[j] = p[j+1];
						}
					}
				}
			}
		}
	}

	public static void validatePlates(Piloto[] p) {

	}

	public static void printInfo(Piloto[] p){
		int n = pilotCount(p);
		for(int i = 0; i < n; i++) {
			System.out.printf("Nº. Carro: %d\tNome do Piloto: %s\t\t\tMatricula: %s-%s-%s\n", p[i].carNum, p[i].name, p[i].aa, p[i].nn, p[i].bb);
		}
		System.out.println();
	}

	public static void printDeleteByName(Piloto[] p){
		int n = pilotCount(p);
		for(int i = 0; i < n; i++) {
			System.out.printf("%d - %s\n", i+1, p[i].name);
		}
		System.out.println();
	}

	public static int pilotCount(Piloto[] p){
		int n = 0;
		for(int i = 0; i < maxPilots; i++){
			if(p[i] == null){
				break;
			} else {
				n++;
			}
		}
		return n;
	}

}

class Piloto{
	int carNum;
	String name, aa, nn, bb;
	int count;
}
