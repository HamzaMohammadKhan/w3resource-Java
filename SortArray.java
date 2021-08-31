import java.lang.reflect.Array;
import java.util.Arrays;

public class SortArray {
    public static void main(String[] args){
        String[] arr = {"a","e","b","d","c"};
        int[] arr1 = {1,3,5,6,2,4};
        System.out.println("The string array is : " + Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("The sorted array is : " + Arrays.toString(arr));

        int x;
        int temp=0;
        for(x=0; x < arr1.length; ++x){
            for(int y=0; y < arr1.length-1; ++y) {
                if (arr1[y] > arr1[y+1]) {
                    temp = arr1[y];
                    arr1[y] = arr1[y+1];
                    arr1[y+1] = temp;
                }
            }
            System.out.println(" sorted " + arr1[x]);
        }
    }
}
