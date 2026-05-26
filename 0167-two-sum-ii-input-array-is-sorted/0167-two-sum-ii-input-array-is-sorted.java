import java.util.*;
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int l=0, r=numbers.length-1;
        ArrayList<Integer> arr=new ArrayList<>();
        int [] res=new int [2];
        while(l<r){
            int sum=numbers[l]+numbers[r];
            if(sum==target){
                arr.add(l+1);
                arr.add(r+1);
                res[0]=arr.get(0);
                res[1]=arr.get(1);
                return res;
            } else if(sum<target){
                l++;
            } else{
                r--;
            }
        }
        return res;
    }
}