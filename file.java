public class Pract_7_1 {
    public static int withRecursion(int n){
        if (n == 0) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return 1;
        }
        return withRecursion(n - 2) + withRecursion(n - 1);
    }
    public static long noRecursion(int n){

        long[] arr = new long[n+1];
        arr[0] = 0;
        arr[1] = 1;
        for(int i = 2; i <= n; i++){
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        return arr[n];

    }
    public static void main(String[] args) {
        int number = 100;

        long startTime = System.nanoTime();
        withRecursion(26);
        long stopTime = System.nanoTime();
        long m1 = stopTime - startTime;



        System.out.print(number + "`s Fibonacci number: " );

        if(m1 / 1000.0 > 10) {
            System.out.print(noRecursion(number) + " ");
        }
        else{
            System.out.print(withRecursion(number) + " ");
        }
    }
}
