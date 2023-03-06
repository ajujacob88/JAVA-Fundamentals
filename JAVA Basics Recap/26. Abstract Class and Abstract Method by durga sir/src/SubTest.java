/*
public class SubTest extends Test {
	
	public void m1(){
		System.out.println("asdsdf");
	}
	
	public void m2() {
		
		
	}

}
*/

// OR

public abstract class SubTest extends Test {
	
	public void m1(){
		System.out.println("asdsdf");
	}
	


}


	


/*
If suppose, we was not able to implement m1 or m2 in subTest. Then declare SubTest also as abstract class.
Then the next level child class is responsible to provide the implementation.
But we can't create object for the test class as well as SubTest Class

*/