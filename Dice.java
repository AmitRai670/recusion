package LeetCoad;

import java.util.ArrayList;

public class Dice {
    public static void main(String[] args) {
//        dice("",4);
//        diceface("",6,8);
//        System.out.println(diceArray("",4));
        System.out.println(diceFaceArr("",8,9));
    }
    static void dice(String p,int target){
        if(target==0){
            System.out.println(p);
            return;
        }
        for (int i = 1; i <6 && i<=target ; i++) {
            dice(p+i,target-i);
        }
    }

    static ArrayList<String> diceArray(String p,int target){
        if(target==0){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        for(int i= 1;i<=6 && i<=target;i++){
           list.addAll(diceArray(p+i,target-i));
        }
        return list;
    }
    static void diceface(String p,int target,int face){
        if(target==0){
            System.out.println(p);
            return;
        }
        for (int i = 1; i <face && i<=target ; i++) {
            diceface(p+i,target-i,face);
        }
    }
    static ArrayList<String> diceFaceArr(String p,int target,int face){
        if(target==0){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        for (int i = 1; i <face && i<=target ; i++) {
            list.addAll(diceFaceArr(p+i,target-i,face));
        }
        return list;
    }
}
