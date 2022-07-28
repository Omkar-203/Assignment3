/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment3;
import java.util.*;
/**
 *
 * @author omkar
 */

 public class area1{
  int length;
  int breadth;
  public area1(int l, int b){
    length = l;
    breadth = b;
  }
  public int getArea(){
    return length*breadth;
  }
}

class Ans{
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    int l,b;

    System.out.println("Enter length");
    l = s.nextInt();
    System.out.println("Enter breadth");
    b = s.nextInt();

    area1 a = new area1(l,b);
    System.out.println("Area : "+a.getArea());
  }
}		