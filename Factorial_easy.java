package Com.Recursion;

public class Factorial_easy {
    public static void main(String[] args){
//        int ans = fun(5);
        int ans = funsum(5);
        System.out.println(ans);
    }
    static int fun(int n){
        if(n<=1){
            return 1;
        }
        return n*fun(n-1);
    }

    static int funsum(int n){
        if(n<=1){
            return 1;
        }
        return n+funsum(n-1);
    }
}
