package Com.Recursion;

public class EASY_1 {
    public static void main(String[] args){
       // fun(10);
        funboth(5);
    }
    static void fun(int n){
        if(n==0){
            return ;
        }
     //   fun(n-1);    1,2,3,4,5,6,7,8,9,10
        System.out.println(n);
        fun(n-1);     // 10,9,8,7,6,5,4,3,2,1
    }

    static void funboth(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        funboth(n-1);
        System.out.println(n);
    }
    static void funcon(int n){
        if(n==0){
            return ;
        }
        System.out.println(n);
        funcon(--n);
    }
}
