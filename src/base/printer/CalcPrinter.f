package base.printer;
import external.*;
import Resources.*;
import base.*;

feature CalcPrinter{
	domain: Base;
	anchor: Calc;
	reportAdding{
		condition: all;
		event: Add e;{
			st.addStr("add " + e.getValue());
		}
	}	
}