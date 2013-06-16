package base.lessthanzero;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import base.Add;
import base.Exit;
import base.lessthanzero.LessThanZeroFPFeaturePackage;

import Resources.R1;
import Resources.SyncTool;

import compile.CompileSetting;

public class ExceptionHandlingTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		CompileSetting.compileLessThanZero();
	}

	@Test
	public void testEH() {
		SyncTool st = new SyncTool();
		R1 r1 = new R1();
		LessThanZeroFPFeaturePackage f = new LessThanZeroFPFeaturePackage(st,r1);
		f.sendEvent(new Add(-10));
		f.sendEvent(new Exit());
		while (!st.isFinished()) {
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		assertEquals("LessThanZeroException handled at Add", st.getStrs().get(0));
	}

}
