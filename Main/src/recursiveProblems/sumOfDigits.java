package recursiveProblems;

public class sumOfDigits {
    public static void main(String[] args){
        int result = sum(11111);
        System.out.println(" Sum is " + result);
    }
    public static int sum(int n){
        if(n==0){
            return 0;
        }
        else{
            return sum(n/10) + n%10;
        }
    }
}
