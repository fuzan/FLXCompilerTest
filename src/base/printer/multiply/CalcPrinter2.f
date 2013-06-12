package base.printer.multiply;
import external.*;
import Resources.*;
import base.*;
import base.multiply.*;

feature CalcPrinter2{
	domain: Multiply;
	anchor: Calc;
	reportAdding{
		condition: all;
		event: Multiply e;{
			st.addStr("times " + e.getValue());
		}
	}	
}