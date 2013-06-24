package base.printer.multiply;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import Resources.R1;
import Resources.R3;
import Resources.SyncTool;
import base.Add;
import base.Exit;
import base.multiply.Multiply;
import base.printer.CalcPrinterFPFeaturePackage;
import base.printer.multiply.CalcPrinter2FPFeaturePackage;
import base.printer.multiply.CalcPrinter2Feature;

import compile.CompileSetting;

public class Printer2Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		CompileSetting.compilePrinter2();
	}

	@Test
	public void testAddingAndMultiplying() {
		SyncTool st = new SyncTool();
		R3 r3 = new R3();
		R1 r1 = new R1();
		CalcPrinter2FPFeaturePackage f = new CalcPrinter2FPFeaturePackage(r3,
				st, r1);
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
		assertEquals("add 10", st.getStrs().get(0));
		assertEquals("times 10", st.getStrs().get(1));
	}

}
