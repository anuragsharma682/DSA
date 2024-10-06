public class MergeSort {
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void mergerSort(int arr[],int si,int ei){
        if(si>=ei){
            return;
        }
        int mid=si+(ei-si)/2;
        mergerSort(arr, si, mid);//left part
        mergerSort(arr, mid+1, ei);//right part
        merge(arr,si,mid,ei);
    }
    public static void merge(int arr[],int si,int mid,int ei){
        int temp[]=new int[ei-si+1];
        int i=si; //iteration for left part
        int j=mid+1;//iteration for right part
        int k=0;//iteration for temp arr
        while(i<=mid && j<=ei){
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                i++;
            }else{
                temp[k]=arr[j];
                j++;
            }
            k++;
        } 
        while(i<=mid){
            temp[k++]=arr[i++];//left part
        }
        while(j<=ei){
            temp[k++]=arr[j++];//rigth part
        }
        //copy temp to original array
        for(k=0,i=si;k<temp.length;k++,i++){
            arr[i]=temp[k];
        }
    }
    public static void main(String[] args){
        int arr[]={6,3,2,5,8,1};
        mergerSort(arr, 0,arr.length-1);
        System.out.println("the sorted array is:");
        printArr(arr);
    }
}
