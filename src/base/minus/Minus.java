package base.minus;import java.io.Serializable;

public class Minus extends MinusEvent implements Serializable{

 int value;

 public Minus(int value){
 this.value = value;

 }
 public int getValue(){
 return value;
 }
}