package fp;
import ddt.lang.*;
import a.*;
import b.*;
import c.*;
import d.*;
import e.*;
import external.*;
import java.rmi.*;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

public class 
 FpFPFeaturePackage
 extends DomainDomain  implements Serializable 
{
DFeature _dfeature;
EFeature _efeature;
AnchorFeature _anchorfeature;
BFeature _bfeature;
CFeature _cfeature;

private boolean activated = true;
private Map<String, Boolean> jEntered = new HashMap<String, Boolean>();
private Map<String, Boolean> pCondition = new HashMap<String, Boolean>();
private EventBuffer<FL_EVENT_STEM> sharedBuffer;
private ExecutorService threadExecuter;
public void activate() { activated = true; }
public void deactivate() { activated = false; }
public boolean isActivated() { return activated; }

public FpFPFeaturePackage(int ii) {
super();
// write jEntered Here
jEntered.put("domaindomain.i.lessthan(domaindomain.j)" , false);
jEntered.put("domaindomain.i.lessthan(domaindomain.j)" , false);
jEntered.put("domaindomain.i.lessthan(domaindomain.j)" , false);
jEntered.put("domaindomain.i.lessthan(domaindomain.j)" , false);
jEntered.put("domaindomain.i.lessthan(domaindomain.j)" , false);
jEntered.put("domaindomain.i.lessthan(domaindomain.j)" , false);
jEntered.put("domaindomain.i.lessthan(domaindomain.j)" , false);
jEntered.put("domaindomain.i.lessthan(domaindomain.j)" , false);
jEntered.put("domaindomain.i.lessthan(domaindomain.j)" , false);
jEntered.put("domaindomain.i.lessthan(domaindomain.j)" , false);
jEntered.put("domaindomain.i.lessthan(domaindomain.j)" , false);
jEntered.put("domaindomain.i.lessthan(domaindomain.j)" , false);
jEntered.put("domaindomain.i.lessthan(domaindomain.j)" , false);
jEntered.put("domaindomain.i.lessthan(domaindomain.j)" , false);
jEntered.put("domaindomain.i.lessthan(domaindomain.j)" , false);
jEntered.put("domaindomain.i.lessthan(domaindomain.j)" , false);
jEntered.put("domaindomain.i.lessthan(domaindomain.j)" , false);
jEntered.put("domaindomain.i.lessthan(domaindomain.j)" , false);
jEntered.put("domaindomain.i.lessthan(domaindomain.j)" , false);
jEntered.put("domaindomain.i.lessthan(domaindomain.j)" , false);
jEntered.put("domaindomain.i.lessthan(domaindomain.j)" , false);
jEntered.put("domaindomain.i.lessthan(domaindomain.j)" , false);
jEntered.put("domaindomain.i.lessthan(domaindomain.j)" , false);
jEntered.put("domaindomain.i.lessthan(domaindomain.j)" , false);
jEntered.put("domaindomain.i.lessthan(domaindomain.j)" , false);
jEntered.put("domaindomain.i.lessthan(domaindomain.j)" , false);
jEntered.put("domaindomain.i.lessthan(domaindomain.j)" , false);
jEntered.put("domaindomain.i.lessthan(domaindomain.j)" , false);
jEntered.put("domaindomain.i.lessthan(domaindomain.j)" , false);
jEntered.put("domaindomain.i.lessthan(domaindomain.j)" , false);
jEntered.put("domaindomain.i.lessthan(domaindomain.j)" , false);
this._anchorfeature = new AnchorFeature();
this._bfeature = new BFeature();
this._cfeature = new CFeature();
this._dfeature = new DFeature();
this._efeature = new EFeature();
DomainDomain.ii = ii;
sharedBuffer = new EventBuffer<FL_EVENT_STEM>();
threadExecuter = Executors.newCachedThreadPool();
class Consumer implements Runnable{
private EventBuffer<FL_EVENT_STEM> buffer;
public Consumer(EventBuffer<FL_EVENT_STEM> buffer){
this.buffer = buffer;
}
public void run() {
while(true){
try{
FpFPFeaturePackage.this.XEvent((FL_EVENT_STEM)buffer.remove());
}catch(Exception ex){
ex.printStackTrace();
}//end of catch
}//end of while
}//end of run
}//end of Consumer Class
Consumer consumer = new Consumer(sharedBuffer);
threadExecuter.execute(consumer);
}
public  FpFPFeaturePackage(AnchorFeature _anchorfeature, BFeature _bfeature, CFeature _cfeature, DFeature _dfeature, EFeature _efeature)
 {
super();
// write jEntered Here
jEntered.put("domaindomain.i.lessthan(domaindomain.j)" , false);
jEntered.put("domaindomain.i.lessthan(domaindomain.j)" , false);
jEntered.put("domaindomain.i.lessthan(domaindomain.j)" , false);
jEntered.put("domaindomain.i.lessthan(domaindomain.j)" , false);
jEntered.put("domaindomain.i.lessthan(domaindomain.j)" , false);
jEntered.put("domaindomain.i.lessthan(domaindomain.j)" , false);
jEntered.put("domaindomain.i.lessthan(domaindomain.j)" , false);
jEntered.put("domaindomain.i.lessthan(domaindomain.j)" , false);
jEntered.put("domaindomain.i.lessthan(domaindomain.j)" , false);
jEntered.put("domaindomain.i.lessthan(domaindomain.j)" , false);
jEntered.put("domaindomain.i.lessthan(domaindomain.j)" , false);
jEntered.put("domaindomain.i.lessthan(domaindomain.j)" , false);
jEntered.put("domaindomain.i.lessthan(domaindomain.j)" , false);
jEntered.put("domaindomain.i.lessthan(domaindomain.j)" , false);
jEntered.put("domaindomain.i.lessthan(domaindomain.j)" , false);
jEntered.put("domaindomain.i.lessthan(domaindomain.j)" , false);
jEntered.put("domaindomain.i.lessthan(domaindomain.j)" , false);
jEntered.put("domaindomain.i.lessthan(domaindomain.j)" , false);
jEntered.put("domaindomain.i.lessthan(domaindomain.j)" , false);
jEntered.put("domaindomain.i.lessthan(domaindomain.j)" , false);
jEntered.put("domaindomain.i.lessthan(domaindomain.j)" , false);
jEntered.put("domaindomain.i.lessthan(domaindomain.j)" , false);
jEntered.put("domaindomain.i.lessthan(domaindomain.j)" , false);
jEntered.put("domaindomain.i.lessthan(domaindomain.j)" , false);
jEntered.put("domaindomain.i.lessthan(domaindomain.j)" , false);
jEntered.put("domaindomain.i.lessthan(domaindomain.j)" , false);
jEntered.put("domaindomain.i.lessthan(domaindomain.j)" , false);
jEntered.put("domaindomain.i.lessthan(domaindomain.j)" , false);
jEntered.put("domaindomain.i.lessthan(domaindomain.j)" , false);
jEntered.put("domaindomain.i.lessthan(domaindomain.j)" , false);
jEntered.put("domaindomain.i.lessthan(domaindomain.j)" , false);
this._anchorfeature = _anchorfeature;
this._bfeature = _bfeature;
this._cfeature = _cfeature;
this._dfeature = _dfeature;
this._efeature = _efeature;
}

public synchronized  void sendEvent( FL_EVENT_STEM e ) {
	sharedBuffer.add(e);
}
public synchronized void XEvent( FL_EVENT_STEM e )
{

	if(activated) {
// write pConditions Here
pCondition.put("domaindomain.i.largerthan(domaindomain.j)",DomainDomain.i.largerThan(DomainDomain.j));
pCondition.put("domaindomain.i.largerthan(domaindomain.j)",DomainDomain.i.largerThan(DomainDomain.j));
pCondition.put("domaindomain.i.largerthan(domaindomain.j)",DomainDomain.i.largerThan(DomainDomain.j));
		if ( e instanceof Init) {
			{
			if (DomainDomain.i.largerThan(DomainDomain.j)&&DomainDomain.i.largerThan(DomainDomain.j))
			{_bfeature.bAndeInteract((Init) e);
_efeature.bAndeInteract((Init) e);
			}
			else if (DomainDomain.i.lessThan(DomainDomain.j)&&DomainDomain.i.lessThan(DomainDomain.j))
			{_bfeature.bAndcInteract((Init) e);
_cfeature.bAndcInteract((Init) e);
			}
			else if (DomainDomain.i.lessThan(DomainDomain.j))
			{_bfeature.bAndcInteract((Init) e);
			}
			else if (DomainDomain.i.largerThan(DomainDomain.j))
			{_bfeature.bAndeInteract((Init) e);
			}
			else if (DomainDomain.i.lessThan(DomainDomain.j))
			{_cfeature.bAndcInteract((Init) e);
			}
			else if (DomainDomain.i.largerThan(DomainDomain.j))
			{_efeature.bAndeInteract((Init) e);
			}

			}
			}
// write jEntered Here
if(!DomainDomain.i.lessThan(DomainDomain.j)&&DomainDomain.i.lessThan(DomainDomain.j)&&DomainDomain.i.lessThan(DomainDomain.j)&&DomainDomain.i.lessThan(DomainDomain.j)&&DomainDomain.i.lessThan(DomainDomain.j))
jEntered.put("domaindomain.i.lessthan(domaindomain.j)" , false);
if(!DomainDomain.i.lessThan(DomainDomain.j)&&DomainDomain.i.lessThan(DomainDomain.j)&&DomainDomain.i.lessThan(DomainDomain.j)&&DomainDomain.i.lessThan(DomainDomain.j))
jEntered.put("domaindomain.i.lessthan(domaindomain.j)" , false);
if(!DomainDomain.i.lessThan(DomainDomain.j)&&DomainDomain.i.lessThan(DomainDomain.j)&&DomainDomain.i.lessThan(DomainDomain.j)&&DomainDomain.i.lessThan(DomainDomain.j))
jEntered.put("domaindomain.i.lessthan(domaindomain.j)" , false);
if(!DomainDomain.i.lessThan(DomainDomain.j)&&DomainDomain.i.lessThan(DomainDomain.j)&&DomainDomain.i.lessThan(DomainDomain.j)&&DomainDomain.i.lessThan(DomainDomain.j))
jEntered.put("domaindomain.i.lessthan(domaindomain.j)" , false);
if(!DomainDomain.i.lessThan(DomainDomain.j)&&DomainDomain.i.lessThan(DomainDomain.j)&&DomainDomain.i.lessThan(DomainDomain.j)&&DomainDomain.i.lessThan(DomainDomain.j))
jEntered.put("domaindomain.i.lessthan(domaindomain.j)" , false);
if(!DomainDomain.i.lessThan(DomainDomain.j)&&DomainDomain.i.lessThan(DomainDomain.j)&&DomainDomain.i.lessThan(DomainDomain.j)&&DomainDomain.i.lessThan(DomainDomain.j))
jEntered.put("domaindomain.i.lessthan(domaindomain.j)" , false);
if(!DomainDomain.i.lessThan(DomainDomain.j)&&DomainDomain.i.lessThan(DomainDomain.j)&&DomainDomain.i.lessThan(DomainDomain.j))
jEntered.put("domaindomain.i.lessthan(domaindomain.j)" , false);
if(!DomainDomain.i.lessThan(DomainDomain.j)&&DomainDomain.i.lessThan(DomainDomain.j)&&DomainDomain.i.lessThan(DomainDomain.j))
jEntered.put("domaindomain.i.lessthan(domaindomain.j)" , false);
if(!DomainDomain.i.lessThan(DomainDomain.j)&&DomainDomain.i.lessThan(DomainDomain.j)&&DomainDomain.i.lessThan(DomainDomain.j))
jEntered.put("domaindomain.i.lessthan(domaindomain.j)" , false);
if(!DomainDomain.i.lessThan(DomainDomain.j)&&DomainDomain.i.lessThan(DomainDomain.j)&&DomainDomain.i.lessThan(DomainDomain.j))
jEntered.put("domaindomain.i.lessthan(domaindomain.j)" , false);
if(!DomainDomain.i.lessThan(DomainDomain.j)&&DomainDomain.i.lessThan(DomainDomain.j)&&DomainDomain.i.lessThan(DomainDomain.j))
jEntered.put("domaindomain.i.lessthan(domaindomain.j)" , false);
if(!DomainDomain.i.lessThan(DomainDomain.j)&&DomainDomain.i.lessThan(DomainDomain.j)&&DomainDomain.i.lessThan(DomainDomain.j))
jEntered.put("domaindomain.i.lessthan(domaindomain.j)" , false);
if(!DomainDomain.i.lessThan(DomainDomain.j)&&DomainDomain.i.lessThan(DomainDomain.j)&&DomainDomain.i.lessThan(DomainDomain.j))
jEntered.put("domaindomain.i.lessthan(domaindomain.j)" , false);
if(!DomainDomain.i.lessThan(DomainDomain.j)&&DomainDomain.i.lessThan(DomainDomain.j)&&DomainDomain.i.lessThan(DomainDomain.j))
jEntered.put("domaindomain.i.lessthan(domaindomain.j)" , false);
if(!DomainDomain.i.lessThan(DomainDomain.j)&&DomainDomain.i.lessThan(DomainDomain.j)&&DomainDomain.i.lessThan(DomainDomain.j))
jEntered.put("domaindomain.i.lessthan(domaindomain.j)" , false);
if(!DomainDomain.i.lessThan(DomainDomain.j)&&DomainDomain.i.lessThan(DomainDomain.j)&&DomainDomain.i.lessThan(DomainDomain.j))
jEntered.put("domaindomain.i.lessthan(domaindomain.j)" , false);
if(!DomainDomain.i.lessThan(DomainDomain.j)&&DomainDomain.i.lessThan(DomainDomain.j))
jEntered.put("domaindomain.i.lessthan(domaindomain.j)" , false);
if(!DomainDomain.i.lessThan(DomainDomain.j)&&DomainDomain.i.lessThan(DomainDomain.j))
jEntered.put("domaindomain.i.lessthan(domaindomain.j)" , false);
if(!DomainDomain.i.lessThan(DomainDomain.j)&&DomainDomain.i.lessThan(DomainDomain.j))
jEntered.put("domaindomain.i.lessthan(domaindomain.j)" , false);
if(!DomainDomain.i.lessThan(DomainDomain.j)&&DomainDomain.i.lessThan(DomainDomain.j))
jEntered.put("domaindomain.i.lessthan(domaindomain.j)" , false);
if(!DomainDomain.i.lessThan(DomainDomain.j)&&DomainDomain.i.lessThan(DomainDomain.j))
jEntered.put("domaindomain.i.lessthan(domaindomain.j)" , false);
if(!DomainDomain.i.lessThan(DomainDomain.j)&&DomainDomain.i.lessThan(DomainDomain.j))
jEntered.put("domaindomain.i.lessthan(domaindomain.j)" , false);
if(!DomainDomain.i.lessThan(DomainDomain.j)&&DomainDomain.i.lessThan(DomainDomain.j))
jEntered.put("domaindomain.i.lessthan(domaindomain.j)" , false);
if(!DomainDomain.i.lessThan(DomainDomain.j)&&DomainDomain.i.lessThan(DomainDomain.j))
jEntered.put("domaindomain.i.lessthan(domaindomain.j)" , false);
if(!DomainDomain.i.lessThan(DomainDomain.j)&&DomainDomain.i.lessThan(DomainDomain.j))
jEntered.put("domaindomain.i.lessthan(domaindomain.j)" , false);
if(!DomainDomain.i.lessThan(DomainDomain.j)&&DomainDomain.i.lessThan(DomainDomain.j))
jEntered.put("domaindomain.i.lessthan(domaindomain.j)" , false);
if(!DomainDomain.i.lessThan(DomainDomain.j))
jEntered.put("domaindomain.i.lessthan(domaindomain.j)" , false);
if(!DomainDomain.i.lessThan(DomainDomain.j))
jEntered.put("domaindomain.i.lessthan(domaindomain.j)" , false);
if(!DomainDomain.i.lessThan(DomainDomain.j))
jEntered.put("domaindomain.i.lessthan(domaindomain.j)" , false);
if(!DomainDomain.i.lessThan(DomainDomain.j))
jEntered.put("domaindomain.i.lessthan(domaindomain.j)" , false);
if(!DomainDomain.i.lessThan(DomainDomain.j))
jEntered.put("domaindomain.i.lessthan(domaindomain.j)" , false);
while(true){
boolean noLeaveEvent = true;
boolean noEnterEvent = true;
			{
			if (pCondition.get("domaindomain.i.largerthan(domaindomain.j)") && !(DomainDomain.i.largerThan(DomainDomain.j)&&DomainDomain.i.largerThan(DomainDomain.j)))
			{				noLeaveEvent = false;_bfeature.bAnddInteract(e);
_dfeature.bAnddInteract(e);
			}
			else if (pCondition.get("domaindomain.i.largerthan(domaindomain.j)") && !(DomainDomain.i.largerThan(DomainDomain.j)))
			{				noLeaveEvent = false;_bfeature.bAnddInteract(e);
			}
			else if (pCondition.get("domaindomain.i.largerthan(domaindomain.j)") && !(DomainDomain.i.largerThan(DomainDomain.j)))
			{				noLeaveEvent = false;_dfeature.bAnddInteract(e);
			}

			}
// write pConditions Here
pCondition.put("domaindomain.i.largerthan(domaindomain.j)",DomainDomain.i.largerThan(DomainDomain.j));
pCondition.put("domaindomain.i.largerthan(domaindomain.j)",DomainDomain.i.largerThan(DomainDomain.j));
pCondition.put("domaindomain.i.largerthan(domaindomain.j)",DomainDomain.i.largerThan(DomainDomain.j));
// write jEntered Here
if(!DomainDomain.i.lessThan(DomainDomain.j)&&DomainDomain.i.lessThan(DomainDomain.j)&&DomainDomain.i.lessThan(DomainDomain.j)&&DomainDomain.i.lessThan(DomainDomain.j)&&DomainDomain.i.lessThan(DomainDomain.j))
jEntered.put("domaindomain.i.lessthan(domaindomain.j)" , false);
if(!DomainDomain.i.lessThan(DomainDomain.j)&&DomainDomain.i.lessThan(DomainDomain.j)&&DomainDomain.i.lessThan(DomainDomain.j)&&DomainDomain.i.lessThan(DomainDomain.j))
jEntered.put("domaindomain.i.lessthan(domaindomain.j)" , false);
if(!DomainDomain.i.lessThan(DomainDomain.j)&&DomainDomain.i.lessThan(DomainDomain.j)&&DomainDomain.i.lessThan(DomainDomain.j)&&DomainDomain.i.lessThan(DomainDomain.j))
jEntered.put("domaindomain.i.lessthan(domaindomain.j)" , false);
if(!DomainDomain.i.lessThan(DomainDomain.j)&&DomainDomain.i.lessThan(DomainDomain.j)&&DomainDomain.i.lessThan(DomainDomain.j)&&DomainDomain.i.lessThan(DomainDomain.j))
jEntered.put("domaindomain.i.lessthan(domaindomain.j)" , false);
if(!DomainDomain.i.lessThan(DomainDomain.j)&&DomainDomain.i.lessThan(DomainDomain.j)&&DomainDomain.i.lessThan(DomainDomain.j)&&DomainDomain.i.lessThan(DomainDomain.j))
jEntered.put("domaindomain.i.lessthan(domaindomain.j)" , false);
if(!DomainDomain.i.lessThan(DomainDomain.j)&&DomainDomain.i.lessThan(DomainDomain.j)&&DomainDomain.i.lessThan(DomainDomain.j)&&DomainDomain.i.lessThan(DomainDomain.j))
jEntered.put("domaindomain.i.lessthan(domaindomain.j)" , false);
if(!DomainDomain.i.lessThan(DomainDomain.j)&&DomainDomain.i.lessThan(DomainDomain.j)&&DomainDomain.i.lessThan(DomainDomain.j))
jEntered.put("domaindomain.i.lessthan(domaindomain.j)" , false);
if(!DomainDomain.i.lessThan(DomainDomain.j)&&DomainDomain.i.lessThan(DomainDomain.j)&&DomainDomain.i.lessThan(DomainDomain.j))
jEntered.put("domaindomain.i.lessthan(domaindomain.j)" , false);
if(!DomainDomain.i.lessThan(DomainDomain.j)&&DomainDomain.i.lessThan(DomainDomain.j)&&DomainDomain.i.lessThan(DomainDomain.j))
jEntered.put("domaindomain.i.lessthan(domaindomain.j)" , false);
if(!DomainDomain.i.lessThan(DomainDomain.j)&&DomainDomain.i.lessThan(DomainDomain.j)&&DomainDomain.i.lessThan(DomainDomain.j))
jEntered.put("domaindomain.i.lessthan(domaindomain.j)" , false);
if(!DomainDomain.i.lessThan(DomainDomain.j)&&DomainDomain.i.lessThan(DomainDomain.j)&&DomainDomain.i.lessThan(DomainDomain.j))
jEntered.put("domaindomain.i.lessthan(domaindomain.j)" , false);
if(!DomainDomain.i.lessThan(DomainDomain.j)&&DomainDomain.i.lessThan(DomainDomain.j)&&DomainDomain.i.lessThan(DomainDomain.j))
jEntered.put("domaindomain.i.lessthan(domaindomain.j)" , false);
if(!DomainDomain.i.lessThan(DomainDomain.j)&&DomainDomain.i.lessThan(DomainDomain.j)&&DomainDomain.i.lessThan(DomainDomain.j))
jEntered.put("domaindomain.i.lessthan(domaindomain.j)" , false);
if(!DomainDomain.i.lessThan(DomainDomain.j)&&DomainDomain.i.lessThan(DomainDomain.j)&&DomainDomain.i.lessThan(DomainDomain.j))
jEntered.put("domaindomain.i.lessthan(domaindomain.j)" , false);
if(!DomainDomain.i.lessThan(DomainDomain.j)&&DomainDomain.i.lessThan(DomainDomain.j)&&DomainDomain.i.lessThan(DomainDomain.j))
jEntered.put("domaindomain.i.lessthan(domaindomain.j)" , false);
if(!DomainDomain.i.lessThan(DomainDomain.j)&&DomainDomain.i.lessThan(DomainDomain.j)&&DomainDomain.i.lessThan(DomainDomain.j))
jEntered.put("domaindomain.i.lessthan(domaindomain.j)" , false);
if(!DomainDomain.i.lessThan(DomainDomain.j)&&DomainDomain.i.lessThan(DomainDomain.j))
jEntered.put("domaindomain.i.lessthan(domaindomain.j)" , false);
if(!DomainDomain.i.lessThan(DomainDomain.j)&&DomainDomain.i.lessThan(DomainDomain.j))
jEntered.put("domaindomain.i.lessthan(domaindomain.j)" , false);
if(!DomainDomain.i.lessThan(DomainDomain.j)&&DomainDomain.i.lessThan(DomainDomain.j))
jEntered.put("domaindomain.i.lessthan(domaindomain.j)" , false);
if(!DomainDomain.i.lessThan(DomainDomain.j)&&DomainDomain.i.lessThan(DomainDomain.j))
jEntered.put("domaindomain.i.lessthan(domaindomain.j)" , false);
if(!DomainDomain.i.lessThan(DomainDomain.j)&&DomainDomain.i.lessThan(DomainDomain.j))
jEntered.put("domaindomain.i.lessthan(domaindomain.j)" , false);
if(!DomainDomain.i.lessThan(DomainDomain.j)&&DomainDomain.i.lessThan(DomainDomain.j))
jEntered.put("domaindomain.i.lessthan(domaindomain.j)" , false);
if(!DomainDomain.i.lessThan(DomainDomain.j)&&DomainDomain.i.lessThan(DomainDomain.j))
jEntered.put("domaindomain.i.lessthan(domaindomain.j)" , false);
if(!DomainDomain.i.lessThan(DomainDomain.j)&&DomainDomain.i.lessThan(DomainDomain.j))
jEntered.put("domaindomain.i.lessthan(domaindomain.j)" , false);
if(!DomainDomain.i.lessThan(DomainDomain.j)&&DomainDomain.i.lessThan(DomainDomain.j))
jEntered.put("domaindomain.i.lessthan(domaindomain.j)" , false);
if(!DomainDomain.i.lessThan(DomainDomain.j)&&DomainDomain.i.lessThan(DomainDomain.j))
jEntered.put("domaindomain.i.lessthan(domaindomain.j)" , false);
if(!DomainDomain.i.lessThan(DomainDomain.j))
jEntered.put("domaindomain.i.lessthan(domaindomain.j)" , false);
if(!DomainDomain.i.lessThan(DomainDomain.j))
jEntered.put("domaindomain.i.lessthan(domaindomain.j)" , false);
if(!DomainDomain.i.lessThan(DomainDomain.j))
jEntered.put("domaindomain.i.lessthan(domaindomain.j)" , false);
if(!DomainDomain.i.lessThan(DomainDomain.j))
jEntered.put("domaindomain.i.lessthan(domaindomain.j)" , false);
if(!DomainDomain.i.lessThan(DomainDomain.j))
jEntered.put("domaindomain.i.lessthan(domaindomain.j)" , false);
			{
			if (!jEntered.get("domaindomain.i.lessthan(domaindomain.j)")&&DomainDomain.i.lessThan(DomainDomain.j)&&DomainDomain.i.lessThan(DomainDomain.j)&&DomainDomain.i.lessThan(DomainDomain.j)&&DomainDomain.i.lessThan(DomainDomain.j)&&DomainDomain.i.lessThan(DomainDomain.j))
			{				noEnterEvent = false;_bfeature.allInteract(e);
jEntered.put("domaindomain.i.lessthan(domaindomain.j)" , DomainDomain.i.lessThan(DomainDomain.j));_cfeature.allInteract(e);
jEntered.put("domaindomain.i.lessthan(domaindomain.j)" , DomainDomain.i.lessThan(DomainDomain.j));_dfeature.allInteract(e);
jEntered.put("domaindomain.i.lessthan(domaindomain.j)" , DomainDomain.i.lessThan(DomainDomain.j));			}
			else if (!jEntered.get("domaindomain.i.lessthan(domaindomain.j)")&&DomainDomain.i.lessThan(DomainDomain.j)&&DomainDomain.i.lessThan(DomainDomain.j)&&DomainDomain.i.lessThan(DomainDomain.j)&&DomainDomain.i.lessThan(DomainDomain.j))
			{				noEnterEvent = false;_bfeature.allInteract(e);
jEntered.put("domaindomain.i.lessthan(domaindomain.j)" , DomainDomain.i.lessThan(DomainDomain.j));_cfeature.allInteract(e);
jEntered.put("domaindomain.i.lessthan(domaindomain.j)" , DomainDomain.i.lessThan(DomainDomain.j));_efeature.allInteract(e);
jEntered.put("domaindomain.i.lessthan(domaindomain.j)" , DomainDomain.i.lessThan(DomainDomain.j));			}
			else if (!jEntered.get("domaindomain.i.lessthan(domaindomain.j)")&&DomainDomain.i.lessThan(DomainDomain.j)&&DomainDomain.i.lessThan(DomainDomain.j)&&DomainDomain.i.lessThan(DomainDomain.j)&&DomainDomain.i.lessThan(DomainDomain.j))
			{				noEnterEvent = false;_cfeature.allInteract(e);
jEntered.put("domaindomain.i.lessthan(domaindomain.j)" , DomainDomain.i.lessThan(DomainDomain.j));_dfeature.allInteract(e);
jEntered.put("domaindomain.i.lessthan(domaindomain.j)" , DomainDomain.i.lessThan(DomainDomain.j));			}
			else if (!jEntered.get("domaindomain.i.lessthan(domaindomain.j)")&&DomainDomain.i.lessThan(DomainDomain.j)&&DomainDomain.i.lessThan(DomainDomain.j)&&DomainDomain.i.lessThan(DomainDomain.j)&&DomainDomain.i.lessThan(DomainDomain.j))
			{				noEnterEvent = false;_bfeature.allInteract(e);
jEntered.put("domaindomain.i.lessthan(domaindomain.j)" , DomainDomain.i.lessThan(DomainDomain.j));_dfeature.allInteract(e);
jEntered.put("domaindomain.i.lessthan(domaindomain.j)" , DomainDomain.i.lessThan(DomainDomain.j));			}
			else if (!jEntered.get("domaindomain.i.lessthan(domaindomain.j)")&&DomainDomain.i.lessThan(DomainDomain.j)&&DomainDomain.i.lessThan(DomainDomain.j)&&DomainDomain.i.lessThan(DomainDomain.j)&&DomainDomain.i.lessThan(DomainDomain.j))
			{				noEnterEvent = false;_bfeature.allInteract(e);
jEntered.put("domaindomain.i.lessthan(domaindomain.j)" , DomainDomain.i.lessThan(DomainDomain.j));_cfeature.allInteract(e);
jEntered.put("domaindomain.i.lessthan(domaindomain.j)" , DomainDomain.i.lessThan(DomainDomain.j));_dfeature.allInteract(e);
jEntered.put("domaindomain.i.lessthan(domaindomain.j)" , DomainDomain.i.lessThan(DomainDomain.j));			}
			else if (!jEntered.get("domaindomain.i.lessthan(domaindomain.j)")&&DomainDomain.i.lessThan(DomainDomain.j)&&DomainDomain.i.lessThan(DomainDomain.j)&&DomainDomain.i.lessThan(DomainDomain.j)&&DomainDomain.i.lessThan(DomainDomain.j))
			{				noEnterEvent = false;_bfeature.allInteract(e);
jEntered.put("domaindomain.i.lessthan(domaindomain.j)" , DomainDomain.i.lessThan(DomainDomain.j));_cfeature.allInteract(e);
jEntered.put("domaindomain.i.lessthan(domaindomain.j)" , DomainDomain.i.lessThan(DomainDomain.j));_dfeature.allInteract(e);
jEntered.put("domaindomain.i.lessthan(domaindomain.j)" , DomainDomain.i.lessThan(DomainDomain.j));			}
			else if (!jEntered.get("domaindomain.i.lessthan(domaindomain.j)")&&DomainDomain.i.lessThan(DomainDomain.j)&&DomainDomain.i.lessThan(DomainDomain.j)&&DomainDomain.i.lessThan(DomainDomain.j))
			{				noEnterEvent = false;_cfeature.allInteract(e);
jEntered.put("domaindomain.i.lessthan(domaindomain.j)" , DomainDomain.i.lessThan(DomainDomain.j));_efeature.allInteract(e);
jEntered.put("domaindomain.i.lessthan(domaindomain.j)" , DomainDomain.i.lessThan(DomainDomain.j));			}
			else if (!jEntered.get("domaindomain.i.lessthan(domaindomain.j)")&&DomainDomain.i.lessThan(DomainDomain.j)&&DomainDomain.i.lessThan(DomainDomain.j)&&DomainDomain.i.lessThan(DomainDomain.j))
			{				noEnterEvent = false;_bfeature.allInteract(e);
jEntered.put("domaindomain.i.lessthan(domaindomain.j)" , DomainDomain.i.lessThan(DomainDomain.j));_efeature.allInteract(e);
jEntered.put("domaindomain.i.lessthan(domaindomain.j)" , DomainDomain.i.lessThan(DomainDomain.j));			}
			else if (!jEntered.get("domaindomain.i.lessthan(domaindomain.j)")&&DomainDomain.i.lessThan(DomainDomain.j)&&DomainDomain.i.lessThan(DomainDomain.j)&&DomainDomain.i.lessThan(DomainDomain.j))
			{				noEnterEvent = false;_bfeature.allInteract(e);
jEntered.put("domaindomain.i.lessthan(domaindomain.j)" , DomainDomain.i.lessThan(DomainDomain.j));_cfeature.allInteract(e);
jEntered.put("domaindomain.i.lessthan(domaindomain.j)" , DomainDomain.i.lessThan(DomainDomain.j));_efeature.allInteract(e);
jEntered.put("domaindomain.i.lessthan(domaindomain.j)" , DomainDomain.i.lessThan(DomainDomain.j));			}
			else if (!jEntered.get("domaindomain.i.lessthan(domaindomain.j)")&&DomainDomain.i.lessThan(DomainDomain.j)&&DomainDomain.i.lessThan(DomainDomain.j)&&DomainDomain.i.lessThan(DomainDomain.j))
			{				noEnterEvent = false;_bfeature.allInteract(e);
jEntered.put("domaindomain.i.lessthan(domaindomain.j)" , DomainDomain.i.lessThan(DomainDomain.j));_cfeature.allInteract(e);
jEntered.put("domaindomain.i.lessthan(domaindomain.j)" , DomainDomain.i.lessThan(DomainDomain.j));_anchorfeature.allInteract(e);
jEntered.put("domaindomain.i.lessthan(domaindomain.j)" , DomainDomain.i.lessThan(DomainDomain.j));			}
			else if (!jEntered.get("domaindomain.i.lessthan(domaindomain.j)")&&DomainDomain.i.lessThan(DomainDomain.j)&&DomainDomain.i.lessThan(DomainDomain.j)&&DomainDomain.i.lessThan(DomainDomain.j))
			{				noEnterEvent = false;_dfeature.allInteract(e);
jEntered.put("domaindomain.i.lessthan(domaindomain.j)" , DomainDomain.i.lessThan(DomainDomain.j));			}
			else if (!jEntered.get("domaindomain.i.lessthan(domaindomain.j)")&&DomainDomain.i.lessThan(DomainDomain.j)&&DomainDomain.i.lessThan(DomainDomain.j)&&DomainDomain.i.lessThan(DomainDomain.j))
			{				noEnterEvent = false;_cfeature.allInteract(e);
jEntered.put("domaindomain.i.lessthan(domaindomain.j)" , DomainDomain.i.lessThan(DomainDomain.j));_dfeature.allInteract(e);
jEntered.put("domaindomain.i.lessthan(domaindomain.j)" , DomainDomain.i.lessThan(DomainDomain.j));			}
			else if (!jEntered.get("domaindomain.i.lessthan(domaindomain.j)")&&DomainDomain.i.lessThan(DomainDomain.j)&&DomainDomain.i.lessThan(DomainDomain.j)&&DomainDomain.i.lessThan(DomainDomain.j))
			{				noEnterEvent = false;_cfeature.allInteract(e);
jEntered.put("domaindomain.i.lessthan(domaindomain.j)" , DomainDomain.i.lessThan(DomainDomain.j));_dfeature.allInteract(e);
jEntered.put("domaindomain.i.lessthan(domaindomain.j)" , DomainDomain.i.lessThan(DomainDomain.j));			}
			else if (!jEntered.get("domaindomain.i.lessthan(domaindomain.j)")&&DomainDomain.i.lessThan(DomainDomain.j)&&DomainDomain.i.lessThan(DomainDomain.j)&&DomainDomain.i.lessThan(DomainDomain.j))
			{				noEnterEvent = false;_bfeature.allInteract(e);
jEntered.put("domaindomain.i.lessthan(domaindomain.j)" , DomainDomain.i.lessThan(DomainDomain.j));_dfeature.allInteract(e);
jEntered.put("domaindomain.i.lessthan(domaindomain.j)" , DomainDomain.i.lessThan(DomainDomain.j));			}
			else if (!jEntered.get("domaindomain.i.lessthan(domaindomain.j)")&&DomainDomain.i.lessThan(DomainDomain.j)&&DomainDomain.i.lessThan(DomainDomain.j)&&DomainDomain.i.lessThan(DomainDomain.j))
			{				noEnterEvent = false;_bfeature.allInteract(e);
jEntered.put("domaindomain.i.lessthan(domaindomain.j)" , DomainDomain.i.lessThan(DomainDomain.j));_dfeature.allInteract(e);
jEntered.put("domaindomain.i.lessthan(domaindomain.j)" , DomainDomain.i.lessThan(DomainDomain.j));			}
			else if (!jEntered.get("domaindomain.i.lessthan(domaindomain.j)")&&DomainDomain.i.lessThan(DomainDomain.j)&&DomainDomain.i.lessThan(DomainDomain.j)&&DomainDomain.i.lessThan(DomainDomain.j))
			{				noEnterEvent = false;_bfeature.allInteract(e);
jEntered.put("domaindomain.i.lessthan(domaindomain.j)" , DomainDomain.i.lessThan(DomainDomain.j));_cfeature.allInteract(e);
jEntered.put("domaindomain.i.lessthan(domaindomain.j)" , DomainDomain.i.lessThan(DomainDomain.j));_dfeature.allInteract(e);
jEntered.put("domaindomain.i.lessthan(domaindomain.j)" , DomainDomain.i.lessThan(DomainDomain.j));			}
			else if (!jEntered.get("domaindomain.i.lessthan(domaindomain.j)")&&DomainDomain.i.lessThan(DomainDomain.j)&&DomainDomain.i.lessThan(DomainDomain.j))
			{				noEnterEvent = false;_efeature.allInteract(e);
jEntered.put("domaindomain.i.lessthan(domaindomain.j)" , DomainDomain.i.lessThan(DomainDomain.j));			}
			else if (!jEntered.get("domaindomain.i.lessthan(domaindomain.j)")&&DomainDomain.i.lessThan(DomainDomain.j)&&DomainDomain.i.lessThan(DomainDomain.j))
			{				noEnterEvent = false;_cfeature.allInteract(e);
jEntered.put("domaindomain.i.lessthan(domaindomain.j)" , DomainDomain.i.lessThan(DomainDomain.j));_efeature.allInteract(e);
jEntered.put("domaindomain.i.lessthan(domaindomain.j)" , DomainDomain.i.lessThan(DomainDomain.j));			}
			else if (!jEntered.get("domaindomain.i.lessthan(domaindomain.j)")&&DomainDomain.i.lessThan(DomainDomain.j)&&DomainDomain.i.lessThan(DomainDomain.j))
			{				noEnterEvent = false;_cfeature.allInteract(e);
jEntered.put("domaindomain.i.lessthan(domaindomain.j)" , DomainDomain.i.lessThan(DomainDomain.j));_anchorfeature.allInteract(e);
jEntered.put("domaindomain.i.lessthan(domaindomain.j)" , DomainDomain.i.lessThan(DomainDomain.j));			}
			else if (!jEntered.get("domaindomain.i.lessthan(domaindomain.j)")&&DomainDomain.i.lessThan(DomainDomain.j)&&DomainDomain.i.lessThan(DomainDomain.j))
			{				noEnterEvent = false;_bfeature.allInteract(e);
jEntered.put("domaindomain.i.lessthan(domaindomain.j)" , DomainDomain.i.lessThan(DomainDomain.j));_efeature.allInteract(e);
jEntered.put("domaindomain.i.lessthan(domaindomain.j)" , DomainDomain.i.lessThan(DomainDomain.j));			}
			else if (!jEntered.get("domaindomain.i.lessthan(domaindomain.j)")&&DomainDomain.i.lessThan(DomainDomain.j)&&DomainDomain.i.lessThan(DomainDomain.j))
			{				noEnterEvent = false;_bfeature.allInteract(e);
jEntered.put("domaindomain.i.lessthan(domaindomain.j)" , DomainDomain.i.lessThan(DomainDomain.j));_anchorfeature.allInteract(e);
jEntered.put("domaindomain.i.lessthan(domaindomain.j)" , DomainDomain.i.lessThan(DomainDomain.j));			}
			else if (!jEntered.get("domaindomain.i.lessthan(domaindomain.j)")&&DomainDomain.i.lessThan(DomainDomain.j)&&DomainDomain.i.lessThan(DomainDomain.j))
			{				noEnterEvent = false;_bfeature.allInteract(e);
jEntered.put("domaindomain.i.lessthan(domaindomain.j)" , DomainDomain.i.lessThan(DomainDomain.j));_cfeature.allInteract(e);
jEntered.put("domaindomain.i.lessthan(domaindomain.j)" , DomainDomain.i.lessThan(DomainDomain.j));			}
			else if (!jEntered.get("domaindomain.i.lessthan(domaindomain.j)")&&DomainDomain.i.lessThan(DomainDomain.j)&&DomainDomain.i.lessThan(DomainDomain.j))
			{				noEnterEvent = false;_dfeature.allInteract(e);
jEntered.put("domaindomain.i.lessthan(domaindomain.j)" , DomainDomain.i.lessThan(DomainDomain.j));			}
			else if (!jEntered.get("domaindomain.i.lessthan(domaindomain.j)")&&DomainDomain.i.lessThan(DomainDomain.j)&&DomainDomain.i.lessThan(DomainDomain.j))
			{				noEnterEvent = false;_dfeature.allInteract(e);
jEntered.put("domaindomain.i.lessthan(domaindomain.j)" , DomainDomain.i.lessThan(DomainDomain.j));			}
			else if (!jEntered.get("domaindomain.i.lessthan(domaindomain.j)")&&DomainDomain.i.lessThan(DomainDomain.j)&&DomainDomain.i.lessThan(DomainDomain.j))
			{				noEnterEvent = false;_cfeature.allInteract(e);
jEntered.put("domaindomain.i.lessthan(domaindomain.j)" , DomainDomain.i.lessThan(DomainDomain.j));_dfeature.allInteract(e);
jEntered.put("domaindomain.i.lessthan(domaindomain.j)" , DomainDomain.i.lessThan(DomainDomain.j));			}
			else if (!jEntered.get("domaindomain.i.lessthan(domaindomain.j)")&&DomainDomain.i.lessThan(DomainDomain.j)&&DomainDomain.i.lessThan(DomainDomain.j))
			{				noEnterEvent = false;_bfeature.allInteract(e);
jEntered.put("domaindomain.i.lessthan(domaindomain.j)" , DomainDomain.i.lessThan(DomainDomain.j));_dfeature.allInteract(e);
jEntered.put("domaindomain.i.lessthan(domaindomain.j)" , DomainDomain.i.lessThan(DomainDomain.j));			}
			else if (!jEntered.get("domaindomain.i.lessthan(domaindomain.j)")&&DomainDomain.i.lessThan(DomainDomain.j))
			{				noEnterEvent = false;_anchorfeature.allInteract(e);
jEntered.put("domaindomain.i.lessthan(domaindomain.j)" , DomainDomain.i.lessThan(DomainDomain.j));			}
			else if (!jEntered.get("domaindomain.i.lessthan(domaindomain.j)")&&DomainDomain.i.lessThan(DomainDomain.j))
			{				noEnterEvent = false;_bfeature.allInteract(e);
jEntered.put("domaindomain.i.lessthan(domaindomain.j)" , DomainDomain.i.lessThan(DomainDomain.j));			}
			else if (!jEntered.get("domaindomain.i.lessthan(domaindomain.j)")&&DomainDomain.i.lessThan(DomainDomain.j))
			{				noEnterEvent = false;_cfeature.allInteract(e);
jEntered.put("domaindomain.i.lessthan(domaindomain.j)" , DomainDomain.i.lessThan(DomainDomain.j));			}
			else if (!jEntered.get("domaindomain.i.lessthan(domaindomain.j)")&&DomainDomain.i.lessThan(DomainDomain.j))
			{				noEnterEvent = false;_dfeature.allInteract(e);
jEntered.put("domaindomain.i.lessthan(domaindomain.j)" , DomainDomain.i.lessThan(DomainDomain.j));			}
			else if (!jEntered.get("domaindomain.i.lessthan(domaindomain.j)")&&DomainDomain.i.lessThan(DomainDomain.j))
			{				noEnterEvent = false;_efeature.allInteract(e);
jEntered.put("domaindomain.i.lessthan(domaindomain.j)" , DomainDomain.i.lessThan(DomainDomain.j));			}

			}
if(noLeaveEvent && noEnterEvent) break;
}
	}

}

protected void finalize() {
try {
super.finalize();
} catch(Throwable e) {
// do nothing
}
}

}
/* IntermediateInfo:FeatureInteractionTable*************
¬í sr "core.table.FeatureInteractionTable¤VôéÚ6Læ Z 
emptyTableZ isFeatureNameSetL 	andSymbolt Ljava/lang/String;L 
eventNodest Ljava/util/Hashtable;L featureNameq ~ xpt &&sr java.util.Hashtable»%!Jä¸ F 
loadFactorI 	thresholdxp?@     w      t leavesq ~ ?@     w      t allsr core.table.OrderedHashtablexd ÞÒd!0 L keyOrderListt Ljava/util/LinkedList;xq ~ ?@     w      t +B.DomainDomain.i.largerThan(DomainDomain.j)sr java.util.LinkedList)S]J`ˆ"  xpw   sr core.table.FITsubentry‘Ñ%×Æu¨R L featureNameEntryq ~ L programBodyEntryq ~ L programUnitNameEntryq ~ xpt Bt {    i  . add (1)  ; }t bAnddInteractxt +D.DomainDomain.i.largerThan(DomainDomain.j)sq ~ w   sq ~ t Dt {    i  . add (1)  ; }t bAnddInteractxt XB.DomainDomain.i.largerThan(DomainDomain.j)&&D.DomainDomain.i.largerThan(DomainDomain.j)sq ~ w   q ~ q ~ xxsq ~ w   q ~ q ~ q ~ xxt domain.Initsq ~ ?@     w      q ~ 	sq ~ 
?@     w      t +E.DomainDomain.i.largerThan(DomainDomain.j)sq ~ w   sq ~ t Et {    i  . add (1)  ; }t bAndeInteractxt )B.DomainDomain.i.lessThan(DomainDomain.j)sq ~ w   sq ~ q ~ t {    i  . add (1)  ; }t bAndcInteractxt XB.DomainDomain.i.largerThan(DomainDomain.j)&&E.DomainDomain.i.largerThan(DomainDomain.j)sq ~ w   sq ~ q ~ t {    i  . add (1)  ; }t bAndeInteractq ~ #xt +B.DomainDomain.i.largerThan(DomainDomain.j)sq ~ w   q ~ .xt TB.DomainDomain.i.lessThan(DomainDomain.j)&&C.DomainDomain.i.lessThan(DomainDomain.j)sq ~ w   q ~ )sq ~ t Ct {    i  . add (1)  ; }t bAndcInteractxt )C.DomainDomain.i.lessThan(DomainDomain.j)sq ~ w   q ~ 5xxsq ~ w   q ~ ,q ~ 3q ~ 'q ~ 1q ~ 9q ~ !xxt entersq ~ ?@     w      t allsq ~ 
?@     #w   /   t „B.DomainDomain.i.lessThan(DomainDomain.j)&&E.DomainDomain.i.lessThan(DomainDomain.j)&&Anchor.DomainDomain.i.lessThan(DomainDomain.j)sq ~ w   sq ~ q ~ t {    i  . add (1)  ; }t allInteractsq ~ q ~ $t {    i  . add (1)  ; }t allInteractxt ¯B.DomainDomain.i.lessThan(DomainDomain.j)&&C.DomainDomain.i.lessThan(DomainDomain.j)&&E.DomainDomain.i.lessThan(DomainDomain.j)&&Anchor.DomainDomain.i.lessThan(DomainDomain.j)sq ~ w   q ~ Bsq ~ q ~ 6t {    i  . add (1)  ; }t allInteractq ~ Ext „C.DomainDomain.i.lessThan(DomainDomain.j)&&D.DomainDomain.i.lessThan(DomainDomain.j)&&Anchor.DomainDomain.i.lessThan(DomainDomain.j)sq ~ w   q ~ Jsq ~ q ~ t {    i  . add (1)  ; }t allInteractxt ¯C.DomainDomain.i.lessThan(DomainDomain.j)&&D.DomainDomain.i.lessThan(DomainDomain.j)&&E.DomainDomain.i.lessThan(DomainDomain.j)&&Anchor.DomainDomain.i.lessThan(DomainDomain.j)sq ~ w   q ~ Jq ~ Oxt YD.DomainDomain.i.lessThan(DomainDomain.j)&&Anchor.DomainDomain.i.lessThan(DomainDomain.j)sq ~ w   q ~ Oxt B.DomainDomain.i.lessThan(DomainDomain.j)&&C.DomainDomain.i.lessThan(DomainDomain.j)&&E.DomainDomain.i.lessThan(DomainDomain.j)sq ~ w   q ~ Bq ~ Jq ~ Ext )E.DomainDomain.i.lessThan(DomainDomain.j)sq ~ w   q ~ Ext B.DomainDomain.i.lessThan(DomainDomain.j)&&C.DomainDomain.i.lessThan(DomainDomain.j)&&D.DomainDomain.i.lessThan(DomainDomain.j)sq ~ w   q ~ Bq ~ Jq ~ Oxt )D.DomainDomain.i.lessThan(DomainDomain.j)sq ~ w   q ~ Oxt )C.DomainDomain.i.lessThan(DomainDomain.j)sq ~ w   q ~ Jxt )B.DomainDomain.i.lessThan(DomainDomain.j)sq ~ w   q ~ Bxt „C.DomainDomain.i.lessThan(DomainDomain.j)&&E.DomainDomain.i.lessThan(DomainDomain.j)&&Anchor.DomainDomain.i.lessThan(DomainDomain.j)sq ~ w   q ~ Jq ~ Ext ¯B.DomainDomain.i.lessThan(DomainDomain.j)&&D.DomainDomain.i.lessThan(DomainDomain.j)&&E.DomainDomain.i.lessThan(DomainDomain.j)&&Anchor.DomainDomain.i.lessThan(DomainDomain.j)sq ~ w   q ~ Bq ~ Oxt TC.DomainDomain.i.lessThan(DomainDomain.j)&&E.DomainDomain.i.lessThan(DomainDomain.j)sq ~ w   q ~ Jq ~ Ext YE.DomainDomain.i.lessThan(DomainDomain.j)&&Anchor.DomainDomain.i.lessThan(DomainDomain.j)sq ~ w   q ~ Ext TC.DomainDomain.i.lessThan(DomainDomain.j)&&D.DomainDomain.i.lessThan(DomainDomain.j)sq ~ w   q ~ Jq ~ Oxt C.DomainDomain.i.lessThan(DomainDomain.j)&&D.DomainDomain.i.lessThan(DomainDomain.j)&&E.DomainDomain.i.lessThan(DomainDomain.j)sq ~ w   q ~ Jq ~ Oxt B.DomainDomain.i.lessThan(DomainDomain.j)&&D.DomainDomain.i.lessThan(DomainDomain.j)&&E.DomainDomain.i.lessThan(DomainDomain.j)sq ~ w   q ~ Bq ~ Oxt „B.DomainDomain.i.lessThan(DomainDomain.j)&&C.DomainDomain.i.lessThan(DomainDomain.j)&&Anchor.DomainDomain.i.lessThan(DomainDomain.j)sq ~ w   q ~ Bq ~ Jsq ~ t Anchort {    i  . add (1)  ; }t allInteractxt ÚB.DomainDomain.i.lessThan(DomainDomain.j)&&C.DomainDomain.i.lessThan(DomainDomain.j)&&D.DomainDomain.i.lessThan(DomainDomain.j)&&E.DomainDomain.i.lessThan(DomainDomain.j)&&Anchor.DomainDomain.i.lessThan(DomainDomain.j)sq ~ w   q ~ Bq ~ Jq ~ Oxt TB.DomainDomain.i.lessThan(DomainDomain.j)&&E.DomainDomain.i.lessThan(DomainDomain.j)sq ~ w   q ~ Bq ~ Ext YB.DomainDomain.i.lessThan(DomainDomain.j)&&Anchor.DomainDomain.i.lessThan(DomainDomain.j)sq ~ w   q ~ Bq ~ rxt „D.DomainDomain.i.lessThan(DomainDomain.j)&&E.DomainDomain.i.lessThan(DomainDomain.j)&&Anchor.DomainDomain.i.lessThan(DomainDomain.j)sq ~ w   q ~ Oxt TB.DomainDomain.i.lessThan(DomainDomain.j)&&D.DomainDomain.i.lessThan(DomainDomain.j)sq ~ w   q ~ Bq ~ Oxt TB.DomainDomain.i.lessThan(DomainDomain.j)&&C.DomainDomain.i.lessThan(DomainDomain.j)sq ~ w   q ~ Bq ~ Jxt TD.DomainDomain.i.lessThan(DomainDomain.j)&&E.DomainDomain.i.lessThan(DomainDomain.j)sq ~ w   q ~ Oxt ªB.DomainDomain.i.lessThan(DomainDomain.j)&&C.DomainDomain.i.lessThan(DomainDomain.j)&&D.DomainDomain.i.lessThan(DomainDomain.j)&&E.DomainDomain.i.lessThan(DomainDomain.j)sq ~ w   q ~ Bq ~ Jq ~ Oxt „B.DomainDomain.i.lessThan(DomainDomain.j)&&D.DomainDomain.i.lessThan(DomainDomain.j)&&Anchor.DomainDomain.i.lessThan(DomainDomain.j)sq ~ w   q ~ Bq ~ Oxt ¯B.DomainDomain.i.lessThan(DomainDomain.j)&&C.DomainDomain.i.lessThan(DomainDomain.j)&&D.DomainDomain.i.lessThan(DomainDomain.j)&&Anchor.DomainDomain.i.lessThan(DomainDomain.j)sq ~ w   q ~ Bq ~ Jq ~ Oxt YC.DomainDomain.i.lessThan(DomainDomain.j)&&Anchor.DomainDomain.i.lessThan(DomainDomain.j)sq ~ w   q ~ Jq ~ rxt .Anchor.DomainDomain.i.lessThan(DomainDomain.j)sq ~ w   q ~ rxxsq ~ w   q ~ vq ~ Hq ~ Rq ~ dq ~ „q ~ ˆq ~ bq ~ @q ~ Vq ~ pq ~ |q ~ lq ~ Mq ~ nq ~ †q ~ Zq ~ hq ~ fq ~ Šq ~ xq ~ zq ~ €q ~ ‚q ~ Tq ~ jq ~ ~q ~ Œq ~ `q ~ ^q ~ \q ~ Xxxxt FpFPfeature
*/
