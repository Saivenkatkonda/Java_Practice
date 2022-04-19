import java.util.Scanner;
class vote
  {
    public static void main(String args[])
    {
      int age;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number");
      age=sc.nextInt();
    if(age>=18)
    {
      System.out.println("eligible for vote");
    }
      else
    {
      System.out.println("not eligible for vote");
    }
    }
  }