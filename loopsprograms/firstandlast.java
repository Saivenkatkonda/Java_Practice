import java.util.Scanner;

class firstandlast
  {
    public static void main(String args[])
    {
      int n,first,last,sum=0;
      System.out.println("Enter the value :");
      Scanner sc = new Scanner (System.in);
      n =sc.nextInt();
      first =n;
      last  =n%10;
      while(n>=10){
        n=n/10;
      }
      first = n;
      sum = first + last;
      System.out.println(sum);
    }
  }