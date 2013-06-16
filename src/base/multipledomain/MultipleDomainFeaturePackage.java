package base.multipledomain;
import external.*;
import Resources.*;
import Resources.ex.*;
import base.*;
import base.minus.*;
import base.multiply.*;
import java.rmi.*;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

public class 
 MultipleDomainFeaturePackage
 implements Serializable 
{
CalcFeature _calcfeature;
Calc2Feature _calc2feature;
Calc1Feature _calc1feature;

private boolean activated = true;
private Map<String, Boolean> jEntered = new HashMap<String, Boolean>();
private Map<String, Boolean> pCondition = new HashMap<String, Boolean>();
private EventBuffer<FL_EVENT_STEM> sharedBuffer;
private ExecutorService threadExecuter;
public void activate() { activated = true; }
public void deactivate() { activated = false; }
public boolean isActivated() { return activated; }

public MultipleDomainFeaturePackage(  SyncTool  st ,   R1  r1 ,   R2  r2 ,   R3  r3) {
super();
// write jEntered Here
jEntered.put("multiplydomain.i.equalsto(multiplydomain.j)&&minusdomain.i.equalsto(minusdomain.j)" , false);
jEntered.put("multiplydomain.i.equalsto(multiplydomain.j)" , false);
jEntered.put("minusdomain.i.equalsto(minusdomain.j)" , false);
this._calcfeature = new CalcFeature();
this._calc1feature = new Calc1Feature();
this._calc2feature = new Calc2Feature();
MinusDomain.r1 = r1;
BaseDomain.r1 = r1;
MinusDomain.st = st;
BaseDomain.st = st;
MultiplyDomain.r3 = r3;
MultiplyDomain.r1 = r1;
MultiplyDomain.st = st;
MinusDomain.r2 = r2;
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
MultipleDomainFeaturePackage.this.XEvent((FL_EVENT_STEM)buffer.remove());
}catch(Exception ex){
ex.printStackTrace();
}//end of catch
}//end of while
}//end of run
}//end of Consumer Class
Consumer consumer = new Consumer(sharedBuffer);
threadExecuter.execute(consumer);
}
public  MultipleDomainFeaturePackage(CalcFeature _calcfeature, Calc1Feature _calc1feature, Calc2Feature _calc2feature)
 {
super();
// write jEntered Here
jEntered.put("multiplydomain.i.equalsto(multiplydomain.j)&&minusdomain.i.equalsto(minusdomain.j)" , false);
jEntered.put("multiplydomain.i.equalsto(multiplydomain.j)" , false);
jEntered.put("minusdomain.i.equalsto(minusdomain.j)" , false);
this._calcfeature = _calcfeature;
this._calc1feature = _calc1feature;
this._calc2feature = _calc2feature;
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
			if (true&&true&&true)
			{_calc2feature.exit((Exit) e);
_calc1feature.exit((Exit) e);
_calcfeature.exit((Exit) e);
			}

			}
			}
		else if ( e instanceof Add) {
			{
			if (true)
			{try {// for default
			_calcfeature._calc_adding_setresult_resources_ex_overhundredexception = null;_calcfeature._calc_adding_setresult_resources_ex_lessthanzeroexception = null;_calcfeature.adding((Add) e);
			}//for default hander
catch(LessThanZeroException exception)
{
DefaultExceptionHandler defaultExceptionHandler=new DefaultExceptionHandler();
defaultExceptionHandler.setFeaturePackageName("MultipleDomain");
defaultExceptionHandler.setFeatureName("Calc");
defaultExceptionHandler.setProgramUnitName("adding");
defaultExceptionHandler.setEventName("base.Add");
defaultExceptionHandler.setExceptionName("LessThanZeroException");
defaultExceptionHandler.printException();
}
catch(OverHundredException exception)
{
DefaultExceptionHandler defaultExceptionHandler=new DefaultExceptionHandler();
defaultExceptionHandler.setFeaturePackageName("MultipleDomain");
defaultExceptionHandler.setFeatureName("Calc");
defaultExceptionHandler.setProgramUnitName("adding");
defaultExceptionHandler.setEventName("base.Add");
defaultExceptionHandler.setExceptionName("OverHundredException");
defaultExceptionHandler.printException();
}
			}

			}
			}
		else if ( e instanceof Minus) {
			{
			if (true)
			{try {// for default
			_calc2feature.minus((Minus) e);
			}//for default hander
catch(LessThanZeroException exception)
{
DefaultExceptionHandler defaultExceptionHandler=new DefaultExceptionHandler();
defaultExceptionHandler.setFeaturePackageName("MultipleDomain");
defaultExceptionHandler.setFeatureName("Calc2");
defaultExceptionHandler.setProgramUnitName("minus");
defaultExceptionHandler.setEventName("minus.Minus");
defaultExceptionHandler.setExceptionName("LessThanZeroException");
defaultExceptionHandler.printException();
}
catch(OverHundredException exception)
{
DefaultExceptionHandler defaultExceptionHandler=new DefaultExceptionHandler();
defaultExceptionHandler.setFeaturePackageName("MultipleDomain");
defaultExceptionHandler.setFeatureName("Calc2");
defaultExceptionHandler.setProgramUnitName("minus");
defaultExceptionHandler.setEventName("minus.Minus");
defaultExceptionHandler.setExceptionName("OverHundredException");
defaultExceptionHandler.printException();
}
			}

			}
			}
		else if ( e instanceof Multiply) {
			{
			if (true)
			{try {// for default
			_calc1feature.multiplying((Multiply) e);
			}//for default hander
catch(LessThanZeroException exception)
{
DefaultExceptionHandler defaultExceptionHandler=new DefaultExceptionHandler();
defaultExceptionHandler.setFeaturePackageName("MultipleDomain");
defaultExceptionHandler.setFeatureName("Calc1");
defaultExceptionHandler.setProgramUnitName("multiplying");
defaultExceptionHandler.setEventName("multiply.Multiply");
defaultExceptionHandler.setExceptionName("LessThanZeroException");
defaultExceptionHandler.printException();
}
catch(OverHundredException exception)
{
DefaultExceptionHandler defaultExceptionHandler=new DefaultExceptionHandler();
defaultExceptionHandler.setFeaturePackageName("MultipleDomain");
defaultExceptionHandler.setFeatureName("Calc1");
defaultExceptionHandler.setProgramUnitName("multiplying");
defaultExceptionHandler.setEventName("multiply.Multiply");
defaultExceptionHandler.setExceptionName("OverHundredException");
defaultExceptionHandler.printException();
}
			}

			}
			}
