package base.featurepackage;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import base.Add;
import base.Exit;
import base.featurepackage.FPFeaturePackage;

import Resources.SyncTool;

import compile.CompileSetting;

public class FeaturePackageTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		CompileSetting.compileFP();
	}

	@Test
	public void testFPPU() {
		SyncTool st = new SyncTool();
		FPFeaturePackage f = new FPFeaturePackage(st);
		f.sendEvent(new Add(0));
		f.sendEvent(new Exit());
		while(!st.isFinished()){
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		assertEquals("inserted by FP", st.getStrs().get(0));
	}

}
