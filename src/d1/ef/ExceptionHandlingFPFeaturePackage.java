package d1.ef;
import external.*;
import Resources.*;
import Resources.ex.*;
import d1.*;
import java.rmi.*;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

public class ExceptionHandlingFPFeaturePackage
 extends EFDomain  implements Serializable 
{

AFFeature _affeature;
ExceptionHandlerFeature _exceptionhandlerfeature;

private boolean activated = true;
private Map<String, Boolean> jEntered = new HashMap<String, Boolean>();
private Map<String, Boolean> pCondition = new HashMap<String, Boolean>();
private EventBuffer<FL_EVENT_STEM> sharedBuffer;
private ExecutorService threadExecuter;
public void activate() { activated = true; }
public void deactivate() { activated = false; }
public boolean isActivated() { return activated; }

public ExceptionHandlingFPFeaturePackage(  R1  r1) {
super();
EFDomain.r1 = r1;
// write jEntered Here
this._exceptionhandlerfeature = new ExceptionHandlerFeature();
this._affeature = new AFFeature();
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
ExceptionHandlingFPFeaturePackage.this.XEvent(buffer.remove());
}catch(Exception ex){
ex.printStackTrace();
}//end of catch
}//end of while
}//end of run
}//end of Consumer Class
Consumer consumer = new Consumer(sharedBuffer);
threadExecuter.execute(consumer);
}
public ExceptionHandlingFPFeaturePackage(ExceptionHandlerFeature _exceptionhandlerfeature, AFFeature _affeature)
 {
super();
// write jEntered Here
this._exceptionhandlerfeature = _exceptionhandlerfeature;
this._affeature = _affeature;
}

public synchronized  void sendEvent( FL_EVENT_STEM e ) {
sharedBuffer.add(e);
}
public synchronized void XEvent( FL_EVENT_STEM e )
{

if(activated) {
// write pConditions Here
if ( e instanceof E2) {
{
if (D1Domain.s.equalsToConstant(S  . S1))
{_affeature.pu3((E2) e);
}

}
}
else if ( e instanceof E1) {
{
if (D1Domain.s.equalsToConstant(S  . S1))
{try {// for non-retry
_affeature._af_pu1_throwex_resources_ex_myexception = null;_affeature.pu1((E1) e);
}//for exception handler
catch (Resources.ex.MyException ex){
_exceptionhandlerfeature.handler ( ex ) ; 
}
finally{}//complete outer
}
else if (D1Domain.s.equalsToConstant(S  . S2))
{_affeature.pu2((E1) e);
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
loadFactorI 	thresholdxp?@     w      t d1.E2sq ~ ?@     w      t allsr core.table.OrderedHashtablexd���d!0 L keyOrderListt Ljava/util/LinkedList;xq ~ ?@     w      t 'AF.D1Domain.s.equalsToConstant(S  . S1)sr java.util.LinkedList)S]J`�"  xpw   sr core.table.FITsubentry��%��u�R L featureNameEntryq ~ L programBodyEntryq ~ L programUnitNameEntryq ~ xpt AFt '{    System  . out  . println (r1)  ; }t pu3xxsq ~ w   q ~ xxt d1.E1sq ~ ?@     w      q ~ sq ~ 	?@     w      t 'AF.D1Domain.s.equalsToConstant(S  . S1)sq ~ w   sq ~ q ~ t ={    r1  . throwEx ()  ;   System  . out  . println (r1)  ; }t pu1xt 'AF.D1Domain.s.equalsToConstant(S  . S2)sq ~ w   sq ~ q ~ t '{    System  . out  . println (r1)  ; }t pu2xxsq ~ w   q ~ q ~ xxxt ExceptionHandlingFPfeature
*/
