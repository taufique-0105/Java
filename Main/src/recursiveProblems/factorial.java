package recursiveProblems;

public class factorial {
    public static void main(String[] args) {
        int result = fact(8);
        System.out.println(" Factorial is " + result);
    }
    public static int fact(int n){
        if(n==1){
            return 1;
        }
        else {
            return n*fact(n-1);
        }
    }
}
