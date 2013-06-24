package d1.fp;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import Resources.R1;
import Resources.R2;
import Resources.R3;

import compile.CompileSetting;

public class MultipleDomainFeaturePackageTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		CompileSetting.compileMD();
	}

	@Test
	public void test() {
		R1 r1 = new R1();
		R2 r2 = new R2();
		R3 r3 = new R3();
		MultipleDomainFeaturePackage fp = new MultipleDomainFeaturePackage(r1, r2, r3);
		assertTrue(true);
	}

}
