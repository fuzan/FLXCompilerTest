package d1.d3;
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

public class SpF2FeaturePackage
 extends D3Domain  implements Serializable 
{

AFFeature _affeature;
F2Feature _f2feature;

private boolean activated = true;
private Map<String, Boolean> jEntered = new HashMap<String, Boolean>();
private Map<String, Boolean> pCondition = new HashMap<String, Boolean>();
private EventBuffer<FL_EVENT_STEM> sharedBuffer;
private ExecutorService threadExecuter;
public void activate() { activated = true; }
public void deactivate() { activated = false; }
public boolean isActivated() { return activated; }

public SpF2FeaturePackage(  R3  r3 ,   R1  r1) {
super();
D3Domain.r1 = r1;
D3Domain.r3 = r3;
// write jEntered Here
this._f2feature = new F2Feature();
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
SpF2FeaturePackage.this.XEvent(buffer.remove());
}catch(Exception ex){
ex.printStackTrace();
}//end of catch
}//end of while
}//end of run
}//end of Consumer Class
Consumer consumer = new Consumer(sharedBuffer);
threadExecuter.execute(consumer);
}
public SpF2FeaturePackage(F2Feature _f2feature, AFFeature _affeature)
 {
super();
// write jEntered Here
this._f2feature = _f2feature;
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
if (D1Domain.s.equalsTo(S  . S2)&&D1Domain.s.equalsToConstant(S  . S1))
{_f2feature.pu9((E2) e);
_affeature.pu3((E2) e);
}
else if (D1Domain.s.equalsTo(S  . S2))
{_f2feature.pu9((E2) e);
}
else if (D1Domain.s.equalsToConstant(S  . S1))
{_affeature.pu3((E2) e);
}

}
}
else if ( e instanceof E1) {
{
if (D1Domain.s.equalsTo(S  . S1)&&D1Domain.s.equalsToConstant(S  . S2))
{_f2feature.pu7((E1) e);
_affeature.pu2((E1) e);
}
else if (D1Domain.s.equalsTo(S  . S1)&&D1Domain.s.equalsToConstant(S  . S1))
{_f2feature.pu7((E1) e);
try {// for default
_affeature._af_pu1_throwex_resources_ex_myexception = null;_affeature.pu1((E1) e);
}//for default hander
catch(MyException exception)
{
DefaultExceptionHandler defaultExceptionHandler=new DefaultExceptionHandler();
defaultExceptionHandler.setFeaturePackageName("SpF2");
defaultExceptionHandler.setFeatureName("AF");
defaultExceptionHandler.setProgramUnitName("pu1");
defaultExceptionHandler.setEventName("d1.E1");
defaultExceptionHandler.setExceptionName("MyException");
defaultExceptionHandler.printException();
}
}
else if (D1Domain.s.equalsTo(S  . S1))
{_f2feature.pu7((E1) e);
}
else if (D1Domain.s.equalsToConstant(S  . S1))
{try {// for default
_affeature._af_pu1_throwex_resources_ex_myexception = null;_affeature.pu1((E1) e);
}//for default hander
catch(MyException exception)
{
DefaultExceptionHandler defaultExceptionHandler=new DefaultExceptionHandler();
defaultExceptionHandler.setFeaturePackageName("SpF2");
defaultExceptionHandler.setFeatureName("AF");
defaultExceptionHandler.setProgramUnitName("pu1");
defaultExceptionHandler.setEventName("d1.E1");
defaultExceptionHandler.setExceptionName("MyException");
defaultExceptionHandler.printException();
}
}
else if (D1Domain.s.equalsToConstant(S  . S2))
{_affeature.pu2((E1) e);
}

}
}
else if ( e instanceof E4) {
{
if (D1Domain.s.equalsTo(S  . S1))
{_f2feature.pu8((E4) e);
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
loadFactorI 	thresholdxp?@     w      t d1.E2sq ~ ?@     w      t allsr core.table.OrderedHashtablexd���d!0 L keyOrderListt Ljava/util/LinkedList;xq ~ ?@     w      t HF2.D1Domain.s.equalsTo(S  . S2)&&AF.D1Domain.s.equalsToConstant(S  . S1)sr java.util.LinkedList)S]J`�"  xpw   sr core.table.FITsubentry��%��u�R L featureNameEntryq ~ L programBodyEntryq ~ L programUnitNameEntryq ~ xpt F2t '{    System  . out  . println (r3)  ; }t pu9sq ~ t AFt '{    System  . out  . println (r1)  ; }t pu3xt F2.D1Domain.s.equalsTo(S  . S2)sq ~ w   q ~ xt 'AF.D1Domain.s.equalsToConstant(S  . S1)sq ~ w   q ~ xxsq ~ w   q ~ q ~ q ~ xxt d1.E1sq ~ ?@     w      q ~ sq ~ 	?@     w      t F2.D1Domain.s.equalsTo(S  . S1)sq ~ w   sq ~ q ~ t '{    System  . out  . println (r3)  ; }t pu7xt 'AF.D1Domain.s.equalsToConstant(S  . S1)sq ~ w   sq ~ q ~ t ={    r1  . throwEx ()  ;   System  . out  . println (r1)  ; }t pu1xt HF2.D1Domain.s.equalsTo(S  . S1)&&AF.D1Domain.s.equalsToConstant(S  . S1)sq ~ w   q ~ "q ~ 'xt 'AF.D1Domain.s.equalsToConstant(S  . S2)sq ~ w   sq ~ q ~ t '{    System  . out  . println (r1)  ; }t pu2xt HF2.D1Domain.s.equalsTo(S  . S1)&&AF.D1Domain.s.equalsToConstant(S  . S2)sq ~ w   q ~ "q ~ .xxsq ~ w   q ~ 1q ~ *q ~  q ~ %q ~ ,xxt d3.E4sq ~ ?@     w      q ~ sq ~ 	?@     w      t F2.D1Domain.s.equalsTo(S  . S1)sq ~ w   sq ~ q ~ t '{    System  . out  . println (r3)  ; }t pu8xxsq ~ w   q ~ 7xxxt SpF2feature
*/
