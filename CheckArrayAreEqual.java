public class CheckArrayAreEqual {
    public static void main(String[] args) {
        int[] a = {1,2,13};
        int[] b = {2,1,3};
        boolean result = true;
        if(a.length != b.length)
            System.out.println(false);
        else{
            for (int i = 0; i < a.length; i++) {
                boolean found = false;
                for(int j=0;j <b.length; j++){
                    if(a[i]==b[j]){
                        found=true;
                        break;
                    }
                }
                if(!found){
                        System.out.println(a[i]+"here");
                        result = false;
                }
            }
            System.out.println(result);
        }
    }
}