package d1.d3;
import external.*;
import Resources.*;
import Resources.ex.*;
import d1.*;

feature package PpF2{
	domain: D3;
	features: F2, AF;
	priorityPrecedence(F2, AF);
	
	pu14{
		condition: s.equalsToConstant(S.S2);
		event: leave;{
			System.out.println("leave events");
		}
	}
}