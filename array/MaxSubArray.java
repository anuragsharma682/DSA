public class MaxSubArray {
    // public static void maxSubArrays(int nums[]){
    //     int currSum=0;
    //     int maxSum=Integer.MIN_VALUE;
    //     int prefix[]=new int[nums.length];
    //     prefix[0]=nums[0];

    //     //calculate prefix array
    //     for(int i=1;i<prefix.length;i++){
    //         prefix[i]=prefix[i-1]+nums[i];
    //     }
    //     for(int i=0;i<nums.length;i++){
    //         int start=i;
    //         for(int j=i;j<nums.length;j++){
    //             int end=j;
    //             currSum= start==0?prefix[end]:prefix[end]-prefix[start-1];
    //             if(maxSum<currSum){
    //                 maxSum=currSum;
    //             }
    //         }
    //     }
    //     System.out.println("max sum : "+maxSum);
    // }

    // by kadanes algorithm

    public static void kadanes(int nums[]){
        int ms=Integer.MIN_VALUE;
        int cs=0;
        for(int i=0;i<nums.length;i++){
            cs=cs+nums[i];
            if(cs<nums[i]){
                cs=0;
            }
            ms=Math.max(cs,ms);
        }
        System.out.println("max sub array sum is : "+ms);
    }
    public static void main(String[] args){
        int nums[]={-2,-3,4,-1,-2,1,5,-3};
        kadanes(nums);
    }
    
}