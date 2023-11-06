
public class Monitor extends OutputDevice{

	Monitor(int size){
		this.setMaxWidth(size);
	}
	public void outputContent(String content) {
		setContentBuffer(content);
		System.out.println("This monitor is: " + getMaxWidth() + " pixels wide");
		if(isValidContentLength() == false) {
			System.out.println("Error. the content cannot be displayed on this monitor");
		}

		
	}
	
	
	
}
