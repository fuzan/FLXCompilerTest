package d1.f4;
import external.*;
import Resources.*;
import Resources.ex.*;
import d1.*;/**

 D1**/

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

public class  F4Feature
 extends D1Domain  implements Serializable 
 {
AFFeature _affeature;

private boolean activated = true;
private Map<String, Boolean> jEntered = new HashMap<String, Boolean>();
private Map<String, Boolean> pCondition = new HashMap<String, Boolean>();
private EventBuffer<FL_EVENT_STEM> sharedBuffer;
private ExecutorService threadExecuter;
public void activate() { activated = true; }
public void deactivate() { activated = false; }
public boolean isActivated() { return activated; }

public F4Feature(  R1  r1) {
super();
this._affeature = new AFFeature();
D1Domain.r1 = r1;
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
F4Feature.this.XEvent((FL_EVENT_STEM)buffer.remove());
}catch(Exception ex){
ex.printStackTrace();
}//end of catch
}//end of while
}//end of run
}//end of Consumer Class
Consumer consumer = new Consumer(sharedBuffer);
threadExecuter.execute(consumer);
}
public  F4Feature()
 {
super();
this._affeature = _affeature;
}

 ;

 
         
 public synchronized void pu10(E1 e)
{
try { 
if (activated)
{
System . out . println ( r1 ) ;
}
} 
finally {}
}


 
         
 public synchronized void pu11(E1 e)
{
try { 
if (activated)
{
System . out . println ( r1 ) ;
}
} 
finally {}
}


 
         
 public synchronized void pu12(E2 e)
{
try { 
if (activated)
{
System . out . println ( r1 ) ;
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
		if ( e instanceof E2) {
			{
			if (D1Domain.s.equalsToConstant(S  . S1)&&D1Domain.s.equalsToConstant(S  . S1))
			{this.pu12((E2) e);
_affeature.pu3((E2) e);
			}
			else if (D1Domain.s.equalsToConstant(S  . S1))
			{this.pu12((E2) e);
			}
			else if (D1Domain.s.equalsToConstant(S  . S1))
			{_affeature.pu3((E2) e);
			}

			}
			}
		else if ( e instanceof E1) {
			{
			if (D1Domain.s.equalsToConstant(S  . S1)&&D1Domain.s.equalsToConstant(S  . S1))
			{this.pu10((E1) e);
try {// for default
			_affeature._af_pu1_throwex_resources_ex_myexception = null;_affeature.pu1((E1) e);
			}//for default hander
catch(MyException exception)
{
DefaultExceptionHandler defaultExceptionHandler=new DefaultExceptionHandler();
defaultExceptionHandler.setFeaturePackageName("F4");
defaultExceptionHandler.setFeatureName("AF");
defaultExceptionHandler.setProgramUnitName("pu1");
defaultExceptionHandler.setEventName("d1.E1");
defaultExceptionHandler.setExceptionName("MyException");
defaultExceptionHandler.printException();
}
			}
			else if (D1Domain.s.equalsToConstant(S  . S2)&&D1Domain.s.equalsToConstant(S  . S2))
			{this.pu11((E1) e);
_affeature.pu2((E1) e);
			}
			else if (D1Domain.s.equalsToConstant(S  . S2))
			{this.pu11((E1) e);
			}
			else if (D1Domain.s.equalsToConstant(S  . S1))
			{this.pu10((E1) e);
			}
			else if (D1Domain.s.equalsToConstant(S  . S1))
			{try {// for default
			_affeature._af_pu1_throwex_resources_ex_myexception = null;_affeature.pu1((E1) e);
			}//for default hander
catch(MyException exception)
{
DefaultExceptionHandler defaultExceptionHandler=new DefaultExceptionHandler();
defaultExceptionHandler.setFeaturePackageName("F4");
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
loadFactorI 	thresholdxp?@     w      t d1.E2sq ~ ?@     w      t allsr core.table.OrderedHashtablexd���d!0 L keyOrderListt Ljava/util/LinkedList;xq ~ ?@     w      t PF4.D1Domain.s.equalsToConstant(S  . S1)&&AF.D1Domain.s.equalsToConstant(S  . S1)sr java.util.LinkedList)S]J`�"  xpw   sr core.table.FITsubentry��%��u�R L featureNameEntryq ~ L programBodyEntryq ~ L programUnitNameEntryq ~ xpt F4t '{    System  . out  . println (r1)  ; }t pu12sq ~ t AFt '{    System  . out  . println (r1)  ; }t pu3xt 'F4.D1Domain.s.equalsToConstant(S  . S1)sq ~ w   q ~ xt 'AF.D1Domain.s.equalsToConstant(S  . S1)sq ~ w   q ~ xxsq ~ w   q ~ q ~ q ~ xxt d1.E1sq ~ ?@     w      q ~ sq ~ 	?@     w      t PF4.D1Domain.s.equalsToConstant(S  . S1)&&AF.D1Domain.s.equalsToConstant(S  . S1)sq ~ w   sq ~ q ~ t '{    System  . out  . println (r1)  ; }t pu10sq ~ q ~ t ={    r1  . throwEx ()  ;   System  . out  . println (r1)  ; }t pu1xt 'F4.D1Domain.s.equalsToConstant(S  . S1)sq ~ w   q ~ "xt 'AF.D1Domain.s.equalsToConstant(S  . S1)sq ~ w   q ~ %xt 'F4.D1Domain.s.equalsToConstant(S  . S2)sq ~ w   sq ~ q ~ t '{    System  . out  . println (r1)  ; }t pu11xt 'AF.D1Domain.s.equalsToConstant(S  . S2)sq ~ w   sq ~ q ~ t '{    System  . out  . println (r1)  ; }t pu2xt PF4.D1Domain.s.equalsToConstant(S  . S2)&&AF.D1Domain.s.equalsToConstant(S  . S2)sq ~ w   q ~ .q ~ 3xxsq ~ w   q ~  q ~ 6q ~ ,q ~ (q ~ *q ~ 1xxxt 	F4feature
*/
