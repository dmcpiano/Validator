package co.grandcircus.labseven;

import java.util.Scanner;

public class LabSeven {
	
	private static Scanner scnr = new Scanner(System.in);
		
	public static void main(String[] args) {
		
		String valid = getValidName(scnr);
		System.out.println(valid);
		String correct = getValidEmail(scnr);
		System.out.println(correct);
		String Verizon = validatePhoneNumbers(scnr);
		System.out.println(Verizon);
		String output = valiDate(scnr);
		System.out.println(output);
		/*String html = validHTML(scnr);
		System.out.println(html);*/
		
		scnr.close();
		
		} 
	
	private static String getValidName(Scanner scnr) {
			
			boolean isValid = false;
			String input;

			do {	
				System.out.println("Enter a valid name. ");
				input = scnr.nextLine();
						
				
				if (input.matches("[A-Z]{1}[a-z]{0,30}")) {
					
					isValid = true;
					System.out.println("This is a valid name. ");
					
				} else {
					
					System.out.print("Input must match the appropriate format. ");
					isValid = false;
					
				} 
			
		} while (!isValid);
			String end = "Next: ";
			return end;
			
	
	}
	
	private static String getValidEmail(Scanner scnr) {
		
		boolean isCorrect = false;
		String userAddress;
		
		do {
			System.out.println("Enter a valid email address. ");
			userAddress = scnr.nextLine();
			
			if (userAddress.matches("\\w{5,30}[@]\\w{5,10}\\.\\w{2,3}")) {
				isCorrect = true;
				System.out.println("This is a valid email. ");
				
			} else {
				
				System.out.print("User address must be in the appropriate format. ");
				isCorrect = false;
				
			}
		} while (!isCorrect);
			String complete = "Next: ";
			return complete;
	}
	
	private static String validatePhoneNumbers(Scanner scnr) {
		
		boolean canCall = false;
		String userCall;
		
		do {
			System.out.println("Enter a valid phone number in the format '(XXX) XXX XXXX)' ");
			userCall = scnr.nextLine();
			
			if (userCall.matches("[(]\\d{3}[)] \\d{3} \\d{4}")) {
				canCall = true;
				System.out.println("This is a valid number. ");
			} else {
				System.out.println("Phone number must be in the appropriate format. ");
				canCall = false;
			}
			
		} while (!canCall);
			String Last = "Next: ";
			return Last;
		
	}
	
	private static String valiDate(Scanner scnr) {
		
		boolean isDate = false;
		String ddmmyyyy;
		
		do {
			System.out.println("Enter a valid date in the format dd/mm/yyyy. ");
			ddmmyyyy = scnr.nextLine();
			
			if (ddmmyyyy.matches("\\d{2}/\\d{2}/\\d{4}")) {
				isDate = true;
				System.out.println("This is a valid date. ");
			} else {
				System.out.println("Date must be in format dd/mm/yyyy. ");
				isDate = false;
			}
			
		} while (!isDate);
			String end = "Bonus: ";
			return end;
	}
	
	/*private static String validHTML(Scanner scnr) {
		
		boolean isAllowed = false;
		String htmlForm;
		
		do {
			System.out.println("Enter valid elements of HTML. ");
			htmlForm = scnr.nextLine();
			
			if (htmlForm.matches("<(\"[^\"]*\"|'[^']*'|[^'\">])*>")) {
				isAllowed = true;
				System.out.println("This is a valid HTML sequence. ");
				
			} else {
				System.out.println("Must be in appropriate format. ");
				isAllowed = false;
				
			}
		} while (!isAllowed);
			String complete = "Goodbye. ";
			return complete;
	}*/
}

		
	
   