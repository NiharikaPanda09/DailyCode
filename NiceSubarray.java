import java.util.*;
public class NiceSubarray {
    public static void main(String[] args) {
                int [] nums = {1,1,2,1,1};
                int k = 3;
        System.out.println(atmost(nums,k));
    }
    public static int atmost (int[] nums, int k) {
        int [] cnt = new int[nums.length+1];
        int ans =0;
        int t=0;
        cnt[0] =1;
        for(int v:nums){
            t += v&1;
            if(t-k >= 0){
                ans += cnt[t-k];

            }
            cnt[t]++;
        }
        return ans;
    }
}
