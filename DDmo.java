package Com.Recursion.Subset;

public class DDmo {
    public static void main(String[] args) {
//     SSkip(" ","agdgwvwvwcwkw");
     System.out.println(sSSkip("wata"));
    }
    static void SSkip(String p ,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);

        if (ch == 'w') {
            SSkip(p,up.substring(1));
        }else{
            SSkip(p+ch,up.substring(1));
        }

    }

    static String sSSkip(String up){
        if(up.isEmpty()){
           return " ";
        }
        char ch = up.charAt(0);

        if (ch == 'w') {
           return sSSkip(up.substring(1));
        }else{
           return ch+sSSkip(up.substring(1));
        }

    }
}
