package base.multipledomain;
import external.*;
import Resources.*;
import Resources.ex.*;
import base.*;
import base.minus.*;
import base.multiply.*;

feature package MultipleDomain{
	domains: Base,Minus,Multiply;
	features: Calc, Calc1, Calc2;
	straightPrecedence(Calc2, Calc1, Calc);
}