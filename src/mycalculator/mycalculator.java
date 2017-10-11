package mycalculator;

import java.util.Scanner;



public class mycalculator
{
   public static void main(String args[])
   {
      int a, b, res, flag=1;
      Scanner scan = new Scanner(System.in);
     while (flag!=0)
    { 
      System.out.print("Enter 1 for + , 2 for - , 3 for * ,  4 for / and 0 to terminate : ");
      flag=scan.nextInt();
      if (flag==0) break;
      System.out.print("Enter Two Numbers : ");
      a = scan.nextInt();
      b = scan.nextInt();
     
	   if (flag==1) 
	   {
		   res = a + b;
		   System.out.println("Addition = " +res);
	   }
	   else if (flag==2)
	   {
		   res = a - b;
		   System.out.println("Subtraction = " +res);
	   }
	   else if (flag==3)
	   {
		    res = a * b;
		    System.out.println("Multiplication = " +res);
	   }
	   else if (flag==4)
	   {
		   res = a / b;
		   System.out.println("Division = " +res);
	   }
	   
	   
     }
   }

}
