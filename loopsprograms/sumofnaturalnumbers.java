import java.util.Scanner;
class sumofnaturalnumbers{
  public static void main(String args[])
  {
    int n,sum=0;
    Scanner sc = new Scanner(System.in);
    System.out.println("all the numbers ");
    n=sc.nextInt();
    int i=1;
    while (i<=n){
      sum=sum+i;
      i++;
        }
      System.out.println(sum);
    }
  }
