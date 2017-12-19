import java.util.*;
public class Ex205 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int p1x, p1y, p2x, p2y, p3x, p3y, p4x, p4y;

		System.out.println("---Ponto P1---");
		System.out.println("X -> ");
		p1x = sc.nextInt();
		System.out.println("Y -> ");
		p1y = sc.nextInt();

		System.out.println("---Ponto P2---");
		System.out.println("X -> ");
		p2x = sc.nextInt();
		System.out.println("Y -> ");
		p2y = sc.nextInt();

		System.out.println("---Ponto P3---");
		System.out.println("X -> ");
		p3x = sc.nextInt();
		System.out.println("Y -> ");
		p3y = sc.nextInt();

		System.out.println("---Ponto P4---");
		System.out.println("X -> ");
		p4x = sc.nextInt();
		System.out.println("Y -> ");
		p4y = sc.nextInt();

		if(p2x - p1x == p3x - p4x && p3x - p4x == p2y - p3y && p2y - p3y == p1y - p4y) {
			System.out.println("É um quadrado!");
		} else {
			System.out.println("Não é um quadrado!");
		}

	}
}
