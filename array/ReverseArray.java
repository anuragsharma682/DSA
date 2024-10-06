public class ReverseArray {
    public static void reverse(int nums[]){
        int first=0, last=nums.length-1;
        // swaping
        while(first<last){
            int temp=nums[last];
            nums[last]=nums[first];
            nums[first]=temp;
            first++;
            last--;
        }
    }
    public static void main(String[]  args){
        int nums[]={2,4,6,8,10};
        reverse(nums);
        for(int i=0;i<nums.length;i++){ //print arrays
            System.out.print(nums[i]+" ");
        }
    }
}
