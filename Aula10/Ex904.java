import java.util.*;

public class Ex904{
	static Scanner sc = new Scanner(System.in);
	static boolean isValid = false;
	public static void main(String[] args) {
		String plate = new String();
		String pattern1 = "AA-00-00";
		String pattern2 = "00-AA-00";
		String pattern3 = "00-00-AA";
		plate = sc.nextLine();
		matchPattern(plate, pattern1);
		if(isValid == false){
			matchPattern(plate, pattern2);
		}
		if(isValid == false){
			matchPattern(plate, pattern3);
		}
		if(isValid == true){
			System.out.println("A matricula é válida!");
		} else{
			System.out.println("A matricula não é válida!");
		}
	}

	public static boolean matchPattern(String str, String pattern){
		isValid = false;
		
		if(str.length() == 8){
			if(pattern == "AA-00-00"){
				if(str.charAt(0) >= 'A' && str.charAt(0) <= 'Z' && str.charAt(1) >= 'A' && str.charAt(1) <= 'Z'){
					if(str.charAt(2) == '-'){
						if(str.charAt(3) >= '0' && str.charAt(3) <= '9' && str.charAt(4) >= '0' && str.charAt(4) <= '9'){
							if(str.charAt(5) == '-'){
								if(str.charAt(6) >= '0' && str.charAt(6) <= '9' && str.charAt(7) >= '0' && str.charAt(7) <= '9'){
									isValid = true;
								}
							}
						}	
					}
					
				}
			} else if (pattern == "00-AA-00") {
				if(str.charAt(0) >= '0' && str.charAt(0) <= '9' && str.charAt(1) >= '0' && str.charAt(1) <= '9'){
					if(str.charAt(2) == '-'){
						if(str.charAt(3) >= 'A' && str.charAt(3) <= 'Z' && str.charAt(4) >= 'A' && str.charAt(4) <= 'Z'){
							if(str.charAt(5) == '-'){
								if(str.charAt(6) >= '0' && str.charAt(6) <= '9' && str.charAt(7) >= '0' && str.charAt(7) <= '9'){
									isValid = true;
								}
							}
						}	
					}
					
				}
				
			} else if (pattern == "00-00-AA") {
				if(str.charAt(0) >= '0' && str.charAt(0) <= '9' && str.charAt(1) >= '0' && str.charAt(1) <= '9'){
					if(str.charAt(2) == '-'){
						if(str.charAt(3) >= '0' && str.charAt(3) <= '9' && str.charAt(4) >= '0' && str.charAt(4) <= '9'){
							if(str.charAt(5) == '-'){
								if(str.charAt(6) >= 'A' && str.charAt(6) <= 'Z' && str.charAt(7) >= 'A' && str.charAt(7) <= 'Z'){
									isValid = true;
								}
							}
						}	
					}
					
				}
				
			}
		}
		return isValid;
	}
}