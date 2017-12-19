import java.util.*;
public class Ex_4_5 {
	static Scanner sc = new Scanner(System.in);
	public static void main (String[] args) {
		int a, b;
		double sqrt, c;
		for(a=1;a<100;a++){
			for(b=a+1;b<100;b++){
				sqrt=Math.sqrt(Math.pow(a, 2)+Math.pow(b, 2));
				if(sqrt==(int)sqrt){
					c=sqrt;
					System.out.printf("%d  %d  %.0f\n", a, b, c);
				}	
			}
		}
	}
}

