package com.Akbar;

public class main {
    public static void main(String[] args) {
        linkedList list = new linkedList();
        list.insertFirst(3);
        list.insertFirst(5);
        list.insertFirst(7);
        list.insertFirst(8);
        list.insertFirst(6);
        list.insertLast(99  );
        list.insert(9,4);
//        System.out.println(list.deleteFirst());
//        System.out.println(list.deleteLast());

        list.display();
        System.out.println(list.find(7));

    }
}
