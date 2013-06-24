package d1.f4;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import Resources.R1;

import compile.CompileSetting;

public class F4FeatureTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		CompileSetting.compileF4();
	}

	@Test
	public void test() {
		R1 r1 = new R1();
		F4Feature f = new F4Feature(r1);
	}

}
