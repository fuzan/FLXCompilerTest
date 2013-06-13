package base.multipledomain.test;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

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
		MultipleDomainFeaturePackage f = new MultipleDomainFeaturePackage(st);
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
		MultipleDomainFeaturePackage f = new MultipleDomainFeaturePackage(st);
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
		MultipleDomainFeaturePackage f = new MultipleDomainFeaturePackage(st);
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
