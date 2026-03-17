import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public static void main(String a[]){
        int n = (int)(Math.random()*10)+1;
        System.out.println("The N is => "+n);
        int [] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] =  (int)(Math.random()*10)+1;
        }
        System.out.print("The Array is => ");
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
        boolean res = CheckDuplicate(arr);
        System.out.println("The Result => "+res);
    }
    public static boolean CheckDuplicate(int[] arr){
        Set<Integer> s = new HashSet<>();
        for(int i:arr){
            if(s.contains(i)){
                return true;
            }
            s.add(i);
        }
        return false;
    }
}
