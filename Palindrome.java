import java.util.Arrays;
public class Palindrome {
    public static void main(String[] args) {
        char[] a = "RACECAR".toCharArray();
        char[] b = new  char[a.length];
        for(int i = 0; i < a.length; i++) {
            b[i] = a[a.length-i-1];
        }
        if(Arrays.equals(a, b)){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not a palindrome");
        }
        //Second way to find without using second variable
        int num = (int) a.length/2;
        boolean result = true; 
        for (int i = 0; i < num ; i++) {
          if(a[i] != a[a.length-i-1]){
                 result = false;break;
        }}
        if(result)
            System.out.println("Palindrome");
        else
            System.out.println("Not a Palindrome");


    
    }
}
