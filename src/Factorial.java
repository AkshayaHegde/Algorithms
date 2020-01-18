import java.util.Scanner;

public class Factorial {
    public int fact(int n){
        if(n<=0){
            return 1;
        }
        return n*fact(n-1);
    }
    public static void main(String[] args) {
        int n=0;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter number for which factorial need be found:");
        n=scanner.nextInt();
        Factorial factorial=new Factorial();
        int factr=factorial.fact(n);
        System.out.println("factorial of "+n+" is:"+factr);

    }
}
