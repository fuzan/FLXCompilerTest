package Resources;

import java.util.ArrayList;

import Resources.ex.LessThanZeroException;
import Resources.ex.OverHundredException;

public class SyncTool {
	private int result;
	private Boolean finished = false;
	ArrayList<String> strs = new ArrayList<>();

	public int getResult() {
		return result;
	}

	public void setResult(int result) throws LessThanZeroException, OverHundredException {
		if(result<0){
			throw new LessThanZeroException();
		}
		if(result>100){
			throw new OverHundredException();
		}
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
