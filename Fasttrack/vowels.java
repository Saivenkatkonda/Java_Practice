import java.util.Scanner;

class vowels {
  public static void main(String args[])
    {
      char ch;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the Alphabet");
      ch=sc.next().charAt(0);
      
    if(ch=='a' || ch=='e' || ch=='i' || ch=='o'|| ch=='u' ||ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
    {
      System.out.println("Vowels");
    }
      else
    {
      System.out.println("Consonents");
    }
    }
}