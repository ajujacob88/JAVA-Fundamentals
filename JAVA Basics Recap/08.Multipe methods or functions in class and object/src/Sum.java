
public class Sum {
	
	int num1,num2,sum;
	
	void CalculateSum() {
		sum = num1 + num2;
	}
	void DisplaySum() {
		System.out.println("sum is "+sum);
	}
	
	//Another Method.. calling in between....
	
	void display2() {
		CalculateSum();
		System.out.println("Another way is sum is "+sum);
	}

}
