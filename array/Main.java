import java.util.*;
public class Main {
    static void longest(String s,int k){
        int n=s.length();
        int ans=-1;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<=n;j++){
                HashSet<Character> dist=new HashSet<Character>();
                for(int x=i;x<j;x++){
                    dist.add(s.charAt(x));
                }
                if(dist.size()==k){
                    ans=Math.max(ans,j-i);
                }
            }
        }
        System.out.println(ans);
    }
    public static void main(String[] args) {
        String s="aabacbebebe";
        int k=3;
        longest(s, k);
    }
}
