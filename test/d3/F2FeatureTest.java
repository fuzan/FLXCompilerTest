package d3;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import Resources.R1;
import Resources.R2;
import Resources.R3;

import compile.CompileSetting;
import d1.d2.PpF1FeaturePackage;
import d1.d2.SpF1FeaturePackage;
import d1.d3.PpF2FeaturePackage;
import d1.d3.SpF2FeaturePackage;

public class F2FeatureTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		CompileSetting.compileD3();
	}

	@Test
	public void testSpF1Instance() {
		R1 r1 = new R1();
		R3 r3 = new R3();
		SpF2FeaturePackage fp = new SpF2FeaturePackage(r3, r1);
		assertTrue(true);
	}

	@Test
	public void testPpF1Instance() {
		R1 r1 = new R1();
		R3 r3 = new R3();
		PpF2FeaturePackage fp = new PpF2FeaturePackage(r3, r1);
		assertTrue(true);
	}
}
