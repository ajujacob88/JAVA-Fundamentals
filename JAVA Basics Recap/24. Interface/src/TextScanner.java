
public class TextScanner {
	
	HelloCreatedAsNewInterface obj1;
	
	public TextScanner(HelloCreatedAsNewInterface obj1) {
		this.obj1 = obj1;
	}
	
	void scan() {
		
		String text="Scanned text Aju2";  
		obj1.ontext(text);
		
	}
	

}
