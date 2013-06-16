package base.multiply;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import Resources.R1;
import Resources.R3;
import Resources.SyncTool;
import base.Add;
import base.CalcFeature;
import base.Exit;
import base.multiply.Calc1Feature;
import base.multiply.Multiply;

import compile.CompileSetting;

public class MultiplyTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		CompileSetting.compileCalc1();
	}

	@Test
	public void testAdding() {
		SyncTool st = new SyncTool();
		R1 r1 = new R1();
		R3 r3 = new R3();
		Calc1Feature f = new Calc1Feature(r3,st,r1);
		st.starts();
		f.sendEvent(new Add(10));
		f.sendEvent(new Exit());
		while (!st.isFinished()) {
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		assertEquals(10, st.getResult());
	}
	
	@Test
	public void testMultiplying() {
		SyncTool st = new SyncTool();
		R1 r1 = new R1();
		R3 r3 = new R3();
		Calc1Feature f = new Calc1Feature(r3,st,r1);
		st.starts();
		f.sendEvent(new Add(10));
		f.sendEvent(new Multiply(10));
		f.sendEvent(new Exit());
		while (!st.isFinished()) {
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		assertEquals(100, st.getResult());
	}

}
