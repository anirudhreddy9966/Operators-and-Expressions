import java.lang.*;
import java.util.Scanner;

public class Area
{
   public static void main(String args[])
   {
    float a,h,b;
    Scanner sc=new Scanner(System.in);
    System.out.println("ENTER THE HEIGHT");
    h=sc.nextFloat();
    System.out.println("ENTER THE base");
    b=sc.nextFloat();
    a=(b*h)/2;
    System.out.println("The area is" + a);
    }
} 