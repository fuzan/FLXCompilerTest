package d1.d3;
import external.*;
import Resources.*;
import d1.*;import java.rmi.*;
import java.io.Serializable;

public class 
 F2Feature
 extends 
 D3Domain implements Serializable  {
private boolean activated = true;
public void activate() { activated = true; }
public void deactivate() { activated = false; }
public boolean isActivated() { return activated; }

public  F2Feature() {
super();
}

 
         
 public synchronized void pu7(E1 e)
{
try { 
if (activated)
{
System . out . println ( r3 ) ;
}
} 
finally {}
}


 
         
 public synchronized void pu8(E4 e)
{
try { 
if (activated)
{
System . out . println ( r3 ) ;
}
} 
finally {}
}


 
         
 public synchronized void pu9(E2 e)
{
try { 
if (activated)
{
System . out . println ( r3 ) ;
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
�� sr "core.table.FeatureInteractionTable�V���6L� Z 
emptyTableZ isFeatureNameSetL 
eventNodest Ljava/util/Hashtable;L featureNamet Ljava/lang/String;xpsr java.util.Hashtable�%!J� F 
loadFactorI 	thresholdxp?@     w      t d1.E2sq ~ ?@     w      t allsr core.table.OrderedHashtablexd���d!0 L keyOrderListt Ljava/util/LinkedList;xq ~ ?@     w      t 'AF.D1Domain.s.equalsToConstant(S  . S1)sr java.util.LinkedList)S]J`�"  xpw   sr core.table.FITsubentry��%��u�R L featureNameEntryq ~ L programBodyEntryq ~ L programUnitNameEntryq ~ xpt AFt '{    System  . out  . println (r1)  ; }t pu3xxsq ~ w   q ~ xxt d1.E1sq ~ ?@     w      q ~ sq ~ 	?@     w      t 'AF.D1Domain.s.equalsToConstant(S  . S1)sq ~ w   sq ~ q ~ t ={    r1  . throwEx ()  ;   System  . out  . println (r1)  ; }t pu1xt 'AF.D1Domain.s.equalsToConstant(S  . S2)sq ~ w   sq ~ q ~ t '{    System  . out  . println (r1)  ; }t pu2xxsq ~ w   q ~ q ~ xxxt 	F2feature
*/
