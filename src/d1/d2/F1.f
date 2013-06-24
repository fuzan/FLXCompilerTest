package d1.d2;
import external.*;
import Resources.*;
import d1.*;

feature F1{
	domain: D2;
	anchor: AF;
	pu4{
		condition: s.equalsTo(S.S1);
		event: d1.E1;{
			System.out.println(r2);
		}
	}	
	
	pu5{
		condition: s.equalsTo(S.S1);
		event: E3;{
			System.out.println(r2);
		}
	}	
	
	pu6{
		condition: s.equalsTo(S.S2);
		event: d1.E2;{
			System.out.println(r2);
		}
	}	
}