import java.util.*;
public class GrumpyCustomer {
    public static void main(String[] args) {
        int[] customers = {1, 0, 1, 2, 1, 1, 7, 5};
        int[] grumpy = {0, 1, 0, 1, 0, 1, 0, 1};
        int minutes = 3;
        System.out.println(maxSatisfied(customers,grumpy,minutes));
    }
    public static int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
           int left = 0;
           int max_window = 0;
           int window =0;
           int satisfied = 0;
           for(int right=0;right<customers.length;right++){
               if(grumpy[right] ==  1){
                   window += customers[right];
               }else{
                          satisfied += customers[right];
               }
               if (right-left+1 > minutes){
                   if(grumpy[left] == 1) {
                       window -= customers[left];

                   }
                   left += 1;
               }
               max_window = Math.max(window,max_window);

           }
           return satisfied + max_window;

    }
}
