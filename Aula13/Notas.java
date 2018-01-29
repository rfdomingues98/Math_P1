import java.util.*;
import java.io.*;
import static java.lang.System.*;

public class Notas {

	static final Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws IOException{
		int op, numAlunos = 0;
		Aluno[] alunos = null;
		do{
			op = menu();

			switch(op){
				case 1:
					alunos = readFile(alunos);
					break;
				case 2:
					printSubjectInfo(alunos);
					break;
				case 3:
					subjectStatistics(alunos);
					break;
				case 4:
					editStudent(alunos);
					break;
				case 5:
					vertHistogram(alunos);
					break;
				case 6:
					saveInfoToFile(alunos);
					break;
				case 7:
					out.println("A terminar . . .");
					break;
			}
		} while(op != 7);
	}

	static int menu() {
		out.println();
		out.println("Serviços Académicos - Gestão de uma Pauta");
		out.println("1 - Ler ficheiro com nº. mec. e pedir informação de notas");
		out.println("2 - Imprimir no terminal a informação da disciplina");
		out.println("3 - Calcular estatística das notas finais");
		out.println("4 - Alterar as notas de um aluno");
		out.println("5 - Imprimir um histograma de notas");
		out.println("6 - Gravar num ficheiro a informação da disciplina (ordenada)");
		out.println("7 - Terminar programa");
		out.print("Opção -> ");
		return sc.nextInt();
	}

	static Aluno[] readFile(Aluno[] a) throws IOException{
		int n = 0;
		String fileName = new String();
		File file;
		do{
			out.println("Introduza o nome do ficheiro: ");
			fileName = sc.next();
			file = new File(fileName);
		} while(!file.isFile() || !file.canRead() || !file.exists());
		Scanner scf = new Scanner(file);
		while(scf.hasNextLine()){
			n++;
			scf.nextLine();
		}
		scf.close();
		a = new Aluno[n];
		scf = new Scanner(file);
		int temp = -1;
		for(int i = 0; i < a.length; i++) {
			a[i] = new Aluno();
			a[i].nMec = Integer.parseInt(scf.nextLine());
			out.printf("Aluno nº. %d \n", a[i].nMec);
			do{
				out.print("Introduza a nota da época normal (se faltou escreva 77): ");
				temp = sc.nextInt();	
				out.println();
			} while((temp > 20 && temp != 77) || temp < 0);
			a[i].notaN = temp;
			temp = -1;
			do{
				out.print("Introduza a nota da época de recurso (se faltou escreva 77): ");
				temp = sc.nextInt();	
				out.println();
			} while((temp > 20 && temp != 77) || temp < 0);
			a[i].notaR = temp;
			temp = -1;

			int max = 0;
			if(a[i].notaN > a[i].notaR){
				if(a[i].notaN == 77){
					max = a[i].notaR;
				} else {
					max = a[i].notaN;
				}
			} else if(a[i].notaN < a[i].notaR){
				if(a[i].notaR == 77){
					max = a[i].notaN;
				} else {
					max = a[i].notaR;
				}
			} else {
				max = 77;
			}

			a[i].notaF = max;

			
		}
		out.println("Dados lidos com sucesso!");
		return a;

	}

	static void printSubjectInfo(Aluno[] a) {
		int n = a.length;
		out.println("Pauta de uma disciplina");
		out.println("-------------------------");
		for(int i = 0; i < n; i++){
			//(a[i].notaN > a[i].notaR) ? a[i].notaF =
			out.printf("|%7d | %2d | %2d | %2d |\n", a[i].nMec, a[i].notaN, a[i].notaR, a[i].notaF);
		}
		out.println("-------------------------");
	}

