

public class SampleProgrammerClass implements HelloCreatedAsNewInterface{
	
	public void ontext(String text) {
		
		System.out.println(text);
	}
	
	public SampleProgrammerClass() {
		TextScanner myobject = new TextScanner(this);
		myobject.scan();
	}
	
	public static void main(String[] args) {
		
		SampleProgrammerClass s = new SampleProgrammerClass();
		
		
		
		

	}

}
