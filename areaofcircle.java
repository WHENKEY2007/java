import java.util.Scanner;
class Circle{
    public static void main(String args[]){
        float r,area;
        Scanner sc=new Scanner(System.in);
        r=sc.nextFloat();
        area=3.14f*r*r;
        System.out.println("Area of Circle: "+area);
        sc.close();
    }
}

