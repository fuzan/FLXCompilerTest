package d1.d2;
import external.*;
import Resources.*;
import Resources.ex.*;
import d1.*;

feature package PpF1{
	domain: D2;
	features: F1, AF;
	priorityPrecedence(F1, AF);
	
	pu11{
		condition: s.equalsToConstant(S.S4);
		event: enter;{
			System.out.println("test");
		}
	}
	
	pu12{
		condition:s.equalsToConstant(S.S4);
		event: E3;{
			System.out.println("test2");
		}
	}
}