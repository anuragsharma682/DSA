import java.util.Scanner;
public class ArraysC {
    public static void main(String[] args){
        int mark[]=new int[100];
        Scanner sc=new Scanner(System.in);
        //int size=mark.length;
        //System.out.println(size);
        mark[0]=sc.nextInt();
        mark[1]=sc.nextInt();
        mark[2]=sc.nextInt();
         sc.close();
        System.out.println("maths marks :"+mark[0]);
        System.out.println("chemistry marks :"+mark[1]);
        System.out.println("physics marks :"+mark[2]);
        int percentage=(mark[0]+mark[1]+mark[2])/3;
        System.out.println("percentage="+percentage + "%");
    }
}
