package base.printer;
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
 CalcPrinterFPFeaturePackage
 extends BaseDomain  implements Serializable 
{
CalcPrinterFeature _calcprinterfeature;
CalcFeature _calcfeature;

private boolean activated = true;
private Map<String, Boolean> jEntered = new HashMap<String, Boolean>();
private Map<String, Boolean> pCondition = new HashMap<String, Boolean>();
private EventBuffer<FL_EVENT_STEM> sharedBuffer;
private ExecutorService threadExecuter;
public void activate() { activated = true; }
public void deactivate() { activated = false; }
public boolean isActivated() { return activated; }

public CalcPrinterFPFeaturePackage(  SyncTool  st) {
super();
// write jEntered Here
this._calcfeature = new CalcFeature();
this._calcprinterfeature = new CalcPrinterFeature();
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
CalcPrinterFPFeaturePackage.this.XEvent((FL_EVENT_STEM)buffer.remove());
}catch(Exception ex){
ex.printStackTrace();
}//end of catch
}//end of while
}//end of run
}//end of Consumer Class
Consumer consumer = new Consumer(sharedBuffer);
threadExecuter.execute(consumer);
}
public  CalcPrinterFPFeaturePackage(CalcFeature _calcfeature, CalcPrinterFeature _calcprinterfeature)
 {
super();
// write jEntered Here
this._calcfeature = _calcfeature;
this._calcprinterfeature = _calcprinterfeature;
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
			if (true&&true)
			{_calcprinterfeature.reportAdding((Add) e);
try {// for default
			_calcfeature._calc_adding_setresult_resources_ex_overhundredexception = null;_calcfeature._calc_adding_setresult_resources_ex_lessthanzeroexception = null;_calcfeature.adding((Add) e);
			}//for default hander
catch(LessThanZeroException exception)
{
DefaultExceptionHandler defaultExceptionHandler=new DefaultExceptionHandler();
defaultExceptionHandler.setFeaturePackageName("CalcPrinterFP");
defaultExceptionHandler.setFeatureName("Calc");
defaultExceptionHandler.setProgramUnitName("adding");
defaultExceptionHandler.setEventName("base.Add");
defaultExceptionHandler.setExceptionName("LessThanZeroException");
defaultExceptionHandler.printException();
}
catch(OverHundredException exception)
{
DefaultExceptionHandler defaultExceptionHandler=new DefaultExceptionHandler();
defaultExceptionHandler.setFeaturePackageName("CalcPrinterFP");
defaultExceptionHandler.setFeatureName("Calc");
defaultExceptionHandler.setProgramUnitName("adding");
defaultExceptionHandler.setEventName("base.Add");
defaultExceptionHandler.setExceptionName("OverHundredException");
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
eventNodest Ljava/util/Hashtable;L featureNameq ~ xpt &&sr java.util.Hashtable�%!J� F 
loadFactorI 	thresholdxp?@     w      t base.Addsq ~ ?@     w      t allsr core.table.OrderedHashtablexd���d!0 L keyOrderListt Ljava/util/LinkedList;xq ~ ?@     w      t CalcPrinter.all&&Calc.allsr java.util.LinkedList)S]J`�"  xpw   sr core.table.FITsubentry��%��u�R L featureNameEntryq ~ L programBodyEntryq ~ L programUnitNameEntryq ~ xpt CalcPrintert 3{    st  . addStr ("add "  + e  . getValue ())  ; }t reportAddingsq ~ t Calct U{    total  . add (e  . getValue ())  ;   st  . setResult (total  . intValue ())  ; }t addingxxsq ~ w   q ~ xxt 	base.Exitsq ~ ?@     w      q ~ 	sq ~ 
?@     w      t Calc.allsq ~ w   sq ~ q ~ t {    st  . finishes ()  ; }t exitxxsq ~ w   q ~ xxxt CalcPrinterFPfeature
*/
