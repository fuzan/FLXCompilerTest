package d1.ef;
import external.*;
import Resources.*;
import Resources.ex.*;
import d1.*;import java.rmi.*;

public class 
 ExceptionHandlerFeature extends 
 EFDomain  {
private boolean activated = true;
public void activate() { activated = true; }
public void deactivate() { activated = false; }
public boolean isActivated() { return activated; }

public  ExceptionHandlerFeature() {
super();
}
public void handler(Resources  . ex  . MyException ex)
{
if (activated)

 {
 System.out.println("Exception is handled in EH");
 }}


}
/* IntermediateInfo:terminationModel********************
�� sr java.util.Hashtable�%!J� F 
loadFactorI 	thresholdxp?@     w       x
*/
