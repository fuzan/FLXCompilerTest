package c;
import a.*;
import external.*;
import ddt.lang.*;import java.rmi.*;
import java.io.Serializable;

public class 
 CFeature
 extends 
 DomainDomain implements Serializable  {
private boolean activated = true;
public void activate() { activated = true; }
public void deactivate() { activated = false; }
public boolean isActivated() { return activated; }

public  CFeature() {
super();
}

 
       
 public synchronized void allInteract(FL_EVENT_STEM e)
{
if (activated)
{
i . add ( 1 ) ;
}
}


 
       
 public synchronized void bAndcInteract(Init e)
{
try { 
if (activated)
{
i . add ( 1 ) ;
}
} 
finally {}
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
loadFactorI 	thresholdxp?@     w      t entersq ~ ?@     w      t allsr core.table.OrderedHashtablexd���d!0 L keyOrderListt Ljava/util/LinkedList;xq ~ ?@     w      t .Anchor.DomainDomain.i.lessThan(DomainDomain.j)sr java.util.LinkedList)S]J`�"  xpw   sr core.table.FITsubentry��%��u�R L featureNameEntryq ~ L programBodyEntryq ~ L programUnitNameEntryq ~ xpt Anchort {    i  . add (1)  ; }t allInteractxxsq ~ w   q ~ xxxt Cfeature
*/
