package base.minus.test;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import base.minus.Minus;

import base.Add;
import base.Exit;
import base.minus.Calc2Feature;

import Resources.SyncTool;

import compile.CompileSetting;

public class MinusTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		CompileSetting.compileMinus();
	}

	@Test
	public void testMinus() {
		SyncTool st = new SyncTool();
		Calc2Feature f = new Calc2Feature(null, st);
		f.sendEvent(new Add(10));
		f.sendEvent(new Minus(5));
		f.sendEvent(new Exit());
		while (!st.isFinished()) {
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		assertEquals(5, st.getResult());
	}

}
