/* JFM1T4_Assignment1:
   Write a program to find the highest among the given 3 numbers.
   Prompt the user for the 3 numbers to be input from the terminal.

   SampleInput: 
   Enter the first number: 11
   Enter the second number: 22
   Enter the third number: 1

   Expected Output:
   22 is highest number
 	
*/

//import statements for java program to read inputs using Scanner class 
import java.util.Scanner;

public class HighestNumber {
     
//Add main method
public static void main(String args[])
  {
    
//Declare the three variables
int num1;
int num2;
int num3;    
//Use the scanner class to provide input at execution time
    
// 
 Scanner sc= new Scanner(System.in);
 System.out.println("Enter the first number");
 num1=sc.nextInt();
 System.out.println("Enter the second number");
 num2=sc.nextInt();
 System.out.println("Enter the three number");
 num3=sc.nextInt();
 
//

//check which number is highest using if else condition
if(num1>num2){
  if(num1>num3){
    System.out.println("num1 is Big"+ num1);
  }
  else{
    System.out.println("num3 is Big"+ num3);
  }
}
 else{
   if(num2>num3){
     System.out.println("num2 is Big"+ num2);
   }
   else{
     System.out.println("num3 is Big"+ num3);
   }
 }
//Print the highest of three numbers
 
}
}