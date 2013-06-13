package base.featurepackage;
import external.*;
import Resources.*;
import Resources.ex.*;
import base.*;

feature package FP{
	domain: Base;
	features: Calc;
	straightPrecedence(Calc);
	
	insertStr{
		condition: all;
		event: Add;{
			st.addStr("inserted by FP");
			Calc;
		}
	}
}