import java.util.HashMap;
import java.util.Stack;

public class NextGreaterElement {


        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        int[] finalarray;
        public int[] nextGreaterElement(int[] nums1, int[] nums2) {
            finalarray=new int[nums1.length];

            Stack<Integer> stack=new Stack<Integer>();
            for(int i=nums2.length-1;i>=0;i--){
                while(!stack.empty() && stack.peek()<=nums2[i]){
                    stack.pop();
                }
                if(stack.empty()){
                    map.put(nums2[i],-1);
                }else{
                    map.put(nums2[i],stack.peek());
                }
                stack.push(nums2[i]);
            }
            for(int j=0;j<nums1.length;j++){

                finalarray[j]= map.get(nums1[j]);

            }
            return finalarray;
        }

}
