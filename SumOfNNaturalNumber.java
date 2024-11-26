public class SumOfNNaturalNumber {
    public static void main(String[] args) {
        int num = 8;
        int sum = 0;
        // while(num>0){
        //     sum += num;
        //     num--;
        // }
        for(int i = 0; i<=num; i++){
            sum += i;
        }
        System.out.println(sum);


    }
}
