
public class AjuClass2 {
	
	int a=500,b=200; //This is global variable
	
	AjuClass2(int a,int b){  //Here a and b is a local variable, i.e values of this a and b is local only/inside this function/argument only.
		this.a = a; // passing the value of local variable a to global variable a.
		this.b = b;		
		System.out.println("a is" +a+ " & b is " +b);
		
	}

}

/*
this operator can be used in constructors and functions/methods also
Similarly we can assign global variable to local variable also
for that use
a = this.a
b = this.b
this is writen before global variable.

*/