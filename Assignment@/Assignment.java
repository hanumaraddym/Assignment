import java.util.Scanner;

public class Assignment {
		private static void printDuplicateCharacters(String input) {
			if(input == null || input.length() <= 0) {
				System.out.println("GIven input string is empty");
				return;
			}
			//Assuming 256 characters in system, making count is Zero by default.
			int charsCount[] = new int [256];
			for(int i=0; i<256; i++) {
				charsCount[i] = 0;
			}
			
			for(int i=0; i < input.length(); i++) {
				//Update the occurrence count for the character at i. 
				charsCount[input.charAt(i)]++;
			}
			boolean isDuplicateExist = false; 
			for(int i=0; i<256; i++) {
				//Check character 'i' occurred more than once, then print the character with total occurred count. 
				if(charsCount[i] >1) {
					isDuplicateExist = true;
					char c =(char) (i);
					System.out.println("'"+c+"' : "+charsCount[i]);
				}
			}
			
			if(!isDuplicateExist) {
			System.out.println(" No duplicate charcters found in "+input);
			}
		}
		
		public static void main(String[] args) {
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter the string");
			String input = sc.nextLine();
			System.out.println("Duplicate Charcters with count");
			printDuplicateCharacters(input);	
		}
}
