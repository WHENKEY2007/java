import java.util.Scanner;
class DigitalSum{
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    while(n>=10)
    {
        int sum=0;
    while(n!=0){
        int rem=n%10;
        sum+=rem;
        n/=10;
    }
    n=sum;
}
        System.out.println("DigitalSum is: "+n);
        sc.close();
    }
}

