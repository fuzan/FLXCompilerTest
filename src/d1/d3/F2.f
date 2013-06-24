package d1.d3;
import external.*;
import Resources.*;
import d1.*;

feature F2{
	domain: D3;
	anchor: AF;
	pu7{
		condition: s.equalsTo(S.S1);
		event: d1.E1;{
			System.out.println(r3);
		}
	}	
	
	pu8{
		condition: s.equalsTo(S.S1);
		event: E4;{
			System.out.println(r3);
		}
	}	
	
	pu9{
		condition: s.equalsTo(S.S2);
		event: d1.E2;{
			System.out.println(r3);
		}
	}	
}