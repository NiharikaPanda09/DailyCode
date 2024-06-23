import java.util.*;
import java.util.ArrayList;
class Pair<K, V> {
    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}
public class MaxProfit {
    public static void main(String[] args) {
        int [] dif = {2,4,6,8,10};
        int [] profit = {10,20,30,40,50};
        int [] worker = {4,5,6,7};
        int res = maxProfitAssignment(dif,profit,worker);
        System.out.println(res);


    }
    public static int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
            int res =0,j=0,best =0;
        List<Pair<Integer, Integer>> temp = new ArrayList<>();
        for(int i=0;i<difficulty.length;++i){
            temp.add(new Pair<>(difficulty[i],profit[i]));
        }
        temp.sort((a,b)->a.getKey()-b.getKey());
        Arrays.sort(worker);
        for(int work:worker){
            while(j<temp.size() && work >= temp.get(j).getKey()){
                best = Math.max(best,temp.get(j++).getValue());
            }
            res += best;
        }
        return res;
    }
}
