package base;
import external.*;
import ddt.lang.*;
import Resources.*;import java.io.Serializable;
public class
 State extends DTenum implements Serializable
{
enum _ {START,END}
private State(int value){super(value);}
public static State START = new State(_.START.ordinal());
public static State END = new State(_.END.ordinal());
}
