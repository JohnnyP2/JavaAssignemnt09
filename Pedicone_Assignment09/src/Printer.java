
public class Printer extends OutputDevice{

	Printer(int size){
		this.setMaxWidth(size);
	}
	
	
	public void outputContent(String content) {
		setContentBuffer(content);
		System.out.println("This is a simulated print");
		System.out.println("Successfully printed: \n"+getContentBuffer());
		
	}
	
	
}
