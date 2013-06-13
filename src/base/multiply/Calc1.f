package base.multiply;
import external.*;
import Resources.*;
import Resources.ex.*;
import base.*;

feature Calc1{
	domain: Multiply;
	anchor: Calc;
	priorityPrecedence(Calc1,Calc);
	multiplying{
		condition: all;
		event: Multiply e;{
			int current = total.intValue();
			for(int i = 1; i < e.getValue(); i++){
				total.add(current);
			}
			st.setResult(total.intValue());
		}
	}
	
	exit{
		condition: all;
		event: Exit;{
			st.finishes();	
		}
	}
}