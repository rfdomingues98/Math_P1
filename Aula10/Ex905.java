import java.util.*;

public class Ex905{
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int n,b;
		System.out.println("Introduza um número: ");
		n = sc.nextInt();
		for(b = 2; b <= 10; b++){
			System.out.printf("Base %d -> ", b);
			numToBase(n,b);
		}
	}

	public static void numToBase(int n, int b){
		int c = n;
		String res = new String();
		if(b < 2 || b > 10){
			System.out.println("Radix not between 2 and 10");
		} else {
			while (c != 0){
				res += Integer.toString(c % b);
				c /= b;
				
			}
			System.out.println(reverseStr(res));
		}
	}
	public static String reverseStr(String text){
		String str = new String();
		char[] array = text.toCharArray();
		int left, right = 0;
		right = array.length-1;
		for(left = 0; left < right; left++, right--){
			char temp = array[left];
			array[left] = array[right];
			array[right]=temp;
		}
		for (char c : array)
			str += c;
		return str;
	}
}