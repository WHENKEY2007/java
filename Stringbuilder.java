public class Stringbuilder {
    public static void main(String args[]){
        StringBuilder sb=new StringBuilder();
        //capacity tells you how many elements it can hold
        System.out.println("Intial Capacity "+sb.capacity());
        sb.append("abcdefgh");
        System.out.println("Lenght "+sb.length());
        System.out.println("New Capacity "+sb.capacity());
    }
}
