import java.util.Arrays;
public class ArraysExample4{
    public static void main(String[] args){
        int arr1[][]={{1,2,3},{4,5,6}};
        int arr2[][]={{1,2,3},{4,5,6}};
        //to convert 2d array to string
        System.out.println(Arrays.deepToString(arr1)); //true
        //to check 2d array equality
        System.out.println(Arrays.deepEquals(arr1,arr2)); //[[1, 2, 3], [4, 5, 6]]
    }
}