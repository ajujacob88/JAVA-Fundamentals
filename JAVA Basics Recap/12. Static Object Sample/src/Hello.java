
public class Hello {

	//If a variable is static it has no separate memory spaces.
	static int numstatic=10;
	int numb = 25;
	
//main will be static all the time... only a static variable or function can be called from static..
//main is static because java is inititalising from command prompt.,so inorder to run from command prompt, main is static always.	
	public static void main(String a[]) {
		
		System.out.println(numstatic);
		hellon();
		//System.out.println(numb); //we cant call this because numb is not static
		
		//creating a new object within this class Hello and thus we can call a non static thing...
		Hello Aju = new Hello(); 
		Aju.hai();
		System.out.println(Aju.numb);
		
		
		Hello Aju2 = new Hello();
		
		Aju.numb = 50;
		Aju2.numb = 75;
		System.out.println("Aju.num is "+Aju.numb+ " Aju2.numb is " +Aju2.numb+" and again Aju.num is"+Aju.numb );
		
		Aju.numstatic = 200;
		Aju2.numstatic = 250;
		System.out.println("Aju.numstatic is "+Aju.numstatic+ " Aju2.numstatic is " +Aju2.numstatic+" and again Aju.numstatic is"+Aju.numstatic );
	
		numstatic = 888;
		System.out.println("Aju.numstatic is "+Aju.numstatic+ " Aju2.numstatic is " +Aju2.numstatic);
		
		// The static concept is same, if we create separate classes and objects there....
	
	}
	
	static void hellon() {
		System.out.println("Hellon");
	}
	
	void hai() {
		System.out.println("hai");
	}
	
}
