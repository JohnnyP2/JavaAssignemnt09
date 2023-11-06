
public class OutputDevice implements Output{

	private String contentBuffer;
	private int maxWidth;
	
	// Getters and setters
	public String getContentBuffer() {
		return contentBuffer;
	}



	public void setContentBuffer(String contentBuffer) {
		this.contentBuffer = contentBuffer;
	}



	public int getMaxWidth() {
		return maxWidth;
	}



	public void setMaxWidth(int maxWidth) {
		this.maxWidth = maxWidth;
	}
	protected boolean isValidContentLength() {
		if(this.getContentBuffer().length() < maxWidth) {
			
			
			return true;
		}else {
			return false;
		}
		
	}


	@Override
	public void outputContent(String string) {
		
		
	}

}
