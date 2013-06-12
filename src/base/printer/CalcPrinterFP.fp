package base.printer;
import external.*;
import Resources.*;
import base.*;

feature package CalcPrinterFP{
	domain: Base;
	features: Calc, CalcPrinter;
	straightPrecedence(CalcPrinter, Calc);
}