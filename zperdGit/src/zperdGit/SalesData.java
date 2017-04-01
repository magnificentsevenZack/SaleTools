package zperdGit;

public class SalesData {
	int data[] = {0, 4, 42};
	
	public void Display(){
		System.out.println("Data:");
		for(int i =0; i< data.length; i++){
			System.out.println("Next value:  " + data[i]);
		}
	}
}
