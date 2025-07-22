package Com.Recursion.Array;

import java.util.ArrayList;

public class Find {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 8, 8, 4, 7, 9};
//        System.out.println(Findlast(arr, 8, arr.length - 1));
//        System.out.println(find(arr, 8, 0));
//        System.out.println(FindInt(arr, 8, 0));
//        FindAllIndex(arr, 8, 0);
//        System.out.println(list);
        // System.out.println(FindallIndex(arr,8,0,new ArrayList<>()));  //method 1
//        ArrayList<Integer> ans = FindallIndex(arr,8,0,new ArrayList<>());  // method 2
//        System.out.println(ans);

        System.out.println(FindAllindex(arr, 8, 0));
    }

    static boolean find(int[] arr, int target, int index) {
        if (index == arr.length) {
            return false;
        }
        return arr[index] == target || find(arr, target, index + 1);
    }

    static int FindInt(int[] arr, int target, int index) {
        if (index == arr.length) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        } else {
            return FindInt(arr, target, index + 1);
        }
    }

    static int Findlast(int[] arr, int target, int index) {
        if (index == -1) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        } else {
            return Findlast(arr, target, index - 1);
        }
    }

    static ArrayList<Integer> list = new ArrayList<>();

    static void FindAllIndex(int[] arr, int target, int index) {
        if (index == arr.length) {
            return;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        FindAllIndex(arr, target, index + 1);
    }

    static ArrayList<Integer> FindallIndex(int[] arr, int target, int index, ArrayList<Integer> list) {
        if (index == arr.length) {
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        return FindallIndex(arr, target, index + 1, list);
    }

    static ArrayList<Integer> FindAllindex(int[] arr, int target, int index) {
        ArrayList<Integer> list = new ArrayList<>();
        if (index == arr.length) {
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        ArrayList<Integer> ansFromBelowCall = FindAllindex(arr,target,index+1);
        list.addAll(ansFromBelowCall);
        return list;
    }

}
