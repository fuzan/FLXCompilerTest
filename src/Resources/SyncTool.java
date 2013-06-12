package Resources;

public class SyncTool {
	private int result;
	private Boolean finished = false;

	public int getResult() {
		return result;
	}

	public void setResult(int result) {
		this.result = result;
	}

	public Boolean isFinished() {
		return finished;
	}
	
	public void finishes(){
		finished = true;
	}
	
	public void starts(){
		finished = false;
	}
}
