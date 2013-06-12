package Resources;

import java.util.ArrayList;

public class SyncTool {
	private int result;
	private Boolean finished = false;
	ArrayList<String> strs = new ArrayList<>();

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
	
	public void addStr(String s){
		strs.add(s);
	}
	
	public ArrayList<String> getStrs(){
		return strs;
	}
}
