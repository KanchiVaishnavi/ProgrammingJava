import java.util.*;
public class aq612{
    public static void main(String[] args){
        Queue<String> list1 = new LinkedList<String>();
        list1.add("IITM");
        list1.add("Java");
        list1.add("Programming");
        list1.poll();
        Queue<String> list2 = new LinkedList<String>();
        list2.add("IITM");
        list2.add("Java");
        list2.add("Programming");
        list2.peek();
        System.out.println("list 1 elements "+list1 );
        System.out.println("list 2 elements "+list2 );
    }
}