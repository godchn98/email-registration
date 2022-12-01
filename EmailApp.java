package emailApp;

import java.util.Scanner;

public class EmailApp {

	public static void main(String[] args) {
		
		System.out.println("Welcome to Email registration\n");
		
		System.out.println("Enter first name");
		Scanner scanFirstname = new Scanner(System.in);
		String firstname = scanFirstname.nextLine();
		System.out.println("Enter last name");
		Scanner scanLastName = new Scanner(System.in);
		String lastname = scanLastName.nextLine();


		Email em1 = new Email(firstname, lastname);
		
		System.out.println(em1.showInfo());
		

	}

}
