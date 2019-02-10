package hw.KhalimzadeF;

import java.util.Scanner;

public class methods {

	//average method
	public static double answer() {
		double average = 0;
		return average;
	}
	
	//creating method Palindrome
	public static boolean Palindrome(String str) {
		if(str.length() == 0 || str.length() == 1)
			return true;
		if(str.charAt(0) == str.charAt(str.length()-1))
			return Palindrome(str.substring(1, str.length()-1));
			return false;
		}
	
	//creating method for ASCII code
	public static String decryptedMes(String str, int a) {
        String answer = "";
        char  originalChar ;
        for(int i = 0; i < str.length(); i++) {
        	 originalChar = str.charAt(i);
            if((int)originalChar < 65) {
            	originalChar = (char)(originalChar - 32 + 127 - a);
            } else {
            	originalChar = (char)(originalChar - a);
            }
            answer += originalChar;
        }
        return answer;
		}
	
	
	public static void main(String[] args) {
			
	// question 1		
		System.out.print("Enter three decimal numbers: ");		
		Scanner scan = new Scanner(System.in);
		double num1 = scan.nextDouble();
		double num2 = scan.nextDouble();
		double num3 = scan.nextDouble();
		double average = (num1 + num2 +num3)/3;
			//System.out.println("The average is: " + average);
		System.out.printf("The average is:%6.3f", average);
		System.out.println("");
	//question 2
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter a string :");
			String str = scanner.nextLine();
		
			if(Palindrome(str))
				System.out.println(str + " is a palindrome");
			else
				System.out.println(str + " is not a palindrome");
	//question 3
			Scanner message = new Scanner(System.in);
			
			System.out.println("Enter encrypted sentence:");
			String codePrint = message.nextLine();

			for(int i = 1; i <= 100; i++) {
				System.out.println(i + " " + decryptedMes(codePrint, i));
			
				{	
					System.out.print("Enter three decimal numbers: ");		
				}
			
			}
		}
}


