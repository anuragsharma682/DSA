public class update {
    public static void Update(int marks[]){
        for(int i=0;i<marks.length;i++){
            marks[i]=marks[i]+1;
        }
    }
    public static void main(String[] args){
        int marks[]={97,95,86};
        Update(marks);
        //print our marks
        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i] +" ");
        }
    }
}
