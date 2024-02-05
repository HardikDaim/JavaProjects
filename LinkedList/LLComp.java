package LinkedList;

import java.util.LinkedList;

public class LLComp {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("this");
        list.add("is");
        list.add("a");
        System.out.println(list);
        for(int i=0; i<list.size(); i++) {
            System.out.print(list.get(i) + "->");
        }
        System.out.println("NULL");
    }
}
