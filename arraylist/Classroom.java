import java.util.ArrayList;
public class Classroom {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
       // ArrayList<String> list2=new ArrayList<>();
        //ArrayList<Float> list3=new ArrayList<>();

        // add operation
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);

        // get operation
        int element=list.get(3);
        System.out.println(element);

        // delete operation
        list.remove(2);
        System.out.println(list);

        //set operation 
        list.set(2, 10);
        System.out.println(list);

        // contains operation
        System.out.println(list.contains(1));
        System.out.println(list.contains(11));

    }
}