	static void subjectStatistics(Aluno[] a){
		int n = a.length;
		int sumGrades = 0;
		int approved = 0;
		int notApproved = 0;
		double avg = 0;
		Aluno bestStud = a[0];
		for(int i = 0; i < n; i++){
			if(a[i].notaF > bestStud.notaF) {
				bestStud = a[i];
			}
			sumGrades += a[i].notaF;
			if(a[i].notaF > 9){
				approved++;
			} else {
				notApproved++;
			}
		}
		avg = sumGrades / n;
		out.printf("A média das notas é de %4.2f valores.\n", avg);
		out.printf("O melhor aluno tem o Nº. Mec. %d, e a sua nota final é de %d.\n", bestStud.nMec, bestStud.notaF);
		out.printf("Foram aprovados %d alunos e reprovados %d alunos.\n", approved, notApproved);
	}

	static void editStudent(Aluno[] a){
		int n = a.length, k = -1;
		boolean exists = false;
		out.print("Introduza o nº. mec. do aluno que deseja editar: ");
		int nmec = sc.nextInt();
		for(int i = 0; i < n; i++){
			if(nmec == a[i].nMec) {
				exists = true;
				k = i;
				break;
			}
		}

		if(exists == false){
			out.println("Não existe um aluno com esse nº. mec. na base de dados!");
		} else {
			int temp = -1;
			do{
				out.print("Introduza a nota da época normal (se faltou escreva 77): ");
				temp = sc.nextInt();	
				out.println();
			} while((temp > 20 && temp != 77) || temp < 0);
			a[k].notaN = temp;
			temp = -1;
			do{
				out.print("Introduza a nota da época de recurso (se faltou escreva 77): ");
				temp = sc.nextInt();	
				out.println();
			} while((temp > 20 && temp != 77) || temp < 0);
			a[k].notaR = temp;
			temp = -1;

			int max = 0;
			if(a[k].notaN > a[k].notaR){
				if(a[k].notaN == 77){
					max = a[k].notaR;
				} else {
					max = a[k].notaN;
				}
			} else if(a[k].notaN < a[k].notaR){
				if(a[k].notaR == 77){
					max = a[k].notaN;
				} else {
					max = a[k].notaR;
				}
			} else {
				max = 77;
			}

			a[k].notaF = max;
		}
	}

	static void vertHistogram(Aluno[] a) {
		int n = a.length;
		String[][] hist = new String[21][1];
		for(int i = 0; i <= 20; i++){
			hist[i] = new String();
			hist
		}
		int max = 0;
		int temp = 0;
		out.println("                        Histograma de uma disciplina                        ");
		out.println("----------------------------------------------------------------------------");
		
		for(int i = 0; i <= 20; i++){
			temp = 0;
			for(int j = 0; j < n; j++){
				if(a[j].notaF == i) {
					temp++;
				}
			}
		}
		
			
		out.println("----------------------------------------------------------------------------");
		out.println("  0  1  2  3  4  5  6  7  8  9  10  11  12  13  14  15  16  17  18  19  20");
	}

	static void saveInfoToFile(Aluno[] a) throws IOException{
		int n = a.length;
		String fileName;
		sc.nextLine();
		out.print("Nome do novo ficheiro: ");
		fileName = sc.next();
		File file = new File(fileName);
		PrintWriter pw = new PrintWriter(file);
		Aluno temp = new Aluno();
		boolean swap;
		int u = 0;
		do{
			swap = false;
			for(int i = 0; i < n - u - 1; i++){
				if(a[i].notaF < a[i+1].notaF){
					temp = a[i];
					a[i] = a[i+1];
					a[i+1] = temp;
					swap = true;
				} else {
					u++;
				}
			}
		}while(swap);
		
		for(int i = 0; i < n; i++){
			if(a[i].notaF > 9){
				pw.printf("%5d \t %2d \t %2d \t %2d", a[i].nMec, a[i].notaN, a[i].notaR, a[i].notaF);
				pw.println();
			}
		}
		pw.close();
		out.println("Ficheiro criado com sucesso!");
	}

}

class Aluno {
	int nMec, notaN, notaR, notaF;
}
