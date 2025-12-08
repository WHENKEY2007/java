import java.util.Scanner;
public class Arrays_conc2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        char C[]=new char[n];
        for(int i=0;i<C.length;i++){
            C[i] = sc.next().charAt(0);
        }
        for(char a:C){
            System.out.println(a);
        }
        sc.close();
}
}