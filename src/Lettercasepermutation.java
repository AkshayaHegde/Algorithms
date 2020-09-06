import java.util.ArrayList;
import java.util.List;

public class Lettercasepermutation {


        List<String> finalList=new ArrayList<String>();
        public List<String> letterCasePermutation(String S) {
            String op="";
            solve(S,op);
            return finalList;
        }

        public  void solve(String ip,String op){
            if(ip.length()==0){
                //System.out.println(op);
                finalList.add(op);
                return;
            }
            String op1=op;
            String op2=op;
            //String op3=op;
            if(Character.isDigit(ip.charAt(0))){
                op1=op1+ip.charAt(0);
                op2=op2+ip.charAt(0);
                ip=ip.substring(1);
                solve(ip,op1);
            }else{
                op1=op1+Character.toLowerCase(ip.charAt(0));
                op2=op2+Character.toUpperCase(ip.charAt(0));
                //op3=op3+Character.toLowerCase(ip.charAt(0));
                ip=ip.substring(1);
                solve(ip,op1);
                solve(ip,op2);
                // solve(ip,op3);
            }
            return;
        }


}
