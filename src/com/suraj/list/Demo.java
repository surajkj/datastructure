package com.suraj.list;

public class Demo {

    public static void main(String[] args) {
        try {
            List list = new List();
            System.out.println("Size of array "+ list.getSize());
            list.display();
            list.add(1);
            list.add(2);
            list.add(4);
            list.add(5);

            System.out.println("Size of array "+ list.getSize());
            list.display();

            System.out.println("\nInserting element at given position \n");
            list.insert(0, 0);
            list.insert(3, 3);
            list.display();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
