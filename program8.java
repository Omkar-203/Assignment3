/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment3;
import java.util.*;
/**
 *8.Print the average of three numbers entered by user by creating a class named 'Average' having a method to calculate and print the average.
 * @author omkar
 */
class Average
{
	double avg;
	Average(double a, double b, double c)
	{
	 avg= (a+b+c)/3;

	}
}
class program8
{
   public static void main(String args[]) 
    {   
      Scanner sc= new Scanner(System.in);
System.out.println("Enter the value of a1");
      double a1= sc.nextDouble();   
System.out.println("Enter the value of a2");
      double a2= sc.nextDouble();      
System.out.println("Enter the value of a3");
      double a3= sc.nextDouble();      	  
      Average obj =new Average(a1, a2, a3);
	  System.out.println("Average of three number is :" + obj.avg);      
   }

}