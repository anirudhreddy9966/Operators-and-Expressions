import java.lang.*;
import java.util.Scanner;

public class Areas
{
   public static void main(String args[])
   {
    int a,c,b;
    float s;
    double area;
    System.out.println("Enter a,b and c");
    Scanner sc=new Scanner(System.in);
    a=sc.nextInt();
    b=sc.nextInt();
    c=sc.nextInt();
    s=(a+b+c)/2f;
    area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
    System.out.println("The area is" + area);
    }
} 