import java.util.Scanner;
public class ReadingInput {
    public static void main(String args[]){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter input: ");
     byte b=sc.nextByte();
     short s=sc.nextShort();
     int i=sc.nextInt();
     long l=sc.nextLong();
     char c=sc.next().charAt(0);
     String s1=sc.next();
    sc.nextLine();
    String s2=sc.nextLine();
    System.out.println("Byte:"+b);
    System.out.println("Short:"+s);
    System.out.println("Int:"+i);
    System.out.println("Long:"+l); 
    System.out.println("Char:"+c);
    System.out.println("String1:"+s1);
    System.out.println("String2:"+s2);
    }
}