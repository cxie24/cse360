/**  
* AddingMachine.java - A simple adding machine with no implementation yet
* @author Chenghao Xie
* @version 2.0 
* @see CSE360
* https://github.com/cxie24/cse360.git
*/ 
package cse360assignment02;

public class AddingMachine {
  private static  int total;
  private static  String s = "0";
  
  public static void main(String[] args)
  {
    add(4);
    add(5);
    subtract(2);  
    System.out.println(towString());
    System.out.println(getTotal());  
  }
  
  public AddingMachine () {
    total = 0;  // not needed - included for clarity
  }
  
  public static int getTotal () {
    return total;
  }
  
  public static void add (int value) {
	  total=total+value;
	  s=s+" + "+value;
  }

  public static void subtract (int value) {
	  total = total-value;
	  s=s+" - "+value;
  }

  public static String towString () {
    return s;
  }

  public void clear() {
	  total=0;
	  s="0";
  }
}
