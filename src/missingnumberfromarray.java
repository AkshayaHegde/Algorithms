public class missingnumberfromarray {

        public int missingNumber(int[] nums) {
            int n=nums.length-1;
            for(int i=0;i<=n;i++){
                int index=nums[i];
                while((index<=n) && nums[i]!=nums[index] ){
                    int temp=nums[i];
                    nums[i]=nums[index];
                    nums[index]=temp;
                    index=nums[i];
                }
            }
            for(int i=0;i<=n;i++){
                if(nums[i]!=i){
                    return i;
                }
            }
            return n+1;
        }
    
}
