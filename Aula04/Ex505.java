import java.util.*;
public class Ex505{
	public static void main(String[] args) {
		drawSquare();
	}

	public static void drawSquare(){
		printNtimes(5, "*");
		System.out.println();
		System.out.print("*");
		printNtimes(3, " ");
		System.out.print("*\n");
		System.out.print("*");
		printNtimes(3, " ");
		System.out.print("*\n");
		printNtimes(5, "*");
		System.out.println();
	}

	public static void printNtimes(int n, String msg){
		for (int i = 0; i < n; i++){
			System.out.print(msg);
		}
	}
}