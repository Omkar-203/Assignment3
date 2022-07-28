/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment3;
import java.util.*;
/**
 *
6.Write a program to print the area of a rectangle by creating a class named 'Area' having two methods. First method named as 'setDim' takes length and breadth of rectangle as parameters and the second method named as 'getArea' returns the area of the rectangle. Length and breadth of rectangle are entered through keyboard.
 * @author omkar
 */
public class area{

   double l , b;

   void setDim(double ll , double bb)

   {
       l = ll;
       b = bb;
   }

   double getArea()
   {
       return l*b;
   }

   public static void main(String args[])

   {
       Scanner Sc = new Scanner(System.in);

       double l , b;

       System.out.print("Enter Length : ");

       l = Sc.nextDouble();

       System.out.print("Enter Breadth : ");

       b = Sc.nextDouble();

       area rect = new area();

       rect.setDim(l , b);

       System.out.print("Area of Rectangle : " + rect.getArea());

   }
}
