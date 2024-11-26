import java.util.Arrays;
public class NestedArray {
    public static void main(String[] args) {
        int[][] a= new int[3][3];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if(i==j){
                    a[i][j] =1;
                }
                else{
                    a[i][j]=i;
                }
            }
        }
        for (int i = 0; i < a.length; i++) {   
            System.out.println(Arrays.toString(a[i]));
        }

        int[][] b = new  int[a[0].length][a.length];
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b.length; j++) {
                b[i][j]=a[j][i];
            }
        }
        for (int i = 0; i < b.length; i++) {   
            System.out.println(Arrays.toString(b[i]));
        }


    }
}
