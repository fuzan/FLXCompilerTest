package base.overhundred;
import external.*;
import Resources.*;
import Resources.ex.*;
import base.*;import java.rmi.*;

public class 
 OverHundredFeature extends 
 OverHundredDomain  {
private boolean activated = true;
public void activate() { activated = true; }
public void deactivate() { activated = false; }
public boolean isActivated() { return activated; }

public  OverHundredFeature() {
super();
}
public void handleAtAdd(Resources  . ex  . OverHundredException ex)
{
if (activated)

 {
 st.addStr("OverHundredException handled at Add");
 }}
public IResumeHandler gethandleAtAdd_Resources_ex_OverHundredException(){
return new IResumeHandler(){ public void handle(Exception ex){
handleAtAdd((Resources  . ex  . OverHundredException)ex);
};};}


}
/* IntermediateInfo:terminationModel********************
�� sr java.util.Hashtable�%!J� F 
loadFactorI 	thresholdxp?@     w      t -handleAtAdd.Resources.ex.OverHundredExceptiont resumex
*/
