package d1;
import external.*;
import ddt.lang.*;
import Resources.*;import java.io.Serializable;
public class
 S extends DTenum implements Serializable
{
enum _ {S1,S2,S3,S4}
private S(int value){super(value);}
public static S S1 = new S(_.S1.ordinal());
public static S S2 = new S(_.S2.ordinal());
public static S S3 = new S(_.S3.ordinal());
public static S S4 = new S(_.S4.ordinal());
}
