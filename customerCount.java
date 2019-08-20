package Session3.assignment5.Customer;

import java.util.Scanner;

public class customerCount {
public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Totla customer: " + Customer.getCustCount());
		
		System.out.print("Enter Customer name: ");
		String name = scan.nextLine();
		System.out.print("Enter Customer No: ");
		int no = scan.nextInt();
		Customer c = new Customer(name, no);
		System.out.println("Totla customer: " + Customer.getCustCount());

		System.out.print("Enter Customer name:");
		String name1 = scan.next();
		System.out.print("Enter Customer No: ");
		int no1 = scan.nextInt();
		Customer c1 = new Customer(name1, no1);
		System.out.println("Totla customer: " + Customer.getCustCount());
		
		System.out.print("Enter Customer name:");
		String name2 = scan.next();
		System.out.print("Enter Customer No: ");
		int no2 = scan.nextInt();
		Customer c2 = new Customer(name2, no2);
		System.out.println("Totla customer: " + Customer.getCustCount());
		
		
		
			
		scan.close();
}
}