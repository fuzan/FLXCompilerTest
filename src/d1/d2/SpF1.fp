package d1.d2;
import external.*;
import Resources.*;
import Resources.ex.*;
import d1.*;

feature package SpF1{
	domain: D2;
	features: F1, AF;
	straightPrecedence(F1, AF);
	
	pu14{
		condition: all;
		event: any;{
			System.out.println("testest");
		}
	}
}