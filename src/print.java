public class print {
    public static void printToN(int n){
        if(n==0){
            return;
        }else{
            printToN(n-1);
            System.out.println(n);
        }
    }
    public static void main(String[] args) {
        printToN(10);
    }
}
