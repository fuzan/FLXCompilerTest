package d1.fp;
import external.*;
import Resources.*;
import Resources.ex.*;
import d1.*;
import d1.d2.*;
import d1.d3.*;

feature package MultipleDomain{
	//domain: D1;
	domains: D1,D2,D3;
	features: F2, F1, AF;
	priorityPrecedence(F2, F1, AF);
	
	public void test(){
		System.out.println("this is a method of FP");
	}
}