// write jEntered Here
if(!MinusDomain.i.equalsTo(MinusDomain.j)&&MultiplyDomain.i.equalsTo(MultiplyDomain.j))
jEntered.put("multiplydomain.i.equalsto(multiplydomain.j)&&minusdomain.i.equalsto(minusdomain.j)" , false);
if(!MultiplyDomain.i.equalsTo(MultiplyDomain.j))
jEntered.put("multiplydomain.i.equalsto(multiplydomain.j)" , false);
if(!MinusDomain.i.equalsTo(MinusDomain.j))
jEntered.put("minusdomain.i.equalsto(minusdomain.j)" , false);
while(true){
boolean noLeaveEvent = true;
boolean noEnterEvent = true;
// write jEntered Here
if(!MinusDomain.i.equalsTo(MinusDomain.j)&&MultiplyDomain.i.equalsTo(MultiplyDomain.j))
jEntered.put("multiplydomain.i.equalsto(multiplydomain.j)&&minusdomain.i.equalsto(minusdomain.j)" , false);
if(!MultiplyDomain.i.equalsTo(MultiplyDomain.j))
jEntered.put("multiplydomain.i.equalsto(multiplydomain.j)" , false);
if(!MinusDomain.i.equalsTo(MinusDomain.j))
jEntered.put("minusdomain.i.equalsto(minusdomain.j)" , false);
			{
			if (!jEntered.get("multiplydomain.i.equalsto(multiplydomain.j)&&minusdomain.i.equalsto(minusdomain.j)")&&MinusDomain.i.equalsTo(MinusDomain.j)&&MultiplyDomain.i.equalsTo(MultiplyDomain.j))
			{				noEnterEvent = false;_calc2feature.multipleDomain(e);
jEntered.put("multiplydomain.i.equalsto(multiplydomain.j)&&minusdomain.i.equalsto(minusdomain.j)" , MultiplyDomain.i.equalsTo(MultiplyDomain.j)&&MinusDomain.i.equalsTo(MinusDomain.j));_calc1feature.multipleDomain(e);
jEntered.put("multiplydomain.i.equalsto(multiplydomain.j)&&minusdomain.i.equalsto(minusdomain.j)" , MultiplyDomain.i.equalsTo(MultiplyDomain.j)&&MinusDomain.i.equalsTo(MinusDomain.j));			}
			else if (!jEntered.get("multiplydomain.i.equalsto(multiplydomain.j)")&&MultiplyDomain.i.equalsTo(MultiplyDomain.j))
			{				noEnterEvent = false;_calc1feature.multipleDomain(e);
jEntered.put("multiplydomain.i.equalsto(multiplydomain.j)" , MultiplyDomain.i.equalsTo(MultiplyDomain.j));			}
			else if (!jEntered.get("minusdomain.i.equalsto(minusdomain.j)")&&MinusDomain.i.equalsTo(MinusDomain.j))
			{				noEnterEvent = false;_calc2feature.multipleDomain(e);
jEntered.put("minusdomain.i.equalsto(minusdomain.j)" , MinusDomain.i.equalsTo(MinusDomain.j));			}

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
¬í sr "core.table.FeatureInteractionTable¤VôéÚ6Læ Z 
emptyTableZ isFeatureNameSetL 
eventNodest Ljava/util/Hashtable;L featureNamet Ljava/lang/String;xpsr java.util.Hashtable»%!Jä¸ F 
loadFactorI 	thresholdxp?@     w      t base.Addsq ~ ?@     w      t allsr core.table.OrderedHashtablexd ÞÒd!0 L keyOrderListt Ljava/util/LinkedList;xq ~ ?@     w      t Calc.allsr java.util.LinkedList)S]J`ˆ"  xpw   sr core.table.FITsubentry‘Ñ%×Æu¨R L featureNameEntryq ~ L programBodyEntryq ~ L programUnitNameEntryq ~ xpt Calct U{    total  . add (e  . getValue ())  ;   st  . setResult (total  . intValue ())  ; }t addingxxsq ~ w   q ~ xxt 	base.Exitsq ~ ?@     w      q ~ sq ~ 	?@     w      t Calc2.all&&Calc1.all&&Calc.allsq ~ w   sq ~ t Calc2t {    st  . finishes ()  ; }t exitsq ~ t Calc1t {    st  . finishes ()  ; }t exitsq ~ q ~ t {    st  . finishes ()  ; }t exitxxsq ~ w   q ~ xxt minus.Minussq ~ ?@     w      t allsq ~ 	?@     w      t 	Calc2.allsq ~ w   sq ~ q ~ t X{    total  . add ( - e  . getValue ())  ;   st  . setResult (total  . intValue ())  ; }t minusxxsq ~ w   q ~ *xxt entersq ~ ?@     w      t allsq ~ 	?@     w      t +Calc2.MinusDomain.i.equalsTo(MinusDomain.j)sq ~ w   sq ~ q ~ t ,{    System  . out  . println ("test2")  ; }t multipleDomainxt 1Calc1.MultiplyDomain.i.equalsTo(MultiplyDomain.j)sq ~ w   sq ~ q ~ t +{    System  . out  . println ("test")  ; }t multipleDomainxt ^Calc2.MinusDomain.i.equalsTo(MinusDomain.j)&&Calc1.MultiplyDomain.i.equalsTo(MultiplyDomain.j)sq ~ w   q ~ 6q ~ ;xxsq ~ w   q ~ >q ~ 9q ~ 4xxt multiply.Multiplysq ~ ?@     w      q ~ 2sq ~ 	?@     w      t 	Calc1.allsq ~ w   sq ~ q ~ t «{    int current = total  . intValue ()  ; for (  int i = 1 ; i  < e  . getValue ();  i ++ ) {    total  . add (current)  ; }   st  . setResult (total  . intValue ())  ; }t multiplyingxxsq ~ w   q ~ Dxxxt MultipleDomainfeature
*/
