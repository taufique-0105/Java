package recursiveProblems;

public class triangle {
    public static void main(String[] args) {
        pattern(5,0);
    }
    public static void pattern(int r, int c){
        if(r==0){
            return;
        }
        else if(r>c){
            System.out.print("*");
            pattern(r,++c);
        }
        else{
            System.out.println();
            pattern(r-1,0);
        }
    }
}
