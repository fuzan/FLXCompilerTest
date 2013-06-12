package base.test;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import Resources.SyncTool;
import base.Add;
import base.CalcFeature;
import base.Exit;

import compile.CompileSetting;

public class BaseTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		CompileSetting.compileCalc();
	}

	
	@Test
	public void testAdding1to10() {
		SyncTool st = new SyncTool();
		CalcFeature f = new CalcFeature(st);
		st.starts();
		for (int i = 1; i <= 10; i++) {
			f.sendEvent(new Add(i));
		}
		f.sendEvent(new Exit());
		while(!st.isFinished()){
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		assertEquals(55, st.getResult());		
	}
	
	@Test
	public void testAddingTwice() {
		SyncTool st = new SyncTool();
		CalcFeature f = new CalcFeature(st);
		st.starts();
		f.sendEvent(new Add(10));
		f.sendEvent(new Add(10));
		f.sendEvent(new Exit());
		while(!st.isFinished()){
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		assertEquals(20, st.getResult());
	}
	@Test
	public void testAddingOnce() {
		SyncTool st = new SyncTool();
		CalcFeature f = new CalcFeature(st);
		st.starts();
		f.sendEvent(new Add(10));
		f.sendEvent(new Exit());
		while(!st.isFinished()){
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		assertEquals(10, st.getResult());		
	}
}
