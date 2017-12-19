import java.util.*;
public class Ex112 {
	
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Segundos: ");
		int sec = sc.nextInt();
		int min, hour;
		hour = sec / 3600;
		min = (sec % 3600) / 60;
		sec = sec % 60;
		
		System.out.printf("%02d:%02d:%02d \n ", hour, min, sec);
	}
}

