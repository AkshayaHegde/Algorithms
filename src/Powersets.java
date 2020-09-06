import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Powersets {


        public  List<List<Integer>> finalList=new ArrayList<List<Integer>>();
        public List<List<Integer>> subsets(int[] nums) {
            List<Integer> outputList=new ArrayList<>();
            List<Integer> ip= IntStream.of(nums).boxed().collect(Collectors.toCollection(ArrayList::new));
            solve(ip,outputList);
            return finalList;
        }
        public void solve(List inp,List outputList1){
            List ip=new ArrayList(inp);
            List outputList=new ArrayList(outputList1);
            if(ip.size()==0){
                System.out.println(outputList.size());
                finalList.add(outputList);
                return;
            }

            List<Integer> op1=new ArrayList<>(outputList);
            List<Integer> op2=new ArrayList<>(outputList);
            op2.add((int)ip.get(0));
            ip.remove(0);
            solve(ip,op1);
            // Integer input=(int)ip.get(0);

            solve(ip,op2);
            return;
        }

}
