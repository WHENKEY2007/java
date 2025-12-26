import java.util.Scanner;

class Bank {
    int acc_no;
    String acc_honame;
    int bal = 0;
    void deposit(int dp) {
        bal += dp;
        System.out.println("Deposited: " + dp);
    }   
    void withdraw(int wd) {
        if (wd <= bal) {
            bal -= wd;
            System.out.println("Withdrawn: " + wd);
        } else {
            System.out.println("Insufficient balance");
        }
    }
    void display() { 
        System.out.println("Account Number: " + acc_no);
        System.out.println("Account Holder Name: " + acc_honame);
        System.out.println("Balance: " + bal);
    }
}
public class Banking_class {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        Bank b1 = new Bank();
        b1.acc_no = 12345;
        b1.acc_honame = "Vijay Mallya"; 

        b1.display();

        System.out.print("Enter deposit amount: ");
        int d = sc.nextInt();
        b1.deposit(d);

        System.out.print("Enter withdraw amount: ");
        int w = sc.nextInt();
        b1.withdraw(w);

        b1.display();
        sc.close();
    }
}
