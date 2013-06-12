package base.printer.multiply;
import external.*;
import Resources.*;
import base.*;
import base.multiply.*;
import base.printer.*;

feature package CalcPrinter2FP{
	domain: Multiply;
	features: Calc, Calc1, CalcPrinter, CalcPrinter2;
	straightPrecedence(CalcPrinter2, CalcPrinter, priorityPrecedence(Calc1, Calc));
}