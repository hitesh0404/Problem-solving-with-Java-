
import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        // int[] a = {1,2,3,4,5};
        // int[] b = new int[a.length];
        char[] a = "RACECAR".toCharArray();
        char[] b = new  char[a.length];
        for(int i = 0; i < a.length; i++) {
            b[i] = a[a.length-i-1];
        }
        // System.out.println(Arrays.toString(b)+" "+Arrays.toString(a));
            // int num = (int) a.length/2;
       
        // for (int i = 0; i < num ; i++) {
        //     int temp = a[i];
        //     a[i] = a[a.length-i-1];
        //     a[a.length-i-1] = temp;
        // }
        // System.out.println(Arrays.toString(a));




    }
}
