package zperdGit;

public class Main {
	public static void main(String args[]){
	
	SalesData sales = new SalesData();
	displayGreeting();
	sales.Display();
	
	}
	private static void displayGreeting(){
		System.out.println("Hello happy sales people!");
		System.out.println("This app shows sales data.");
		System.out.println("----------------------------");
		
		System.out.println("Test 1");
		System.out.println("Test 2");

	}
}