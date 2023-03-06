
public class Sample {
	public static void main(String a[]) {
		
		Sum n1 = new Sum();
		Sum n2 = new Sum();
		
		n1.num1 = 10;
		n1.num2 = 50;
		n2.num1 = 150;
		n2.num2 = 200;
		
		n1.CalculateSum();
		n1.DisplaySum();
		
		//Another method
		n2.display2();
		
	}

}
