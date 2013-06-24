package d1.ef;
import external.*;
import Resources.*;
import Resources.ex.*;
import d1.*;

feature package ExceptionHandlingFP{
	domain: EF;
	features: ExceptionHandler,AF;
	priorityPrecedence(AF, ExceptionHandler);
}