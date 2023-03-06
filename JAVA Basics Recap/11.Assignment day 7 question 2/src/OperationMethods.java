
class OperationMethods {
	
	void Operation(int op, float numb1, float numb2) {
		switch(op) {
		case 1:
			float result = numb1 + numb2;		
			System.out.println("The result is "+result);
			break;
		case 2:
			result = numb1 - numb2;
			System.out.println("The result is "+result);
			break;
		case 3:
			result = numb1*numb2;
			System.out.println("The Result is "+result);
			break;
		case 4:
			result = numb1/numb2;
			System.out.println("The result is "+result);
			break;
		default:
			System.out.println("Enter the correct code");
		
		}	
		
		
		
		
	}
	
	
	
}
