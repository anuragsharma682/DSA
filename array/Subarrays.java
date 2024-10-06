public class Subarrays {
    public static void printsubarrays(int nums[]){
        int ts=0;
        for(int i=0;i<nums.length;i++){
            int start=i;
            for(int j=i;j<nums.length;j++){
                int end=j;
                for(int k=start;k<=end;k++){
                    System.out.print(nums[k]+" ");
                }
                ts++;
                System.out.println(" ");
            }
            System.out.println(" ");
        }
        System.out.println("total SubArrays = " + ts);
    }
    public static void main(String[] args) {
        int nums[]={2,4,6,8,10};
        printsubarrays(nums);
    }
}
