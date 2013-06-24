package d1;
import external.*;
import Resources.*;import java.rmi.*;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

public class 
 AFFeature extends 
 D1Domain implements Serializable  {

private boolean activated = true;
private Map<String, Boolean> jEntered = new HashMap<String, Boolean>();
private Map<String, Boolean> pCondition = new HashMap<String, Boolean>();
private EventBuffer<FL_EVENT_STEM> sharedBuffer;
private ExecutorService threadExecuter;
public void activate() { activated = true; }
public void deactivate() { activated = false; }
public boolean isActivated() { return activated; }

public  AFFeature()
{
super();
// write jEntered Here
}
public  AFFeature(  R1  r1)
{
super();
// write jEntered Here
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
AFFeature.this.XEvent(buffer.remove());
}catch(Exception ex){
ex.printStackTrace();
}//end of catch
}//end of while
}//end of run
}//end of Consumer Class
Consumer consumer = new Consumer(sharedBuffer);
threadExecuter.execute(consumer);
}

 
      
         
 public synchronized void pu1(E1 e)
 throws Resources.ex.MyException{
try { 
if (activated)
{
try{ //for resume throwEx & 
 r1 . throwEx ( ) ;
}
catch( Resources.ex.MyException ex){
if(_af_pu1_throwex_resources_ex_myexception!=null)_af_pu1_throwex_resources_ex_myexception.handle(ex);else throw ex; 
} // automacitally created for resume 
 System . out . println ( r1 ) ;
}
} 
finally {}
}

           public synchronized void pu2(E1 e)
{
try { 
if (activated)
{
System . out . println ( r1 ) ;
}
} 
finally {}
}

 
         
 public synchronized void pu3(E2 e)
{
try { 
if (activated)
{
System . out . println ( r1 ) ;
}
} 
finally {}
}

public IResumeHandler _af_pu1_throwex_resources_ex_myexception;

public synchronized void sendEvent( FL_EVENT_STEM e ) {
	sharedBuffer.add(e);
}
private synchronized void XEvent( FL_EVENT_STEM e )
{

	if(activated) {
// write pConditions Here
		if ( e instanceof d1.E2) {
			{
			if (D1Domain.s.equalsToConstant(S  . S1))
			{this.pu3((d1.E2) e);
			}

			}
			}
		else if ( e instanceof d1.E1) {
			{
			if (D1Domain.s.equalsToConstant(S  . S1))
			{try {
			this.pu1((d1.E1) e);
			}
catch(Resources.ex.MyException exception)
{
DefaultExceptionHandler defaultExceptionHandler=new DefaultExceptionHandler();
defaultExceptionHandler.setFeaturePackageName("AF");
defaultExceptionHandler.setFeatureName("AF");
defaultExceptionHandler.setProgramUnitName("pu1");
defaultExceptionHandler.setEventName("d1.E1");
defaultExceptionHandler.setExceptionName("Resources.ex.MyException");
defaultExceptionHandler.printException();
}
			}
			else if (D1Domain.s.equalsToConstant(S  . S2))
			{this.pu2((d1.E1) e);
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
eventNodest Ljava/util/Hashtable;L featureNamet Ljava/lang/String;xp sr java.util.Hashtable�%!J� F 
loadFactorI 	thresholdxp?@     w      t d1.E2sq ~ ?@     w      t allsr core.table.OrderedHashtablexd���d!0 L keyOrderListt Ljava/util/LinkedList;xq ~ ?@     w      t $D1Domain.s.equalsToConstant(S  . S1)sr java.util.LinkedList)S]J`�"  xpw   sr core.table.FITsubentry��%��u�R L featureNameEntryq ~ L programBodyEntryq ~ L programUnitNameEntryq ~ xpt AFt '{    System  . out  . println (r1)  ; }t pu3xxsq ~ w   q ~ xxt d1.E1sq ~ ?@     w      q ~ sq ~ 	?@     w      t $D1Domain.s.equalsToConstant(S  . S2)sq ~ w   sq ~ q ~ t '{    System  . out  . println (r1)  ; }t pu2xt $D1Domain.s.equalsToConstant(S  . S1)sq ~ w   sq ~ q ~ t ={    r1  . throwEx ()  ;   System  . out  . println (r1)  ; }t pu1xxsq ~ w   q ~ q ~ xxxq ~ 
*/
