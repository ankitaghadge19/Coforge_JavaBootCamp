import java.util.*;

public class IterateCollection {
    public static void main(String[] args){
        List<String> list = new ArrayList<>();

        list.add("A");
        list.add("B");
        list.add("C");

        for(String str : list){
            System.out.print(str + " ");
        }

        System.out.println();

        Iterator<String> itr = list.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next() + " ");
        }
    }
}