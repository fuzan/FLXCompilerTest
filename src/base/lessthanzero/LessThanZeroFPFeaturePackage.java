package base.lessthanzero;
import external.*;
import Resources.*;
import Resources.ex.*;
import base.*;
import java.rmi.*;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

public class 
 LessThanZeroFPFeaturePackage
 extends LessThanZeroDomain  implements Serializable 
{
LessThanZeroFeature _lessthanzerofeature;
CalcFeature _calcfeature;

private boolean activated = true;
private Map<String, Boolean> jEntered = new HashMap<String, Boolean>();
private Map<String, Boolean> pCondition = new HashMap<String, Boolean>();
private EventBuffer<FL_EVENT_STEM> sharedBuffer;
private ExecutorService threadExecuter;
public void activate() { activated = true; }
public void deactivate() { activated = false; }
public boolean isActivated() { return activated; }

public LessThanZeroFPFeaturePackage(  SyncTool  st ,   R1  r1) {
super();
// write jEntered Here
this._calcfeature = new CalcFeature();
this._lessthanzerofeature = new LessThanZeroFeature();
LessThanZeroDomain.r1 = r1;
LessThanZeroDomain.st = st;
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
LessThanZeroFPFeaturePackage.this.XEvent((FL_EVENT_STEM)buffer.remove());
}catch(Exception ex){
ex.printStackTrace();
}//end of catch
}//end of while
}//end of run
}//end of Consumer Class
Consumer consumer = new Consumer(sharedBuffer);
threadExecuter.execute(consumer);
}
public  LessThanZeroFPFeaturePackage(CalcFeature _calcfeature, LessThanZeroFeature _lessthanzerofeature)
 {
super();
// write jEntered Here
this._calcfeature = _calcfeature;
this._lessthanzerofeature = _lessthanzerofeature;
}

public synchronized  void sendEvent( FL_EVENT_STEM e ) {
	sharedBuffer.add(e);
}
public synchronized void XEvent( FL_EVENT_STEM e )
{

	if(activated) {
// write pConditions Here
		if ( e instanceof Exit) {
			{
			if (true)
			{_calcfeature.exit((Exit) e);
			}

			}
			}
		else if ( e instanceof Add) {
			{
			if (true)
			{try {// for non-retry
			try {// for default
			_calcfeature._calc_adding_setresult_resources_ex_overhundredexception = null;_calcfeature._calc_adding_setresult_resources_ex_lessthanzeroexception = null;_calcfeature.adding((Add) e);
			}//for exception handler
catch (Resources.ex.LessThanZeroException ex){
				_lessthanzerofeature.handleAtAdd ( ex ) ; 
}
catch(OverHundredException exception)
{
DefaultExceptionHandler defaultExceptionHandler=new DefaultExceptionHandler();
defaultExceptionHandler.setFeaturePackageName("LessThanZeroFP");
defaultExceptionHandler.setFeatureName("Calc");
defaultExceptionHandler.setProgramUnitName("adding");
defaultExceptionHandler.setEventName("base.Add");
defaultExceptionHandler.setExceptionName("OverHundredException");
defaultExceptionHandler.printException();
}
}	finally{}//complete outer
			}

			}
			}
// write jEntered Here
while(true){
boolean noLeaveEvent = true;
boolean noEnterEvent = true;
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
�� sr "core.table.FeatureInteractionTable�V���6L� Z 
emptyTableZ isFeatureNameSetL 
eventNodest Ljava/util/Hashtable;L featureNamet Ljava/lang/String;xpsr java.util.Hashtable�%!J� F 
loadFactorI 	thresholdxp?@     w      t base.Addsq ~ ?@     w      t allsr core.table.OrderedHashtablexd���d!0 L keyOrderListt Ljava/util/LinkedList;xq ~ ?@     w      t Calc.allsr java.util.LinkedList)S]J`�"  xpw   sr core.table.FITsubentry��%��u�R L featureNameEntryq ~ L programBodyEntryq ~ L programUnitNameEntryq ~ xpt Calct U{    total  . add (e  . getValue ())  ;   st  . setResult (total  . intValue ())  ; }t addingxxsq ~ w   q ~ xxt 	base.Exitsq ~ ?@     w      q ~ sq ~ 	?@     w      t Calc.allsq ~ w   sq ~ q ~ t {    st  . finishes ()  ; }t exitxxsq ~ w   q ~ xxxt LessThanZeroFPfeature
*/
