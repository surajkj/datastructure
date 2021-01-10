package com.suraj.list;

public class Demo {

    public static void main(String[] args) {
        Demo demo = new Demo();
        try {
            demo.basicOperations();
            demo.linearSearch();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    private void basicOperations() throws Exception {
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

        System.out.println("\nDelete an element from given position\n");
        list.delete(6);
        list.delete(0);
        list.display();
        System.out.println("Size of array "+ list.getSize());
    }

    private void linearSearch(){
        LinearSearch linearSearch = new LinearSearch();
        linearSearch.add(5);
        linearSearch.add(8);
        linearSearch.add(3);
        linearSearch.add(6);
        linearSearch.add(2);
        linearSearch.add(7);
        linearSearch.add(9);
        System.out.println("\nPerforming linear search\n");
        System.out.println("Index of 7 is "+linearSearch.search(7));
        System.out.println("Index of 4 is "+linearSearch.search(4));
    }

    private void binarySearch(){
        BinarySearch binarySearch = new BinarySearch();
    }
}
