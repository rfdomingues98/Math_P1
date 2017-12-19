import java.util.*;
public class Ex206{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Introduza um número: ");
    int n = sc.nextInt();
    if(n % 2 == 0){
      System.out.println("O número é par.");
    } else {
      System.out.println("O número é ímpar.");
    }
  }
}
