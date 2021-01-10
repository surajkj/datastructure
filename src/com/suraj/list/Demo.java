package com.suraj.list;

public class Demo {

    public static void main(String[] args) {
        Demo demo = new Demo();
        try {
            demo.basicOperations();
            demo.arithmetic();
            demo.linearSearch();
            demo.binarySearch();

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

        System.out.println("Element at position 2 is "+ list.getElement(2));

        System.out.println("Replace value at an index");
        list.setElement(2, 7);
        list.display();
    }

    public void arithmetic() throws Exception {
        List list = new List();
        list.add(4);
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);

        int sum = list.sum();
        int avg = list.avg();
        int min = list.min();
        int max = list.max();

        System.out.println("Sum "+sum + "\nAverage "+ avg + "\nMin "+ min+"\nMax "+ max);
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
        binarySearch.add(3);
        binarySearch.add(5);
        binarySearch.add(8);
        binarySearch.add(11);
        binarySearch.add(14);
        binarySearch.add(17);
        binarySearch.add(19);
        binarySearch.add(20);
        binarySearch.add(22);
        binarySearch.add(25);
        binarySearch.add(32);
        binarySearch.add(35);

        System.out.println("\nPerforming binary search\n");
        System.out.println("Index of 20 is "+ binarySearch.search(20));
        System.out.println("Index of 30 is "+ binarySearch.search(30));
    }
}
