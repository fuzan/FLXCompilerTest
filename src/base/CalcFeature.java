package base;
import external.*;
import Resources.*;import java.rmi.*;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

public class 
 CalcFeature extends 
 BaseDomain implements Serializable  {

private boolean activated = true;
private Map<String, Boolean> jEntered = new HashMap<String, Boolean>();
private Map<String, Boolean> pCondition = new HashMap<String, Boolean>();
private EventBuffer<FL_EVENT_STEM> sharedBuffer;
private ExecutorService threadExecuter;
public void activate() { activated = true; }
public void deactivate() { activated = false; }
public boolean isActivated() { return activated; }

public  CalcFeature()
{
super();
// write jEntered Here
}
public  CalcFeature(  SyncTool  st)
{
super();
// write jEntered Here
BaseDomain.st = st;
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
CalcFeature.this.XEvent(buffer.remove());
}catch(Exception ex){
ex.printStackTrace();
}//end of catch
}//end of while
}//end of run
}//end of Consumer Class
Consumer consumer = new Consumer(sharedBuffer);
threadExecuter.execute(consumer);
}

 
           
           
 public synchronized void adding(Add e)
 throws Resources.ex.LessThanZeroException,Resources.ex.OverHundredException{
try { 
if (activated)
{
total . add ( e . getValue ( ) ) ;
try{ //for resume setResult & 
 st . setResult ( total . intValue ( ) ) ;
}
catch( Resources.ex.LessThanZeroException ex){
if(_calc_adding_setresult_resources_ex_lessthanzeroexception!=null)_calc_adding_setresult_resources_ex_lessthanzeroexception.handle(ex);else throw ex; 
} // automacitally created for resume 
 catch( Resources.ex.OverHundredException ex){
if(_calc_adding_setresult_resources_ex_overhundredexception!=null)_calc_adding_setresult_resources_ex_overhundredexception.handle(ex);else throw ex; 
} // automacitally created for resume 
 }
} 
finally {}
}

        public synchronized void exit(Exit e)
{
try { 
if (activated)
{
st . finishes ( ) ;
}
} 
finally {}
}

public IResumeHandler _calc_adding_setresult_resources_ex_overhundredexception;
public IResumeHandler _calc_adding_setresult_resources_ex_lessthanzeroexception;

public synchronized void sendEvent( FL_EVENT_STEM e ) {
	sharedBuffer.add(e);
}
private synchronized void XEvent( FL_EVENT_STEM e )
{

	if(activated) {
// write pConditions Here
		if ( e instanceof base.Exit) {
			{
			{this.exit((base.Exit) e);
			}

			}
			}
		else if ( e instanceof base.Add) {
			{
			{try {
			this.adding((base.Add) e);
			}
catch(Resources.ex.LessThanZeroException exception)
{
DefaultExceptionHandler defaultExceptionHandler=new DefaultExceptionHandler();
defaultExceptionHandler.setFeaturePackageName("Calc");
defaultExceptionHandler.setFeatureName("Calc");
defaultExceptionHandler.setProgramUnitName("adding");
defaultExceptionHandler.setEventName("base.Add");
defaultExceptionHandler.setExceptionName("Resources.ex.LessThanZeroException");
defaultExceptionHandler.printException();
}
catch(Resources.ex.OverHundredException exception)
{
DefaultExceptionHandler defaultExceptionHandler=new DefaultExceptionHandler();
defaultExceptionHandler.setFeaturePackageName("Calc");
defaultExceptionHandler.setFeatureName("Calc");
defaultExceptionHandler.setProgramUnitName("adding");
defaultExceptionHandler.setEventName("base.Add");
defaultExceptionHandler.setExceptionName("Resources.ex.OverHundredException");
defaultExceptionHandler.printException();
}
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
�� sr "core.table.FeatureInteractionTable�V���6L� Z 
emptyTableZ isFeatureNameSetL 	andSymbolt Ljava/lang/String;L 
eventNodest Ljava/util/Hashtable;L featureNameq ~ xp t &&sr java.util.Hashtable�%!J� F 
loadFactorI 	thresholdxp?@     w      t base.Addsq ~ ?@     w      t allsr core.table.OrderedHashtablexd���d!0 L keyOrderListt Ljava/util/LinkedList;xq ~ ?@     w      t allsr java.util.LinkedList)S]J`�"  xpw   sr core.table.FITsubentry��%��u�R L featureNameEntryq ~ L programBodyEntryq ~ L programUnitNameEntryq ~ xpt Calct U{    total  . add (e  . getValue ())  ;   st  . setResult (total  . intValue ())  ; }t addingxxsq ~ w   q ~ xxt 	base.Exitsq ~ ?@     w      q ~ 	sq ~ 
?@     w      t allsq ~ w   sq ~ q ~ t {    st  . finishes ()  ; }t exitxxsq ~ w   q ~ xxxq ~ 
*/
