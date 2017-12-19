import java.util.*;
public class Ex208{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Introduza o 1º número: ");
    int n1 = sc.nextInt();
    System.out.println("Introduza o 2º número: ");
    int n2 = sc.nextInt();
    System.out.println("Introduza o 3º número: ");
    int n3 = sc.nextInt();

    int temp;
    if(n1 > n2){
      temp = n2;
      n2 = n1;
      n1 = temp;
    }
    if(n2 > n3){
      temp = n3;
      n3 = n2;
      n2 = temp;
    }
    System.out.printf("%d > %d > %d", n3, n2, n1);
  }
}
