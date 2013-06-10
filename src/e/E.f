package e;

import a.*;
import external.*;
import ddt.lang.*;

feature E {
	domain:	 Domain;
	anchor:	 Anchor;
	
	allInteract{
		condition: i.lessThan(j);
		event: enter;{
			i.add(1);
		}
	}
	
	bAndeInteract{
		condition: i.largerThan(j);
		event: Init;{
			i.add(1);
		}
	}
}