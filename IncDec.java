import java.lang.*;
import java.util.Scanner;

public class IncDec
{
   public static void main(String args[])
   {
    int a=5;
    int b=a++;
    int c=2*a-- + 3*++b;
    float d=5.3f;
    d++;
    System.out.println(c);
    System.out.println(d);
    
    }
} 