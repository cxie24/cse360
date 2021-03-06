/**  
* AddingMachine.java - A simple adding machine with no implementation yet
* @author Chenghao Xie
* @version 2.0 
* @see CSE360
* https://github.com/cxie24/cse360.git
*/ 
package cse360assignment02;

public class AddingMachine {
  private int total;
  private String s = "0";
  
  public AddingMachine () {
    total = 0;  // not needed - included for clarity
  }
  
  public int getTotal () {
    return total;
  }
  
  public void add (int value) {
	  total=total+value;
	  s=s+" + "+value;
  }

  public void subtract (int value) {
	  total = total-value;
	  s=s+" - "+value;
  }

  public String toString () {
    return s;
  }

  public void clear() {
	  total=0;
	  s="0";
  }
}
