import java.util.*;
public class Ex207{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Introduza o 1º número: ");
    int n1 = sc.nextInt();
    System.out.println("Introduza o 2º número: ");
    int n2 = sc.nextInt();
    System.out.println("Introduza o 3º número: ");
    int n3 = sc.nextInt();

    int max = n1;
    if(n2 > max){
      max = n2;
    }
    if(n3 > max){
      max = n3;
    }
    System.out.printf("O maior número é o %d\n", max);
  }
}
