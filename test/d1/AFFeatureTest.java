package d1;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import Resources.R1;

import compile.CompileSetting;

public class AFFeatureTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		CompileSetting.compileAF();
	}

	@Test
	public void testInstance() {
		R1 r1 = new R1();
		AFFeature af = new AFFeature(r1);
		assertTrue(true);
	}
	
	
	@Test
	public void testDefaultExceptionHandler() {
		R1 r1 = new R1();
		AFFeature af = new AFFeature(r1);
		af.sendEvent(new E1());
		assertTrue(true);		
	}

}
