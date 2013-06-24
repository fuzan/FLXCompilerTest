package d1.fp;
import external.*;
import Resources.*;
import Resources.ex.*;
import d1.*;
import d1.d2.*;
import d1.d3.*;
import java.rmi.*;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

public class MultipleDomainFeaturePackage
 implements Serializable 
{

F1Feature _f1feature;
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

public MultipleDomainFeaturePackage(  R1  r1 ,   R2  r2 ,   R3  r3) {
super();
D3Domain.r3 = r3;
D2Domain.r2 = r2;
D1Domain.r1 = r1;
D2Domain.r1 = r1;
D3Domain.r1 = r1;
// write jEntered Here
this._f2feature = new F2Feature();
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
MultipleDomainFeaturePackage.this.XEvent(buffer.remove());
}catch(Exception ex){
ex.printStackTrace();
}//end of catch
}//end of while
}//end of run
}//end of Consumer Class
Consumer consumer = new Consumer(sharedBuffer);
threadExecuter.execute(consumer);
}
public MultipleDomainFeaturePackage(F2Feature _f2feature, F1Feature _f1feature, AFFeature _affeature)
 {
super();
// write jEntered Here
this._f2feature = _f2feature;
this._f1feature = _f1feature;
this._affeature = _affeature;
}

 public void test(){
 System.out.println("this is a method of FP");
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
if (D1Domain.s.equalsTo(S  . S1))
{_f1feature.pu5((E3) e);
}

}
}
else if ( e instanceof E2) {
{
if (D1Domain.s.equalsTo(S  . S2)&&D1Domain.s.equalsTo(S  . S2)&&D1Domain.s.equalsToConstant(S  . S1))
{_f2feature.pu9((E2) e);
}
else if (D1Domain.s.equalsTo(S  . S2)&&D1Domain.s.equalsToConstant(S  . S1))
{_f2feature.pu9((E2) e);
}
else if (D1Domain.s.equalsTo(S  . S2)&&D1Domain.s.equalsTo(S  . S2))
{_f2feature.pu9((E2) e);
}
else if (D1Domain.s.equalsTo(S  . S2)&&D1Domain.s.equalsToConstant(S  . S1))
{_f1feature.pu6((E2) e);
}
else if (D1Domain.s.equalsTo(S  . S2))
{_f2feature.pu9((E2) e);
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
if (D1Domain.s.equalsTo(S  . S1)&&D1Domain.s.equalsTo(S  . S1)&&D1Domain.s.equalsToConstant(S  . S2))
{_f2feature.pu7((E1) e);
}
else if (D1Domain.s.equalsTo(S  . S1)&&D1Domain.s.equalsTo(S  . S1)&&D1Domain.s.equalsToConstant(S  . S1))
{_f2feature.pu7((E1) e);
}
else if (D1Domain.s.equalsTo(S  . S1)&&D1Domain.s.equalsToConstant(S  . S2))
{_f2feature.pu7((E1) e);
}
else if (D1Domain.s.equalsTo(S  . S1)&&D1Domain.s.equalsToConstant(S  . S2))
{_f1feature.pu4((E1) e);
}
else if (D1Domain.s.equalsTo(S  . S1)&&D1Domain.s.equalsToConstant(S  . S1))
{_f2feature.pu7((E1) e);
}
else if (D1Domain.s.equalsTo(S  . S1)&&D1Domain.s.equalsTo(S  . S1))
{_f2feature.pu7((E1) e);
}
else if (D1Domain.s.equalsTo(S  . S1)&&D1Domain.s.equalsToConstant(S  . S1))
{_f1feature.pu4((E1) e);
}
else if (D1Domain.s.equalsTo(S  . S1))
{_f2feature.pu7((E1) e);
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
defaultExceptionHandler.setFeaturePackageName("MultipleDomain");
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
loadFactorI 	thresholdxp?@     w      t d2.E3sq ~ ?@     w      t allsr core.table.OrderedHashtablexd���d!0 L keyOrderListt Ljava/util/LinkedList;xq ~ ?@     w      t F1.D1Domain.s.equalsTo(S  . S1)sr java.util.LinkedList)S]J`�"  xpw   sr core.table.FITsubentry��%��u�R L featureNameEntryq ~ L programBodyEntryq ~ L programUnitNameEntryq ~ xpt F1t '{    System  . out  . println (r2)  ; }t pu5xxsq ~ w   q ~ xxt d1.E2sq ~ ?@     w      t allsq ~ 	?@     w      t iF2.D1Domain.s.equalsTo(S  . S2)&&F1.D1Domain.s.equalsTo(S  . S2)&&AF.D1Domain.s.equalsToConstant(S  . S1)sq ~ w   sq ~ t F2t '{    System  . out  . println (r3)  ; }t pu9xt HF2.D1Domain.s.equalsTo(S  . S2)&&AF.D1Domain.s.equalsToConstant(S  . S1)sq ~ w   q ~ xt @F2.D1Domain.s.equalsTo(S  . S2)&&F1.D1Domain.s.equalsTo(S  . S2)sq ~ w   q ~ xt F1.D1Domain.s.equalsTo(S  . S2)sq ~ w   sq ~ q ~ t '{    System  . out  . println (r2)  ; }t pu6xt F2.D1Domain.s.equalsTo(S  . S2)sq ~ w   q ~ xt 'AF.D1Domain.s.equalsToConstant(S  . S1)sq ~ w   sq ~ t AFt '{    System  . out  . println (r1)  ; }t pu3xt HF1.D1Domain.s.equalsTo(S  . S2)&&AF.D1Domain.s.equalsToConstant(S  . S1)sq ~ w   q ~ %xxsq ~ w   q ~ q ~ q ~ !q ~ 0q ~ (q ~ #q ~ *xxt d1.E1sq ~ ?@     w      q ~ sq ~ 	?@     w      t @F2.D1Domain.s.equalsTo(S  . S1)&&F1.D1Domain.s.equalsTo(S  . S1)sq ~ w   sq ~ q ~ t '{    System  . out  . println (r3)  ; }t pu7xt HF1.D1Domain.s.equalsTo(S  . S1)&&AF.D1Domain.s.equalsToConstant(S  . S1)sq ~ w   sq ~ q ~ t '{    System  . out  . println (r2)  ; }t pu4xt F1.D1Domain.s.equalsTo(S  . S1)sq ~ w   q ~ =xt 'AF.D1Domain.s.equalsToConstant(S  . S2)sq ~ w   sq ~ q ~ -t '{    System  . out  . println (r1)  ; }t pu2xt iF2.D1Domain.s.equalsTo(S  . S1)&&F1.D1Domain.s.equalsTo(S  . S1)&&AF.D1Domain.s.equalsToConstant(S  . S2)sq ~ w   q ~ 8xt HF2.D1Domain.s.equalsTo(S  . S1)&&AF.D1Domain.s.equalsToConstant(S  . S2)sq ~ w   q ~ 8xt HF1.D1Domain.s.equalsTo(S  . S1)&&AF.D1Domain.s.equalsToConstant(S  . S2)sq ~ w   q ~ =xt F2.D1Domain.s.equalsTo(S  . S1)sq ~ w   q ~ 8xt 'AF.D1Domain.s.equalsToConstant(S  . S1)sq ~ w   sq ~ q ~ -t ={    r1  . throwEx ()  ;   System  . out  . println (r1)  ; }t pu1xt iF2.D1Domain.s.equalsTo(S  . S1)&&F1.D1Domain.s.equalsTo(S  . S1)&&AF.D1Domain.s.equalsToConstant(S  . S1)sq ~ w   q ~ 8xt HF2.D1Domain.s.equalsTo(S  . S1)&&AF.D1Domain.s.equalsToConstant(S  . S1)sq ~ w   q ~ 8xxsq ~ w   q ~ Gq ~ Tq ~ Iq ~ Kq ~ Vq ~ 6q ~ ;q ~ Mq ~ @q ~ Oq ~ Bxxt d3.E4sq ~ ?@     w      q ~ sq ~ 	?@     w      t F2.D1Domain.s.equalsTo(S  . S1)sq ~ w   sq ~ q ~ t '{    System  . out  . println (r3)  ; }t pu8xxsq ~ w   q ~ \xxxt MultipleDomainfeature
*/
