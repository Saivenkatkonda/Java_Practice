import java.util.Scanner;
class casvowels
  {
    public static void main(String args[])
      {
        char ch;
        System.out.println("enter the n value:");
        Scanner sc = new Scanner(System.in);
        ch=sc.next().CharAt(0);
        switch(ch)
          {
            case 'a' : case 'A':
            case 'e' : case 'E':
            case 'i' : case 'I':
            case 'o' : case 'O':
            case 'u' : case 'U':
      System.out.println("Vowels");
      break;
            default:
              System.out.println("");
  }
        }
  }