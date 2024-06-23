import java.util.*;
public class CountGoodNumbers {
    private static long MOD = 1000_000_007;
    public static void main(String[] args) {
            int n = 1;
        System.out.println(countGoodNumbers(n));

    }
    public static int countGoodNumbers(long n) {
                long even = (n+1)/2;
                long odd = n/2;
                long first = pow(5,even)%MOD;
                long second = pow(4,odd)%MOD;
                return (int)((first*second)%MOD);
    }
    private static long pow(long x,long n){

        if(n==0){
            return 1;
        }
        long temp = pow(x,n/2);
        if (n % 2 == 0) {

            return (temp*temp)%MOD;
        }else{
            return (x*temp*temp)%MOD;
        }
    }
}
