package d2;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import Resources.R1;
import Resources.R2;

import compile.CompileSetting;
import d1.d2.PpF1FeaturePackage;
import d1.d2.SpF1FeaturePackage;

public class F1FeatureTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		CompileSetting.compileD2();
	}

	@Test
	public void testSpF1Instance() {
		R1 r1 = new R1();
		R2 r2 = new R2();
		SpF1FeaturePackage fp = new SpF1FeaturePackage(r2, r1);
		assertTrue(true);
	}

	@Test
	public void testPpF1Instance() {
		R1 r1 = new R1();
		R2 r2 = new R2();
		PpF1FeaturePackage fp = new PpF1FeaturePackage(r2, r1);
		assertTrue(true);
	}

}
