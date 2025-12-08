import java.util.Arrays;

public class arrclass{
    public static void main(String[] args) {
        int arr[] = {18, 9, 27, 63, 81, 54};
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr, 0, 5);
        // System.out.println(arr);
        Arrays.fill(arr, 7);
        int arr1[] = Arrays.copyOf(arr, 10); 
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr1));

        System.out.println(Arrays.binarySearch(arr1, 2));

        System.out.println(Arrays.equals(arr1, arr));
                                                                                
    }
}