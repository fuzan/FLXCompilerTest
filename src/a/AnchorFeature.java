package a;
import external.*;import java.rmi.*;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

public class 
 AnchorFeature extends 
 DomainDomain implements Serializable  {

private boolean activated = true;
private Map<String, Boolean> jEntered = new HashMap<String, Boolean>();
private Map<String, Boolean> pCondition = new HashMap<String, Boolean>();
private EventBuffer<FL_EVENT_STEM> sharedBuffer;
private ExecutorService threadExecuter;
public void activate() { activated = true; }
public void deactivate() { activated = false; }
public boolean isActivated() { return activated; }

public  AnchorFeature()
{
super();
// write jEntered Here
jEntered.put("domaindomain.i.lessthan(domaindomain.j)" , false);
}
public  AnchorFeature(int ii)
{
super();
// write jEntered Here
jEntered.put("domaindomain.i.lessthan(domaindomain.j)" , false);
DomainDomain.ii = ii;
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
AnchorFeature.this.XEvent(buffer.remove());
}catch(Exception ex){
ex.printStackTrace();
}//end of catch
}//end of while
}//end of run
}//end of Consumer Class
Consumer consumer = new Consumer(sharedBuffer);
threadExecuter.execute(consumer);
}

 
       
 public synchronized void allInteract(FL_EVENT_STEM e)
{
if (activated)
{
i . add ( 1 ) ;
}
}


public synchronized void sendEvent( FL_EVENT_STEM e ) {
	sharedBuffer.add(e);
}
private synchronized void XEvent( FL_EVENT_STEM e )
{

	if(activated) {
// write pConditions Here
// write jEntered Here
if(!DomainDomain.i.lessThan(DomainDomain.j))
jEntered.put("domaindomain.i.lessthan(domaindomain.j)" , false);
while(true){
boolean noLeaveEvent = true;
boolean noEnterEvent = true;
// write jEntered Here
if(!DomainDomain.i.lessThan(DomainDomain.j))
jEntered.put("domaindomain.i.lessthan(domaindomain.j)" , false);
			{
			if (!jEntered.get("domaindomain.i.lessthan(domaindomain.j)")&&DomainDomain.i.lessThan(DomainDomain.j))
			{				noEnterEvent = false;this.allInteract(e);
jEntered.put("domaindomain.i.lessthan(domaindomain.j)" , DomainDomain.i.lessThan(DomainDomain.j));			}

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
eventNodest Ljava/util/Hashtable;L featureNameq ~ xp t &&sr java.util.Hashtable�%!J� F 
loadFactorI 	thresholdxp?@     w      t entersq ~ ?@     w      t allsr core.table.OrderedHashtablexd���d!0 L keyOrderListt Ljava/util/LinkedList;xq ~ ?@     w      t 'DomainDomain.i.lessThan(DomainDomain.j)sr java.util.LinkedList)S]J`�"  xpw   sr core.table.FITsubentry��%��u�R L featureNameEntryq ~ L programBodyEntryq ~ L programUnitNameEntryq ~ xpt Anchort {    i  . add (1)  ; }t allInteractxxsq ~ w   q ~ xxxq ~ 
*/
