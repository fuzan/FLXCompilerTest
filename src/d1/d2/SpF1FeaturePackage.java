package d1.d2;
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

public class SpF1FeaturePackage
 extends D2Domain  implements Serializable 
{

F1Feature _f1feature;
AFFeature _affeature;

private boolean activated = true;
private Map<String, Boolean> jEntered = new HashMap<String, Boolean>();
private Map<String, Boolean> pCondition = new HashMap<String, Boolean>();
private EventBuffer<FL_EVENT_STEM> sharedBuffer;
private ExecutorService threadExecuter;
public void activate() { activated = true; }
public void deactivate() { activated = false; }
public boolean isActivated() { return activated; }

public SpF1FeaturePackage(  R2  r2 ,   R1  r1) {
super();
D2Domain.r2 = r2;
D2Domain.r1 = r1;
// write jEntered Here
this._f1feature = new F1Feature();
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
SpF1FeaturePackage.this.XEvent(buffer.remove());
}catch(Exception ex){
ex.printStackTrace();
}//end of catch
}//end of while
}//end of run
}//end of Consumer Class
Consumer consumer = new Consumer(sharedBuffer);
threadExecuter.execute(consumer);
}
public SpF1FeaturePackage(F1Feature _f1feature, AFFeature _affeature)
 {
super();
// write jEntered Here
this._f1feature = _f1feature;
this._affeature = _affeature;
}

 
         
 public void pu14(E3 e)
{
try { 
if (activated)
{
System . out . println ( "testest" ) ;
}

} catch (Exception ex) { 
ex.printStackTrace(); } 
}
public void pu14(E1 e)
{
try { 
if (activated)
{
System . out . println ( "testest" ) ;
}

} catch (Exception ex) { 
ex.printStackTrace(); } 
}
public void pu14(E2 e)
{
try { 
if (activated)
{
System . out . println ( "testest" ) ;
}

} catch (Exception ex) { 
ex.printStackTrace(); } 
}


public synchronized  void sendEvent( FL_EVENT_STEM e ) {
sharedBuffer.add(e);
}
public synchronized void XEvent( FL_EVENT_STEM e )
{

if(activated) {
// write pConditions Here
if ( e instanceof E3) {
{
if (true)
{this.pu14((E3) e);
}
else if (D1Domain.s.equalsTo(S  . S1))
{_f1feature.pu5((E3) e);
}

}
}
else if ( e instanceof E2) {
{
if (true)
{this.pu14((E2) e);
}
else if (D1Domain.s.equalsTo(S  . S2)&&D1Domain.s.equalsToConstant(S  . S1))
{_f1feature.pu6((E2) e);
_affeature.pu3((E2) e);
}
else if (D1Domain.s.equalsTo(S  . S2))
{_f1feature.pu6((E2) e);
}
else if (D1Domain.s.equalsToConstant(S  . S1))
{_affeature.pu3((E2) e);
}

}
}
else if ( e instanceof E1) {
{
if (true)
{this.pu14((E1) e);
}
else if (D1Domain.s.equalsTo(S  . S1)&&D1Domain.s.equalsToConstant(S  . S1))
{_f1feature.pu4((E1) e);
try {// for default
_affeature._af_pu1_throwex_resources_ex_myexception = null;_affeature.pu1((E1) e);
}//for default hander
catch(MyException exception)
{
DefaultExceptionHandler defaultExceptionHandler=new DefaultExceptionHandler();
defaultExceptionHandler.setFeaturePackageName("SpF1");
defaultExceptionHandler.setFeatureName("AF");
defaultExceptionHandler.setProgramUnitName("pu1");
defaultExceptionHandler.setEventName("d1.E1");
defaultExceptionHandler.setExceptionName("MyException");
defaultExceptionHandler.printException();
}
}
else if (D1Domain.s.equalsTo(S  . S1)&&D1Domain.s.equalsToConstant(S  . S2))
{_f1feature.pu4((E1) e);
_affeature.pu2((E1) e);
}
else if (D1Domain.s.equalsTo(S  . S1))
{_f1feature.pu4((E1) e);
}
else if (D1Domain.s.equalsToConstant(S  . S1))
{try {// for default
_affeature._af_pu1_throwex_resources_ex_myexception = null;_affeature.pu1((E1) e);
}//for default hander
catch(MyException exception)
{
DefaultExceptionHandler defaultExceptionHandler=new DefaultExceptionHandler();
defaultExceptionHandler.setFeaturePackageName("SpF1");
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
loadFactorI 	thresholdxp?@     w      t d2.E3sq ~ ?@     w      t allsr core.table.OrderedHashtablexd���d!0 L keyOrderListt Ljava/util/LinkedList;xq ~ ?@     w      t SpF1FeaturePackage.allsr java.util.LinkedList)S]J`�"  xpw   sr core.table.FITsubentry��%��u�R L featureNameEntryq ~ L programBodyEntryq ~ L programUnitNameEntryq ~ xpt SpF1FeaturePackaget .{    System  . out  . println ("testest")  ; }t pu14xt F1.D1Domain.s.equalsTo(S  . S1)sq ~ w   sq ~ t F1t '{    System  . out  . println (r2)  ; }t pu5xxsq ~ w   q ~ q ~ xxt d1.E2sq ~ ?@     w      q ~ sq ~ 	?@     w      t F1.D1Domain.s.equalsTo(S  . S2)sq ~ w   sq ~ q ~ t '{    System  . out  . println (r2)  ; }t pu6xt 'AF.D1Domain.s.equalsToConstant(S  . S1)sq ~ w   sq ~ t AFt '{    System  . out  . println (r1)  ; }t pu3xt SpF1FeaturePackage.allsq ~ w   sq ~ t SpF1FeaturePackaget .{    System  . out  . println ("testest")  ; }q ~ xt HF1.D1Domain.s.equalsTo(S  . S2)&&AF.D1Domain.s.equalsToConstant(S  . S1)sq ~ w   q ~  q ~ %xxsq ~ w   q ~ )q ~ .q ~ q ~ #xxt d1.E1sq ~ ?@     w      q ~ sq ~ 	?@     w      t 'AF.D1Domain.s.equalsToConstant(S  . S1)sq ~ w   sq ~ q ~ &t ={    r1  . throwEx ()  ;   System  . out  . println (r1)  ; }t pu1xt HF1.D1Domain.s.equalsTo(S  . S1)&&AF.D1Domain.s.equalsToConstant(S  . S1)sq ~ w   sq ~ q ~ t '{    System  . out  . println (r2)  ; }t pu4q ~ 6xt 'AF.D1Domain.s.equalsToConstant(S  . S2)sq ~ w   sq ~ q ~ &t '{    System  . out  . println (r1)  ; }t pu2xt SpF1FeaturePackage.allsq ~ w   sq ~ t SpF1FeaturePackaget .{    System  . out  . println ("testest")  ; }q ~ xt HF1.D1Domain.s.equalsTo(S  . S1)&&AF.D1Domain.s.equalsToConstant(S  . S2)sq ~ w   q ~ ;q ~ @xt F1.D1Domain.s.equalsTo(S  . S1)sq ~ w   q ~ ;xxsq ~ w   q ~ Cq ~ 9q ~ Hq ~ Jq ~ 4q ~ >xxxt SpF1feature
*/
