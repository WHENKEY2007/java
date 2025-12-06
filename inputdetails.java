import java.util.Scanner;
class Datatypesscan{
public static void main(String args[]){

Scanner sc=new Scanner(System.in);
int roll=sc.nextInt();
String name=sc.next();
char gender=sc.next().charAt(0);
String sec=sc.next();
double cgpa=sc.nextDouble();

System.out.println("Roll number: "+roll);
System.out.println("Name: "+name);
System.out.println("Gender: "+gender);
System.out.println("Section: "+sec);
System.out.printf("cgpa:"+cgpa);
}     
 
}