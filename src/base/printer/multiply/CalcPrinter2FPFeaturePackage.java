package base.printer.multiply;
import external.*;
import Resources.*;
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

public CalcPrinter2FPFeaturePackage(  SyncTool  st) {
super();
// write jEntered Here
this._calcfeature = new CalcFeature();
this._calc1feature = new Calc1Feature();
this._calcprinterfeature = new CalcPrinterFeature();
this._calcprinter2feature = new CalcPrinter2Feature();
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
			if (true)
			{_calc1feature.exit((Exit) e);
			}

			}
			}
		else if ( e instanceof Exit) {
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
_calcfeature.adding((Add) e);
			}

			}
			}
		else if ( e instanceof Multiply) {
			{
			if (true&&true)
			{_calcprinter2feature.reportAdding((Multiply) e);
_calc1feature.multiplying((Multiply) e);
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
loadFactorI 	thresholdxp?@     w      t Exitsq ~ ?@     w      t allsr core.table.OrderedHashtablexd���d!0 L keyOrderListt Ljava/util/LinkedList;xq ~ ?@     w      t 	Calc1.allsr java.util.LinkedList)S]J`�"  xpw   sr core.table.FITsubentry��%��u�R L featureNameEntryq ~ L programBodyEntryq ~ L programUnitNameEntryq ~ xpt Calc1t {    st  . finishes ()  ; }t exitxxsq ~ w   q ~ xxt base.Addsq ~ ?@     w      t allsq ~ 
?@     w      t CalcPrinter.all&&Calc.allsq ~ w   sq ~ t CalcPrintert 3{    st  . addStr ("add "  + e  . getValue ())  ; }t reportAddingsq ~ t Calct U{    total  . add (e  . getValue ())  ;   st  . setResult (total  . intValue ())  ; }t addingxxsq ~ w   q ~ xxt 	base.Exitsq ~ ?@     w      q ~ sq ~ 
?@     w      t Calc.allsq ~ w   sq ~ q ~ !t {    st  . finishes ()  ; }t exitxxsq ~ w   q ~ (xxt multiply.Multiplysq ~ ?@     w      q ~ 	sq ~ 
?@     w      t CalcPrinter2.all&&Calc1.allsq ~ w   sq ~ t CalcPrinter2t 5{    st  . addStr ("times "  + e  . getValue ())  ; }t reportAddingsq ~ q ~ t �{    int current = total  . intValue ()  ; for (  int i = 1 ; i  < e  . getValue ();  i ++ ) {    total  . add (current)  ; }   st  . setResult (total  . intValue ())  ; }t multiplyingxxsq ~ w   q ~ 1xxxt CalcPrinter2FPfeature
*/
