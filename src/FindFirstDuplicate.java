public class FindFirstDuplicate {
    public int findDuplicate(int[] nums) {
        int n=nums.length-1;
        for(int i=0;i<=n;i++){
            int index=nums[i];
            while(nums[i]!=nums[index-1]  ){
                int temp=nums[i];
                nums[i]=nums[index-1];
                nums[index-1]=temp;
                index=nums[i];
            }
        }
        for(int i=0;i<=n;i++){
            if(nums[i]!=i+1){
                return nums[i];
            }
        }
        return n+1;
    }
}
