package abc;

public class MethodExample {

	static void display() {
		System.out.println("This is display method");
	}
	static void add(int x, int y) {
		int sum=x+y;
		System.out.println("Sum of "+x+" + "+y+" = "+sum);
	}
	static boolean findLargest(int x, int y) {
		return x>y;
	}
	public static void main(String[] args) {
		display();
		add(100,200);
		add(1,2);
		add(3,4);
		boolean result=findLargest(10,5);
		System.out.println(result);
	}

}
