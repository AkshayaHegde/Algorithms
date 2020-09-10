import java.util.Stack;

public class NextGreaterNode {
    int count=-1;
    Stack<ListNode> reverseStack=new Stack<ListNode>();
    Stack<Integer> stack=new Stack<Integer>();
    int[] finalarray;
    public int[] nextLargerNodes(ListNode head) {
        while(head!=null){
            reverseStack.push(new ListNode(head.val,head.next));
            head=head.next;
            count++;
        }
        finalarray=new int[count+1];
        while(!reverseStack.empty()){
            int num=reverseStack.pop().val;
            while(!stack.empty() && stack.peek()<=num){
                stack.pop();
            }
            if(stack.empty()){
                finalarray[count]=0;
                count--;
            }else{
                finalarray[count]=stack.peek();
                count--;
            }
            stack.push(num);
        }
        return finalarray;
    }
    public class ListNode {
     int val;
     ListNode next;
     ListNode() {}
    ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
}
