import javafx.util.Pair;

import java.util.Stack;

class StockSpanner {
    Stack<Pair<Integer,Integer>> stack=new Stack<Pair<Integer,Integer>>();
    int index=0;
    public StockSpanner() {

    }

    public int next(int price) {
        int count=1;
        if(stack.empty()){
            stack.push(new Pair<Integer,Integer>(price,index));
            index++;
            return count;
        }else{
            while(!stack.empty() && stack.peek().getKey()<=price){
                stack.pop();
                count++;
            }
            if(!stack.empty()){


                count =index-stack.peek().getValue();
            }else{
                count =(index+1)-0;
            }
            stack.push(new Pair<Integer,Integer>(price,index));
            index++;
        }
        return count;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */