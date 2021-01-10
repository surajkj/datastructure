package com.suraj.list;

public class List {

    private int[] data;
    private int size = 0;
    private static int DEFAULT_CAPACITY = 10;

    /**
     * constructor initialize the newly created array with default capacity
     */
    public List(){
        this.data = new int[DEFAULT_CAPACITY];
    }

    /**
     * Check for the array capacity. If array is full create new array of bigger size
     * and copy all the elements in new array. Assign the new array to data variable
     */
    private void ensureCapacity(){
        if(size == DEFAULT_CAPACITY) {
            DEFAULT_CAPACITY = DEFAULT_CAPACITY + DEFAULT_CAPACITY / 2;
            int[] newData = new int[DEFAULT_CAPACITY];
            for(int i = 0; i < size; i++) {
                newData[i] = this.data[i];
            }
            this.data = newData;
        }
    }

    /**
     *
     * @return no. of elements in an array
     */
    public int getSize(){
        return this.size;
    }

    /**
     * Print all elements in an array
     */
    public void display(){
        for(int i = 0; i < size; i++) {
            System.out.println("Element at position "+ i +" is "+ data[i]);
        }
    }

    /**
     *
     * @return return an array with all the elements
     */
    public int[] getData(){
        return data;
    }

    /**
     * add element to end of the list
     * @param value element value to be added
     */
    public void add(int value){
        ensureCapacity();
        data[size] = value;
        size++;
    }

    /**
     *
     * @param index index at with vale needs to be added
     * @param value value to be inserted
     * @throws Exception If index is more then current size throw an exception
     */
    public void insert(int index, int value) throws Exception {
        if(index > size)
            throw new Exception("Invalid index");
        ensureCapacity();
        for(int i = size; i > index; i--) {
            data[i] = data[i-1];
        }
        data[index] = value;
        size++;
    }
}
