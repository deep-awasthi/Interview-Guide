import java.util.* ;
import java.io.*; 
public class CountInversions {
    public static long getInversions(long arr[], int n) {
        // Write your code here.
        return mergeSort(arr, 0, arr.length-1);
    }

    private static long mergeSort(long[] arr, int s, int e){
        long ans = 0;

        if(s>=e){
            return ans;
        }

        int mid = s + (e-s)/2;

        ans = ans + mergeSort(arr, s, mid);
        ans = ans + mergeSort(arr, mid+1, e);
        ans = ans + merge(arr, s, mid, e);
        return ans;
    }

    private static long merge(long[] arr, int s, int mid, int e){
        long ans = 0;

        List<Long> res = new ArrayList<>();

        int left = s;
        int right = mid + 1;

        while(left<=mid && right<=e){
            if(arr[left]>arr[right]){
                ans = ans + mid+1 - left;
                res.add(arr[right]);
                right++;
            }
            else{
                res.add(arr[left]);
                left++;
            }
        }

        while(left<=mid){
            res.add(arr[left]);
            left++;
        }

        while(right<=e){
            res.add(arr[right]);
            right++;
        }

        for(int i = s; i<=e; i++){
            arr[i] = res.get(i-s);
        }

        return ans;
    }
}
