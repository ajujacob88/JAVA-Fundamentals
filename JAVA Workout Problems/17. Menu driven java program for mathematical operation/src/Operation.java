
public class Operation {
	
	double num1,num2;
	int optn;

	void Addition(double n1, double n2) {
		double sum = n1 + n2;		
		System.out.println(n1+" + "+n2+" = "+sum);		
	}
	
	void Substraction(double n1, double n2) {
		double sub = n1 - n2;		
		System.out.println(n1+" - "+n2+" = "+sub);
	}
	
	void Multiplication(double n1, double n2) {
		double mult = n1 * n2;
		//return sum;
		System.out.println(n1+" * "+n2+" = "+mult);
	}
	
	void Division(double n1, double n2) {
		double div = n1 / n2;
		//return sum;
		System.out.println(n1+" / "+n2+" = "+div);
	}
	
	
}
