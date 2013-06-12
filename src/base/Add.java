package base;import java.io.Serializable;

public class Add extends BaseEvent implements Serializable{

 int value;

 public Add(int value){
 this.value = value;

 }
 public int getValue(){
 return value;
 }
}