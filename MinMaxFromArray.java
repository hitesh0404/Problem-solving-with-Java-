public class MinMaxFromArray {
    public static void main(String[] args) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int[] a ={1,2,5,0};
        for (int i = 0; i < a.length; i++) {
            if(a[i]<min)
                min=a[i];
            if(a[i]>max)
                max=a[i];
        }
        System.out.println(min+ " " +max);
    }
}
