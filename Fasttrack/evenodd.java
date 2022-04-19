import java.util.Scanner;
class evenodd
  {
    public static void main(String args[])
    {
      int num;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number");
      num=sc.nextInt();
    if(num%2==0)
    {
      System.out.println("it is even");
    }
      else
    {
      System.out.println("it is odd");
    }
    }
  }