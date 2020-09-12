public class SingleElementInSortedArray {



        public int singleNonDuplicate(int[] nums) {
            int left=0;
            int right=nums.length-1;
            if(right==0){
                return nums[right];
            }
            while(left<right){
                int mid=(left+right)/2;
                if(mid==0){
                    return nums[mid];
                }
                if(nums[mid] !=nums[mid-1] && nums[mid]!=nums[mid+1]){
                    return nums[mid];
                }else if(nums[mid-1]==nums[mid] && (mid-1)%2!=0){
                    right=mid-1;
                }else if(nums[mid+1]==nums[mid] && (mid+1)%2!=0){
                    left=mid+1;
                }else if(nums[mid+1]!=nums[mid] ){
                    left=mid+1;
                }else if(nums[mid-1]!=nums[mid] ){
                    right=mid-1;
                }
            }
            return nums[left];
        }

}
