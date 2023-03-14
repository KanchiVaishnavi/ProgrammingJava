import java.util.*;
class Show{
    public <S,T> void display(S[] elements1, T[] elements2){
        for(S element:elements1)
            System.out.println(element);
        for(T element:elements2)
            System.out.println(element);
        System.out.println();
    }
}
public class aq52{
    public static void main(String[] args){
        Integer[] arr1 = { 10,20,30,40,50 };
        String[] arr2 = {"IIT", "Madras", "Java", "Programming"};
        Show obj1 = new Show();
        Show obj2 = new Show();
        obj1.display(arr1,arr2);
        obj2.display(arr2,arr1);
        System.out.println();
    }
    
}