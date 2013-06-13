package base.minus;
import external.*;
import Resources.*;
import Resources.ex.*;
import base.*;
import ddt.lang.*;

feature Calc2{
	domain: Minus;
	anchor: Calc;
	priorityPrecedence(Calc2,Calc);
	multiplying{
		condition: all;
		event: Minus e;{
			total.add(-e.getValue());
			st.setResult(total.intValue());
		}
	}	
	
	multipleDomain{
		condition: i.equalsTo(j);
		event: enter;{
			System.out.println("test2");
		}
	}
	
	exit{
		condition: all;
		event: base.Exit;{
			st.finishes();	
		}
	}
}