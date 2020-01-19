import org.omg.PortableInterceptor.INACTIVE;

import java.util.HashMap;
import java.util.Scanner;

public class FibonacciMemorization {
    HashMap<Integer, Integer> integerIntegerHashMap=new HashMap<Integer, Integer>();
    public int fib(int n){
        int value=0;
        if(integerIntegerHashMap.get(n)!=null){
            return integerIntegerHashMap.get(n);
        }else if(n==0 ){
            return 0;
        }else if(n==1){
            return 1;
        }else {
            value = fib(n - 1) + fib(n - 2);
            integerIntegerHashMap.put(n, value);
            return value;
        }

    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number for which fibonacci to be found");
        int n=scanner.nextInt();
        FibonacciMemorization fibonacciMemorization=new FibonacciMemorization();
        int value=fibonacciMemorization.fib(n);
        System.out.println(value);


    }
}
