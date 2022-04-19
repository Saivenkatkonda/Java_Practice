import java.util.Scanner;
class multiplication
  {
    public static void main(String args[])
    {
      int n,m;
      int i=1;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the table you want");
      n=sc.nextInt();
       System.out.println("enter how much you want:");
      m=sc.nextInt();
      while(i<=m){
        
      System.out.println(n+"*"+i+"="+n*i);
       i++;
      }
    }
  }