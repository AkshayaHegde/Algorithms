import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicates {

        public List<Integer> findDuplicates(int[] nums) {
            List<Integer> finalList=new ArrayList<Integer>();
            int n=nums.length-1;
            for(int i=0;i<=n;i++){
                int index=nums[i];
                while((index<=n+1) && nums[i]!=nums[index-1] ){
                    int temp=nums[i];
                    nums[i]=nums[index-1];
                    nums[index-1]=temp;
                    index=nums[i];
                }
            }
            for(int i=0;i<=n;i++){
                if(nums[i]!=(i+1)){
                    finalList.add(nums[i]);
                }
            }
            return finalList;
        }

}
