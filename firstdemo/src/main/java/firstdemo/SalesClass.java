package firstdemo;

public class SalesClass {
	
	public void display() {
		int[] array = {23,45,56,78,6};
		for(int num:array)
			System.out.println(num);
	}

	public void print() {
		System.out.println("Print All Array Number:");
		display();
	}
}
