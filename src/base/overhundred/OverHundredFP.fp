package base.overhundred;
import external.*;
import Resources.*;
import Resources.ex.*;
import base.*;

feature package OverHundredFP{
	domain: OverHundred;
	features: Calc, OverHundred;
	straightPrecedence(CalcPrinter, OverHundred);
}