public class Stringbuilder {
    public static void main(String args[]){
        StringBuilder sb=new StringBuilder("Java");
        //capacity tells you how many elements it can hold
        System.out.println("Intial Capacity "+sb.capacity());
        System.out.println("String"+sb);    
        System.out.println("Lenght "+sb.length());
        System.out.println("New Capacity "+sb.capacity());
    }
}
