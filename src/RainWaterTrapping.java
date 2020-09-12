public class RainWaterTrapping {

        public int trap(int[] height) {

            int[] maxArrayRight=new int[height.length];
            int[] maxArrayLeft=new int[height.length];
            int[] waterStored=new int[height.length];
            int maxWater=0;
            int size=height.length-1;
            if(size<=0){
                return 0;
            }
            maxArrayRight[size]=height[size];
            maxArrayLeft[0]=height[0];
            for(int i=size-1;i>=0;i--){
                if(  height[i]>maxArrayRight[i+1]){
                    maxArrayRight[i]=height[i];
                }else
                {
                    maxArrayRight[i]=maxArrayRight[i+1];
                }
            }
            for(int i=1;i<=size;i++){
                if(height[i]>maxArrayLeft[i-1]){
                    maxArrayLeft[i]=height[i];
                }else
                {
                    maxArrayLeft[i]=maxArrayLeft[i-1];
                }
            }
            for(int k=0;k<=size;k++) {
                waterStored[k]=Math.min(maxArrayRight[k],maxArrayLeft[k])-height[k];
            }
            for(int i=0;i<=size;i++){
                maxWater=maxWater+waterStored[i];
            }
            return maxWater;
        }

}
