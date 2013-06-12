package base.multiply;
import external.*;
import Resources.*;
import base.*;/**

 Multiply**/

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

public class  Calc1Feature
 extends MultiplyDomain  implements Serializable 
 {
CalcFeature _calcfeature;

private boolean activated = true;
private Map<String, Boolean> jEntered = new HashMap<String, Boolean>();
private Map<String, Boolean> pCondition = new HashMap<String, Boolean>();
private EventBuffer<FL_EVENT_STEM> sharedBuffer;
private ExecutorService threadExecuter;
public void activate() { activated = true; }
public void deactivate() { activated = false; }
public boolean isActivated() { return activated; }

public Calc1Feature(  SyncTool  st) {
super();
// write jEntered Here
this._calcfeature = new CalcFeature();
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
Calc1Feature.this.XEvent((FL_EVENT_STEM)buffer.remove());
}catch(Exception ex){
ex.printStackTrace();
}//end of catch
}//end of while
}//end of run
}//end of Consumer Class
Consumer consumer = new Consumer(sharedBuffer);
threadExecuter.execute(consumer);
}
public  Calc1Feature()
 {
super();
// write jEntered Here
this._calcfeature = _calcfeature;
}

 ;

 
         
                   
       
 
           
 public synchronized void multiplying(Multiply e)
{
try { 
if (activated)
{
int current = total . intValue ( ) ;
for ( int i = 1 ;
i < e . getValue ( ) ;
i ++ ) {
total . add ( current ) ;
}
st . setResult ( total . intValue ( ) ) ;
}
} 
finally {}
}

        public synchronized void exit(Exit e)
{
try { 
if (activated)
{
st . finishes ( ) ;
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
		if ( e instanceof Exit) {
			{
			if (true)
			{this.exit((Exit) e);
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
			if (true)
			{_calcfeature.adding((Add) e);
			}

			}
			}
		else if ( e instanceof Multiply) {
			{
			if (true)
			{this.multiplying((Multiply) e);
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
?@     w      t Calc.allsq ~ w   sq ~ t Calct U{    total  . add (e  . getValue ())  ;   st  . setResult (total  . intValue ())  ; }t addingxxsq ~ w   q ~ xxt 	base.Exitsq ~ ?@     w      q ~ sq ~ 
?@     w      t Calc.allsq ~ w   sq ~ q ~ t {    st  . finishes ()  ; }t exitxxsq ~ w   q ~ $xxt multiply.Multiplysq ~ ?@     w      q ~ 	sq ~ 
?@     w      t 	Calc1.allsq ~ w   sq ~ q ~ t �{    int current = total  . intValue ()  ; for (  int i = 1 ; i  < e  . getValue ();  i ++ ) {    total  . add (current)  ; }   st  . setResult (total  . intValue ())  ; }t multiplyingxxsq ~ w   q ~ -xxxt Calc1feature
*/
