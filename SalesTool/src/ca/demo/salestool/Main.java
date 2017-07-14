package ca.demo.salestool;

public class Main {
	
	public static void main(String[] args) {
		SalesData salesData = new SalesData();
		
		displayGreeting();
		salesData.display();
	}

	private static void displayGreeting() {
		System.out.println("HELLO HAPPY SALES PEOPLE!");
		System.out.println("THIS APP DISPLAYS SALES DATA.");
		System.out.println("----------------------------");
		
		System.out.println("Test 1");
		System.out.println("Test 2");
	}
}
