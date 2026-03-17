import java.util.*;
public class twoSum {
    public static void main(String[] args) {
        int n = (int) (Math.random() * 10) + 1;
        int arr[] = new int[n];
        int target = (int) (Math.random() * 10) + 1;
        System.out.println("Target: " + target);
        for (int i = 0; i < n; i++) {
            arr[i] = (int) (Math.random() * 10) + 1;
        }
        System.out.println("Array: ");
        for(int i:arr){
            System.out.print(i+" ");
        }
        int[] res = ts(arr,target);
        System.out.println("\nResult: " + res[0]+" "+res[1]);
    }
    public static int[] ts(int[] arr,int target){
        HashMap<Integer,Integer> m = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int d = target - arr[i];
            if(m.containsKey(d)){
                return new int[]{m.get(d),i};
            }
            m.put(arr[i],i);
        }
        return new int[]{-1,-1};
    }
}
