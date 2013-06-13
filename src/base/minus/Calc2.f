package base.minus;
import external.*;
import Resources.*;
import Resources.ex.*;
import base.*;

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
}