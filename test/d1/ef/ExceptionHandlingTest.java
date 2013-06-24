package d1.ef;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import Resources.R1;

import compile.CompileSetting;
import d1.E1;

public class ExceptionHandlingTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		CompileSetting.compileEF();
	}

	@Test
	public void test() {
		R1 r1 = new R1();
		ExceptionHandlingFPFeaturePackage fp = new ExceptionHandlingFPFeaturePackage(r1);
		fp.sendEvent(new E1());
		assertTrue(true);
	}

}
