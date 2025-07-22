package Com.Recursion.Array;

public class Find {
    public static void main(String[] args){
        int[] arr = {1,2,3,8,4,7,9};
        System.out.println(Findlast(arr,8,arr.length-1));
        System.out.println(find(arr,8,0));
        System.out.println(FindInt(arr,8,0));
    }
    static boolean find(int[] arr,int target,int index){
        if(index==arr.length){
            return false;
        }
        return arr[index]== target || find(arr,target,index+1);
    }

    static int FindInt(int[] arr,int target,int index){
        if(index==arr.length){
            return -1;
        }
        if(arr[index]==target){
            return index;
        }else{
            return FindInt(arr,target,index+1);
        }
    }

    static int Findlast(int[] arr,int target,int index){
        if(index==-1){
            return -1;
        }
        if(arr[index]==target){
            return index;
        }else{
            return Findlast(arr,target,index-1);
        }
    }

}
