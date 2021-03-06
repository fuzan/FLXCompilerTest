package base.printer.test;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import Resources.SyncTool;
import base.Add;
import base.CalcFeature;
import base.Exit;
import base.printer.CalcPrinterFPFeaturePackage;

public class PrinterTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Test
	public void testAddingOnce() {
		SyncTool st = new SyncTool();
		CalcPrinterFPFeaturePackage f = new CalcPrinterFPFeaturePackage(st);
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
		assertEquals("add 10", st.getStrs().get(0));
		
	}

	@Test
	public void testAddingTwice() {
		SyncTool st = new SyncTool();
		CalcPrinterFPFeaturePackage f = new CalcPrinterFPFeaturePackage(st);
		st.starts();
		f.sendEvent(new Add(10));
		f.sendEvent(new Add(10));
		f.sendEvent(new Exit());
		while (!st.isFinished()) {
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		assertEquals(20, st.getResult());
		assertEquals("add 10", st.getStrs().get(0));
		assertEquals("add 10", st.getStrs().get(1));
	}
}
