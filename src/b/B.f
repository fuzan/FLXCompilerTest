package b;

import a.*;
import external.*;
import ddt.lang.*;

feature B {
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
	bAnddInteract{
		condition: i.largerThan(j);
		event: leave;{
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