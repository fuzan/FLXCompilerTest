package base.lessthanzero;
import external.*;
import Resources.*;
import Resources.ex.*;
import base.*;import java.rmi.*;

public class 
 LessThanZeroFeature extends 
 LessThanZeroDomain  {
private boolean activated = true;
public void activate() { activated = true; }
public void deactivate() { activated = false; }
public boolean isActivated() { return activated; }

public  LessThanZeroFeature() {
super();
}
public void handleAtAdd(Resources  . ex  . LessThanZeroException ex)
{
if (activated)

 {
 st.addStr("LessThanZeroException handled at Add");
 }}


}
/* IntermediateInfo:terminationModel********************
�� sr java.util.Hashtable�%!J� F 
loadFactorI 	thresholdxp?@     w       x
*/
