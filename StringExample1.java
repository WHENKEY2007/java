public class StringExample1{
    public static void main(String args[]){
        String str1="Java";  //it stores in a string constant pool
        String str2="Java";   
        //by using new it creates 2 objeccts one is stores in scp and another is stored in heap memory
        String str3=new String("Java");  
        //==->check the instance or address
        //equals()->chech the values

        System.out.println(str1==str2); //true
        System.out.println(str1==str3); //false
        System.out.println(str1.equals(str2)); //true
        System.out.println(str1.equals(str3)); //true
    }
}

