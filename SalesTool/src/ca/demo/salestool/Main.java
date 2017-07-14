package ca.demo.salestool;

public class Main {
	
	public static void main(String[] args) {
		SalesData salesData = new SalesData();
		
		displayGreeting();
		salesData.display();
	}

	private static void displayGreeting() {
		System.out.println("Hello Happy Sales People!");
		System.out.println("This App shows sales data");
		
		System.out.println("Test 1");
	}
}
