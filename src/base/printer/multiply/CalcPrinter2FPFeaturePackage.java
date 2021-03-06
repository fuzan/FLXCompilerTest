package base.printer.multiply;
import external.*;
import Resources.*;
import Resources.ex.*;
import base.*;
import base.multiply.*;
import base.printer.*;
import java.rmi.*;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

public class 
 CalcPrinter2FPFeaturePackage
 extends MultiplyDomain  implements Serializable 
{
CalcPrinterFeature _calcprinterfeature;
CalcPrinter2Feature _calcprinter2feature;
CalcFeature _calcfeature;
Calc1Feature _calc1feature;

private boolean activated = true;
private Map<String, Boolean> jEntered = new HashMap<String, Boolean>();
private Map<String, Boolean> pCondition = new HashMap<String, Boolean>();
private EventBuffer<FL_EVENT_STEM> sharedBuffer;
private ExecutorService threadExecuter;
public void activate() { activated = true; }
public void deactivate() { activated = false; }
public boolean isActivated() { return activated; }

public CalcPrinter2FPFeaturePackage(  SyncTool  st3 ,   SyncTool  st) {
super();
// write jEntered Here
jEntered.put("multiplydomain.i.equalsto(multiplydomain.j)" , false);
this._calcfeature = new CalcFeature();
this._calc1feature = new Calc1Feature();
this._calcprinterfeature = new CalcPrinterFeature();
this._calcprinter2feature = new CalcPrinter2Feature();
MultiplyDomain.st3 = st3;
MultiplyDomain.st = st;
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
CalcPrinter2FPFeaturePackage.this.XEvent((FL_EVENT_STEM)buffer.remove());
}catch(Exception ex){
ex.printStackTrace();
}//end of catch
}//end of while
}//end of run
}//end of Consumer Class
Consumer consumer = new Consumer(sharedBuffer);
threadExecuter.execute(consumer);
}
public  CalcPrinter2FPFeaturePackage(CalcFeature _calcfeature, Calc1Feature _calc1feature, CalcPrinterFeature _calcprinterfeature, CalcPrinter2Feature _calcprinter2feature)
 {
super();
// write jEntered Here
jEntered.put("multiplydomain.i.equalsto(multiplydomain.j)" , false);
this._calcfeature = _calcfeature;
this._calc1feature = _calc1feature;
this._calcprinterfeature = _calcprinterfeature;
this._calcprinter2feature = _calcprinter2feature;
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
			if (true&&true)
			{_calc1feature.exit((Exit) e);
			}

			}
			}
		else if ( e instanceof Add) {
			{
			if (true&&true)
			{_calcprinterfeature.reportAdding((Add) e);
try {// for default
			_calcfeature._calc_adding_setresult_resources_ex_overhundredexception = null;_calcfeature._calc_adding_setresult_resources_ex_lessthanzeroexception = null;_calcfeature.adding((Add) e);
			}//for default hander
catch(LessThanZeroException exception)
{
DefaultExceptionHandler defaultExceptionHandler=new DefaultExceptionHandler();
defaultExceptionHandler.setFeaturePackageName("CalcPrinter2FP");
defaultExceptionHandler.setFeatureName("Calc");
defaultExceptionHandler.setProgramUnitName("adding");
defaultExceptionHandler.setEventName("base.Add");
defaultExceptionHandler.setExceptionName("LessThanZeroException");
defaultExceptionHandler.printException();
}
catch(OverHundredException exception)
{
DefaultExceptionHandler defaultExceptionHandler=new DefaultExceptionHandler();
defaultExceptionHandler.setFeaturePackageName("CalcPrinter2FP");
defaultExceptionHandler.setFeatureName("Calc");
defaultExceptionHandler.setProgramUnitName("adding");
defaultExceptionHandler.setEventName("base.Add");
defaultExceptionHandler.setExceptionName("OverHundredException");
defaultExceptionHandler.printException();
}
			}

			}
			}
		else if ( e instanceof Multiply) {
			{
			if (true&&true)
			{_calcprinter2feature.reportAdding((Multiply) e);
try {// for default
			_calc1feature.multiplying((Multiply) e);
			}//for default hander
catch(LessThanZeroException exception)
{
DefaultExceptionHandler defaultExceptionHandler=new DefaultExceptionHandler();
defaultExceptionHandler.setFeaturePackageName("CalcPrinter2FP");
defaultExceptionHandler.setFeatureName("Calc1");
defaultExceptionHandler.setProgramUnitName("multiplying");
defaultExceptionHandler.setEventName("multiply.Multiply");
defaultExceptionHandler.setExceptionName("LessThanZeroException");
defaultExceptionHandler.printException();
}
catch(OverHundredException exception)
{
DefaultExceptionHandler defaultExceptionHandler=new DefaultExceptionHandler();
defaultExceptionHandler.setFeaturePackageName("CalcPrinter2FP");
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
if(!MultiplyDomain.i.equalsTo(MultiplyDomain.j))
jEntered.put("multiplydomain.i.equalsto(multiplydomain.j)" , false);
while(true){
boolean noLeaveEvent = true;
boolean noEnterEvent = true;
// write jEntered Here
if(!MultiplyDomain.i.equalsTo(MultiplyDomain.j))
jEntered.put("multiplydomain.i.equalsto(multiplydomain.j)" , false);
			{
			if (!jEntered.get("multiplydomain.i.equalsto(multiplydomain.j)")&&MultiplyDomain.i.equalsTo(MultiplyDomain.j))
			{				noEnterEvent = false;_calc1feature.multipleDomain(e);
jEntered.put("multiplydomain.i.equalsto(multiplydomain.j)" , MultiplyDomain.i.equalsTo(MultiplyDomain.j));			}

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
�� sr "core.table.FeatureInteractionTable�V���6L� Z 
emptyTableZ isFeatureNameSetL 	andSymbolt Ljava/lang/String;L 
eventNodest Ljava/util/Hashtable;L featureNameq ~ xpt &&sr java.util.Hashtable�%!J� F 
loadFactorI 	thresholdxp?@     w      t base.Addsq ~ ?@     w      t allsr core.table.OrderedHashtablexd���d!0 L keyOrderListt Ljava/util/LinkedList;xq ~ ?@     w      t CalcPrinter.all&&Calc.allsr java.util.LinkedList)S]J`�"  xpw   sr core.table.FITsubentry��%��u�R L featureNameEntryq ~ L programBodyEntryq ~ L programUnitNameEntryq ~ xpt CalcPrintert 3{    st  . addStr ("add "  + e  . getValue ())  ; }t reportAddingsq ~ t Calct U{    total  . add (e  . getValue ())  ;   st  . setResult (total  . intValue ())  ; }t addingxxsq ~ w   q ~ xxt 	base.Exitsq ~ ?@     w      q ~ 	sq ~ 
?@     w      t Calc1.all&&Calc.allsq ~ w   sq ~ t Calc1t {    st  . finishes ()  ; }t exitxxsq ~ w   q ~ xxt entersq ~ ?@     w      t allsq ~ 
?@     w      t 1Calc1.MultiplyDomain.i.equalsTo(MultiplyDomain.j)sq ~ w   sq ~ q ~  t +{    System  . out  . println ("test")  ; }t multipleDomainxxsq ~ w   q ~ (xxt multiply.Multiplysq ~ ?@     w      q ~ &sq ~ 
?@     w      t CalcPrinter2.all&&Calc1.allsq ~ w   sq ~ t CalcPrinter2t 5{    st  . addStr ("times "  + e  . getValue ())  ; }t reportAddingsq ~ q ~  t �{    int current = total  . intValue ()  ; for (  int i = 1 ; i  < e  . getValue ();  i ++ ) {    total  . add (current)  ; }   st  . setResult (total  . intValue ())  ; }t multiplyingxxsq ~ w   q ~ 1xxxt CalcPrinter2FPfeature
*/
