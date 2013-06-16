package base.multipledomain;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import Resources.R1;
import Resources.R2;
import Resources.R3;
import Resources.SyncTool;
import base.Add;
import base.CalcFeature;
import base.Exit;
import base.minus.Calc2Feature;
import base.minus.Minus;
import base.multipledomain.MultipleDomainFeaturePackage;
import base.multiply.Calc1Feature;
import base.multiply.Multiply;

import compile.CompileSetting;

public class MultipleDomainTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		CompileSetting.compileMultipleDomain();
	}

	@Test
	public void testAddingOnce() {
		SyncTool st = new SyncTool();
		R1 r1 = new R1();
		R2 r2 = new R2();
		R3 r3 = new R3();
		MultipleDomainFeaturePackage f = new MultipleDomainFeaturePackage(st, r1, r2, r3);
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
		R2 r2 = new R2();
		R3 r3 = new R3();
		MultipleDomainFeaturePackage f = new MultipleDomainFeaturePackage(st, r1, r2, r3);
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

	@Test
	public void testMinus() {
		SyncTool st = new SyncTool();
		R1 r1 = new R1();
		R2 r2 = new R2();
		R3 r3 = new R3();
		MultipleDomainFeaturePackage f = new MultipleDomainFeaturePackage(st, r1, r2, r3);
			f.sendEvent(new Add(10));
		f.sendEvent(new Minus(5));
		f.sendEvent(new Exit());
		while (!st.isFinished()) {
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		assertEquals(5, st.getResult());
	}

}
