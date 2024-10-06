public class Largest {
    public static int getlargest(int numbers[]){
        int largest=Integer.MIN_VALUE;//-infinity
        int smallest=Integer.MAX_VALUE;
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]>largest){
                largest=numbers[i];
            }
            if(smallest>numbers[i]){
                smallest=numbers[i];
            }
        }
        System.out.println("smallest value:" + smallest);
        return largest;
    }
    public static void main(String[] args){
        int numbers[]={1,3,4,6,2};
        System.out.println("largest value:" + getlargest(numbers));
    }
}
