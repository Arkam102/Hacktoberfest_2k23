import java.util.Arrays;

public class Bubsort{
    public static void main(String[] args) {
        int [] arr={23,4,12,5,6,3,7};
        bubsort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubsort(int[] arr){
        boolean swapped;
        for(int i=0; i<arr.length; i++){
            swapped = false;
            for(int j=1; j<arr.length-i; j++){
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
             if(!swapped) {
            break;
        }
        }
    }
}