package c;

import a.*;
import external.*;
import ddt.lang.*;

feature C {
	domain:	 Domain;
	anchor:	 Anchor;
	
	allInteract{
		condition: i.lessThan(j);
		event: enter;{
			i.add(1);
		}
	}
	
	bAndcInteract{
		condition: i.lessThan(j);
		event: Init;{
			i.add(1);
		}
	}
}