package base.minus;
import external.*;
import Resources.*;
import Resources.ex.*;
import base.*;
import ddt.lang.*;/**

 Minus**/

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

public class  Calc2Feature
 extends MinusDomain  implements Serializable 
 {
CalcFeature _calcfeature;

private boolean activated = true;
private Map<String, Boolean> jEntered = new HashMap<String, Boolean>();
private Map<String, Boolean> pCondition = new HashMap<String, Boolean>();
private EventBuffer<FL_EVENT_STEM> sharedBuffer;
private ExecutorService threadExecuter;
public void activate() { activated = true; }
public void deactivate() { activated = false; }
public boolean isActivated() { return activated; }

public Calc2Feature(  SyncTool  st2 ,   SyncTool  st) {
super();
// write jEntered Here
jEntered.put("minusdomain.i.equalsto(minusdomain.j)" , false);
this._calcfeature = new CalcFeature();
MinusDomain.st2 = st2;
MinusDomain.st = st;
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
Calc2Feature.this.XEvent((FL_EVENT_STEM)buffer.remove());
}catch(Exception ex){
ex.printStackTrace();
}//end of catch
}//end of while
}//end of run
}//end of Consumer Class
Consumer consumer = new Consumer(sharedBuffer);
threadExecuter.execute(consumer);
}
public  Calc2Feature()
 {
super();
// write jEntered Here
jEntered.put("minusdomain.i.equalsto(minusdomain.j)" , false);
this._calcfeature = _calcfeature;
}

 ;

 
            
           
 public synchronized void minus(Minus e)
 throws Resources.ex.LessThanZeroException,Resources.ex.OverHundredException{
try { 
if (activated)
{
total . add ( - e . getValue ( ) ) ;
try{ //for resume setResult & 
 st . setResult ( total . intValue ( ) ) ;
}
catch( Resources.ex.LessThanZeroException ex){
if(_calc2_minus_setresult_resources_ex_lessthanzeroexception!=null)_calc2_minus_setresult_resources_ex_lessthanzeroexception.handle(ex);else throw ex; 
} // automacitally created for resume 
 catch( Resources.ex.OverHundredException ex){
if(_calc2_minus_setresult_resources_ex_overhundredexception!=null)_calc2_minus_setresult_resources_ex_overhundredexception.handle(ex);else throw ex; 
} // automacitally created for resume 
 }
} 
finally {}
}

           public synchronized void multipleDomain(FL_EVENT_STEM e)
{
if (activated)
{
System . out . println ( "test2" ) ;
}
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


public synchronized  void sendEvent( FL_EVENT_STEM e ) {
	sharedBuffer.add(e);
}
public synchronized void XEvent( FL_EVENT_STEM e )
{

	if(activated) {
// write pConditions Here
		if ( e instanceof Add) {
			{
			if (true)
			{try {// for default
			_calcfeature._calc_adding_setresult_resources_ex_overhundredexception = null;_calcfeature._calc_adding_setresult_resources_ex_lessthanzeroexception = null;_calcfeature.adding((Add) e);
			}//for default hander
catch(LessThanZeroException exception)
{
DefaultExceptionHandler defaultExceptionHandler=new DefaultExceptionHandler();
defaultExceptionHandler.setFeaturePackageName("Calc2");
defaultExceptionHandler.setFeatureName("Calc");
defaultExceptionHandler.setProgramUnitName("adding");
defaultExceptionHandler.setEventName("base.Add");
defaultExceptionHandler.setExceptionName("LessThanZeroException");
defaultExceptionHandler.printException();
}
catch(OverHundredException exception)
{
DefaultExceptionHandler defaultExceptionHandler=new DefaultExceptionHandler();
defaultExceptionHandler.setFeaturePackageName("Calc2");
defaultExceptionHandler.setFeatureName("Calc");
defaultExceptionHandler.setProgramUnitName("adding");
defaultExceptionHandler.setEventName("base.Add");
defaultExceptionHandler.setExceptionName("OverHundredException");
defaultExceptionHandler.printException();
}
			}

			}
			}
		else if ( e instanceof Exit) {
			{
			if (true&&true)
			{this.exit((Exit) e);
			}

			}
			}
		else if ( e instanceof Minus) {
			{
			if (true)
			{try {// for default
			this.minus((Minus) e);
			}//for default hander
catch(LessThanZeroException exception)
{
DefaultExceptionHandler defaultExceptionHandler=new DefaultExceptionHandler();
defaultExceptionHandler.setFeaturePackageName("Calc2");
defaultExceptionHandler.setFeatureName("Calc2");
defaultExceptionHandler.setProgramUnitName("minus");
defaultExceptionHandler.setEventName("minus.Minus");
defaultExceptionHandler.setExceptionName("LessThanZeroException");
defaultExceptionHandler.printException();
}
catch(OverHundredException exception)
{
DefaultExceptionHandler defaultExceptionHandler=new DefaultExceptionHandler();
defaultExceptionHandler.setFeaturePackageName("Calc2");
defaultExceptionHandler.setFeatureName("Calc2");
defaultExceptionHandler.setProgramUnitName("minus");
defaultExceptionHandler.setEventName("minus.Minus");
defaultExceptionHandler.setExceptionName("OverHundredException");
defaultExceptionHandler.printException();
}
			}

			}
			}
// write jEntered Here
if(!MinusDomain.i.equalsTo(MinusDomain.j))
jEntered.put("minusdomain.i.equalsto(minusdomain.j)" , false);
while(true){
boolean noLeaveEvent = true;
boolean noEnterEvent = true;
// write jEntered Here
if(!MinusDomain.i.equalsTo(MinusDomain.j))
jEntered.put("minusdomain.i.equalsto(minusdomain.j)" , false);
			{
			if (!jEntered.get("minusdomain.i.equalsto(minusdomain.j)")&&MinusDomain.i.equalsTo(MinusDomain.j))
			{				noEnterEvent = false;this.multipleDomain(e);
jEntered.put("minusdomain.i.equalsto(minusdomain.j)" , MinusDomain.i.equalsTo(MinusDomain.j));			}

			}
if(noLeaveEvent && noEnterEvent) break;
}
	}

}
public IResumeHandler _calc2_minus_setresult_resources_ex_overhundredexception;
public IResumeHandler _calc2_minus_setresult_resources_ex_lessthanzeroexception;

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
eventNodest Ljava/util/Hashtable;L featureNameq ~ xpt &&sr java.util.Hashtable�%!J� F 
loadFactorI 	thresholdxp?@     w      t 	base.Exitsq ~ ?@     w      t allsr core.table.OrderedHashtablexd���d!0 L keyOrderListt Ljava/util/LinkedList;xq ~ ?@     w      t Calc2.all&&Calc.allsr java.util.LinkedList)S]J`�"  xpw   sr core.table.FITsubentry��%��u�R L featureNameEntryq ~ L programBodyEntryq ~ L programUnitNameEntryq ~ xpt Calc2t {    st  . finishes ()  ; }t exitxxsq ~ w   q ~ xxt base.Addsq ~ ?@     w      t allsq ~ 
?@     w      t Calc.allsq ~ w   sq ~ t Calct U{    total  . add (e  . getValue ())  ;   st  . setResult (total  . intValue ())  ; }t addingxxsq ~ w   q ~ xxt minus.Minussq ~ ?@     w      q ~ 	sq ~ 
?@     w      t 	Calc2.allsq ~ w   sq ~ q ~ t X{    total  . add ( - e  . getValue ())  ;   st  . setResult (total  . intValue ())  ; }t minusxxsq ~ w   q ~ $xxt entersq ~ ?@     w      q ~ 	sq ~ 
?@     w      t +Calc2.MinusDomain.i.equalsTo(MinusDomain.j)sq ~ w   sq ~ q ~ t ,{    System  . out  . println ("test2")  ; }t multipleDomainxxsq ~ w   q ~ -xxxt Calc2feature
*/
