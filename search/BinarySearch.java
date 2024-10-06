public class BinarySearch {
    public static int SearchNums(int nums[],int key){
        int start=0, end=nums.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            // Comparisons
            if(nums[mid]==key){
                return mid; //found
            }
            if(nums[mid]<key){
                start=mid+1; // left
            }
            else{
                end=mid-1;// right
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int nums[]={2,4,6,8,10,12,14};
        int key=10;
        System.out.println("index of key is: "+ SearchNums(nums, key));
    }
}
