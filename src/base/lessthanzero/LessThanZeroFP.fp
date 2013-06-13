package base.lessthanzero;
import external.*;
import Resources.*;
import Resources.ex.*;
import base.*;

feature package LessThanZeroFP{
	domain: LessThanZero;
	features: Calc, LessThanZero;
	straightPrecedence(CalcPrinter, LessThanZero);
}