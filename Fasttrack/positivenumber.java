import java.util.Scanner;
class postivenumber
  {
    public static void main(String args[])
    {
      int num;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number");
      num=sc.nextInt();
    if(num>=0)
    {
      System.out.println("positive");
    }
      else
    {
      System.out.println("negative");
    }
    }
  }