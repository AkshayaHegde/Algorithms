public class kthmissingnumber {

        public int findKthPositive(int[] arr, int k) {
            int missingCount=0;
            int count=1;
            for(int i=0;i<=arr.length-1;i++){
                while(arr[i]!=count) {
                    count++;
                    missingCount++;
                    if(missingCount==k){
                        return count-1;
                    }

                }
                count++;
            }

            count= (count-1)+(k-missingCount);

            return count;
        }

}
