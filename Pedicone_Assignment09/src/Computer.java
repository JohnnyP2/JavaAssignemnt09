
public class Computer {

	private String content;
	
	public void output(OutputDevice device) {
		device.outputContent(getContent());
		
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
}
