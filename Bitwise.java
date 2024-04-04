import java.lang.*;
import java.util.Scanner;

public class Bitwise
{
   public static void main(String args[])
   {
    int a=10;
    int b=15;
    a=a^b;
    b=a^b;
    a=a^b;
    System.out.println(a +" "+ b);
    
    byte c=9;
    byte d=12;
    d=(byte)(d<<4);
    c=(byte)(c|d);
    System.out.println((c&0b00001111));
    System.out.println((c&0b11110000)>>4);


    
    }
} 