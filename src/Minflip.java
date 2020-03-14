/**
 * Created by a727240 on 3/14/2020.
 */
public class Minflip {
    public static void main(String[] args) {
        String target="10011101111";
        char[] targetchar=target.toCharArray();
        int strlen=target.length()-1;
        int count=0;
        StringBuilder stringBuilder=new StringBuilder();
        for(int k=0;k<=strlen;k++){
            stringBuilder.append('0');
        }
        String finalstr=stringBuilder.toString();
        char[] strchar= finalstr.toCharArray();
        String finalString=new String(strchar);
        // System.out.println(finalString);
        while(!target.equals(String.valueOf(strchar))){
            //System.out.println(String.valueOf(strchar));
            for(int i=0;i<=strlen;i++){
                if(targetchar[i]!=strchar[i]){
                    for(int j=i;j<=strlen;j++){
                        if(strchar[j]=='0')
                            strchar[j]='1';
                        else
                            strchar[j]='0';
                    }
                    count++;
                    break;
                }

            }

        }
        System.out.println(String.valueOf(strchar));
        System.out.println(count);
    }


}