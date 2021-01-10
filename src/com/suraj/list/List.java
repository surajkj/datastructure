package com.suraj.list;

public class List {

    int[] data;
    int size = 0;
    static int DEFAULT_CAPACITY = 10;

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
     * Add an element at a given index
     * @param index index at with vale needs to be added
     * @param value value to be inserted
     * @throws Exception If index is more then current size throw an exception
     */
    public void insert(int index, int value) throws Exception {
        if(index < 0 || index > size)
            throw new Exception("Invalid index");
        ensureCapacity();
        for(int i = size; i > index; i--) {
            data[i] = data[i-1];
        }
        data[index] = value;
        size++;
    }

    /**
     * Delete an element from the given index
     * @param index index that need to be deleted
     * @throws Exception If index is more then current size throw an exception
     */
    public void delete(int index) throws Exception {
        if(index < 0 || index > size)
            throw new Exception("Invalid index");
        for(int i = index; i < size-1; i++) {
            data[i] = data[i+1];
        }
        data[size-1] = 0;
        size--;
    }

    /**
     * Get element at given index
     * @param index position for which element is required
     * @return element value
     * @throws Exception If index is more then current size throw an exception
     */
    public int getElement(int index) throws Exception {
        if(index < 0 || index > size)
            throw new Exception("Invalid index");
        return data[index];
    }

    /**
     * Set element at given index
     * @param index index for which value needs to be replaced
     * @param element new element value
     * @throws Exception If index is more then current size throw an exception
     */
    public void setElement(int index, int element) throws Exception {
        if(index < 0 || index > size)
            throw new Exception("Invalid index");
        data[index] = element;
    }

    /**
     * Biggest value from array
     * @return Biggest value from array
     * @throws Exception If no element in array
     */
    public int max() throws Exception {
        if(size < 1)
            throw new Exception("No data in array");
        int max = data[0];
        for(int i = 0; i < size; i++) {
            if(max < data[i])
                max = data[i];
        }
        return max;
    }

    /**
     * Smallest value from an array
     * @return Smallest value from an array
     * @throws Exception If no element in array
     */
    public int min() throws Exception {
        if(size < 1)
            throw new Exception("No data in array");
        int min = data[0];
        for(int i = 0; i < size; i++) {
            if(min > data[i])
                min = data[i];
        }
        return min;
    }

    /**
     *
     * @return Average of all the values in array
     */
    public int avg(){
        int avg = 0;
        for(int i = 0; i < size; i++) {
            avg += data[i];
        }
        return avg / size;
    }

    /**
     *
     * @return Sum of all the elements in array
     */
    public int sum(){
        int sum = 0;
        for(int i = 0; i < size; i++) {
            sum += data[i];
        }
        return sum;
    }

    /**
     * Reverse elements in an array
     */
    public void reverse(){
        int temp;
        for(int i = 0, j =size-1 ; i < size / 2; i++, j--) {
            temp = data[i];
            data[i] = data[j];
            data[j] = temp;
        }
    }

    /**
     * Shift elements by 1 position
     */
    public void shift(){
        int temp = data[0];
        for(int i = 0; i < size; i++) {
            data[i] = data[i+1];
        }
        data[size-1] = temp;
    }
}
