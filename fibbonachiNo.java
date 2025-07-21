package Com.Recursion;

public class fibbonachiNo {
    public static void main(String[] args){
    int ans = fibbo(7);
    System.out.println(ans);
    }
    static int fibbo(int a){
        if(a<2){
            return a;
        }
        return fibbo(a-1) + fibbo(a-2);

    }
}
