package Session3.assignment5.bankAccount;

import java.util.Scanner;

public class accountTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the Saving account Name:");
		String name = scan.next();
		System.out.print("Enter the Saving account Number:");
		int no = scan.nextInt();
		System.out.print("Enter the Saving account Balance:");
		String bal = scan.next();
		Saving s1 = new Saving(no, name, bal);
		s1.display();
		
		System.out.print("Enter the Current account Name:");
		name = scan.next();
		System.out.print("Enter the Current account Number:");
		no = scan.nextInt();
		System.out.print("Enter the Current account Balance:");
		bal = scan.next();
		Current c1 = new Current(no, name, bal);
		c1.display();
		
	}
}
