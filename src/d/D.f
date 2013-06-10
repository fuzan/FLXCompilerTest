package d;

import a.*;
import external.*;
import ddt.lang.*;

feature D {
	domain:	 Domain;
	anchor:	 Anchor;
	
	allInteract{
		condition: i.lessThan(j);
		event: enter;{
			i.add(1);
		}
	}
	
	bAnddInteract{
		condition: i.largerThan(j);
		event: leave;{
			i.add(1);
		}
	}
	
}