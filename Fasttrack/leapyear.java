import java.util.Scanner;
class leapyear
  {
    public static void main(String args[])
    {
      int year;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number");
      year=sc.nextInt();
    if(year%4==0)
    {
      System.out.println("it is leap year");
    }
      else
    {
      System.out.println("it is not leap year");
    }
    }
  }