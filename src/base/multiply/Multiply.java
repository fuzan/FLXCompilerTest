package base.multiply;import java.io.Serializable;

public class Multiply extends MultiplyEvent implements Serializable{

 int value;

 public Multiply(int value){
 this.value = value;

 }
 public int getValue(){
 return value;
 }
}