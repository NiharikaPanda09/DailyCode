import java.util.*;
public class IntersectionII {
    public static void main(String[] args) {
              int[] arr1 = {1,2,2,1};
              int[] arr2 = {2,2};
        System.out.println(Arrays.toString(intersect(arr1, arr2)));
    }
    public static int[] intersect(int[] nums1, int[] nums2) {
            if(nums1.length > nums2.length){
                return intersect(nums2,nums1);
            }
            HashMap<Integer,Integer> map = new HashMap<>();
            for(int num:nums1){
              map.put(num, map.getOrDefault(num,0)+1);
            }
            List<Integer> result = new ArrayList<>();
            for(int num:nums2){
                if(map.containsKey(num) && map.get(num) >0){
                    result.add(num);
                    map.put(num, map.get(num)-1);

                }
            }
            int[] intersection = new int[result.size()];
            for(int i=0;i<result.size();i++){
                intersection[i] = result.get(i);
            }
            return intersection;
    }
}
