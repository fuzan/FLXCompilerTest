package base.overhundred.test;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import Resources.SyncTool;
import base.Add;
import base.Exit;
import base.lessthanzero.LessThanZeroFPFeaturePackage;
import base.overhundred.OverHundredFPFeaturePackage;

import compile.CompileSetting;

public class OverHundredTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		CompileSetting.compileOverHundred();
	}

	@Test
	public void testResume() {
		SyncTool st = new SyncTool();
		OverHundredFPFeaturePackage f = new OverHundredFPFeaturePackage(st);
		for (int i = 0; i < 10; i++) {
			f.sendEvent(new Add(11));
		}
		f.sendEvent(new Exit());
		while (!st.isFinished()) {
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		assertEquals(99, st.getResult());
		assertEquals("OverHundredException handled at Add", st.getStrs().get(0));
	}
}
