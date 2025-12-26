class Addition{
    static int add(int a , int b){
        return (a+b);
    }
    static double add(double a , double b){
        return (a+b);
    }
    static double add(int a , double b){
        return (a+b);
    }
    static double add(int a , int b , double c){
        return (a+b+c);
    }
}
public class polymorphismAdd {
    public static void main(String args[]) {
        System.out.println(Addition.add(1,2));
        System.out.println(Addition.add(2222222,33333333));
        System.out.println(Addition.add(1,222222222));
        System.out.println(Addition.add(1,345578922,2.3));
    }
}