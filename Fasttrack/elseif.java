import java.util.Scanner;

class elseif
  {
    public static void main(String args[])
    {
      char ch;
      System.out.println("enter the value:");
      Scanner sc= new Scanner(System.in);
      ch=sc.next().charAt(0);
      if(ch == 'a' || ch== 'A')
        System.out.println("vowels");
      else if(ch == 'e' || ch == 'E')
        System.out.println("vowels");
      else if(ch == 'i' || ch == 'I')
        System.out.println("vowels");
      else if(ch == 'o' || ch == 'O')
        System.out.println("vowels");
      else if(ch == 'u' || ch == 'U')
        System.out.println("vowels");
      else 
        System.out.println("consonents");
      }
  }