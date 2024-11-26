public class UniqueElement {
    public static void main(String[] args) {
        char [] a = "Hello WhEorld ".toCharArray();
        char result = '0';
        for (int i = 0; i < a.length; i++) {
            int count=0;
            for (int j = 0; j < a.length; j++) {
               if(((int)a[i] == (int)a[j]) || (((int)a[i])-32 == (int)a[j]) || ((int)a[i] == ((int)a[j])-32))
                count++;
            }
            if(count==1){
                result = a[i];
                break;
            }
        }

        System.out.println(result);
    }
}
