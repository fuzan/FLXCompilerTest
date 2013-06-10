package fp;

import ddt.lang.*;
import a.*;
import b.*;
import c.*;
import d.*;
import e.*;
import external.*;

feature package FpFP{
	domain: 	Domain;
	features:	Anchor,B,C,D,E;	
	
	//straightPrecedence(straightPrecedence(B,C),straightPrecedence(D,E),Anchor);


	straightPrecedence( straightPrecedence(B,C, Anchor),
						priorityPrecedence(D,E, Anchor), 
						Anchor);
}