package firstdemo;

public class SalesClass {
	
	public void display() {
		int[] array = {23,45,56,78,6};
		int sum=0;
		for(int i=0; i<array.length; i++) {
			sum += array[i];
			System.out.println(array[i]);
		}
		System.out.println("Array Size:" +array.length);
		System.out.println("Summation:" +sum);
	}

	public void print() {
		System.out.println("Print All Array Number:");
		display();
	}
}
