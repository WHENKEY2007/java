import java.util.Arrays;
class Arraysclass{
    public static void main(String args[]){
        int arr1[]={5,4,3,2,1};
        Arrays.sort(arr1,0,5);
        System.out.println(Arrays.toString(arr1));

        Arrays.fill(arr1,10);
        System.out.println(Arrays.toString(arr1));

        int arr2[]=Arrays.copyOf(arr1,4);
        
        
        int arr3[]={1,2,3,4,5,6};
        System.out.println(Arrays.equals(arr1,arr2));

        int index=Arrays.binarySearch(arr3,4);
        System.out.println("Index of 4 is: "+index);
    }
}