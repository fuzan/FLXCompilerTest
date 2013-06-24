package d1.f4;
import external.*;
import Resources.*;
import Resources.ex.*;
import d1.*;

feature F4{
	domain: D1;
	anchor: AF;
	straightPrecedence(F4,AF);
	pu10{
		condition: s.equalsToConstant(S.S1);
		event: E1;{
			System.out.println(r1);
		}
	}

	pu11{
		condition: s.equalsToConstant(S.S2);
		event: E1;{
			System.out.println(r1);
		}
	}
	
	pu12{
		condition: s.equalsToConstant(S.S1);
		event: E2;{
			System.out.println(r1);
		}
	}
}