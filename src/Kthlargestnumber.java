import java.util.Collections;
import java.util.Iterator;
import java.util.PriorityQueue;

public class Kthlargestnumber {


        public int findKthLargest(int[] nums, int k) {
            PriorityQueue<Integer> maxHeap=new PriorityQueue<Integer>(Collections.reverseOrder());
            for(int num :nums){
                maxHeap.add(num);
            }
            while(k>1){
                maxHeap.poll();
                k--;
            }
            Iterator itr = maxHeap.iterator();
            if(itr.hasNext()){
                return (int)itr.next();
            }else{
                return 0;
            }
        }

}
