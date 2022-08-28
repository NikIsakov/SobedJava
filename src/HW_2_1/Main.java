package HW_2_1;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        ArrayList<Integer> Alist = new ArrayList<>();
        MyLinkedList myLinkedList = new MyLinkedList();

        System.out.println("myLinkedList");
        myLinkedList.add(1);
        myLinkedList.add(3);
        myLinkedList.printList();
        myLinkedList.delete(3);
        System.out.println("----------------");
        myLinkedList.printList();


//        Alist.add(1);
//        Alist.size();
//        Alist.clear();
//        Alist.remove(0);
//        Alist.get(0);

//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(1,4);
//        System.out.println(list);
    }
}
