package com.suraj.list;

/**
 * Binary search is only for sorted list.
 * Since the data is sorted, we divide the search in half in every iteration
 */
public class BinarySearch extends List{

    public BinarySearch(){
        super();
    }

    /**
     * Search an array by diving the search are in half after every iteration
     * @param element value to find
     * @return index of element. -1 if element not found
     */
    public int search(int element){
        int lowIndex = 0, highIndex = size-1, midIndex;
        while(lowIndex <= highIndex){
            midIndex = (lowIndex + highIndex) / 2;
            if(element == data[midIndex])
                return midIndex;
            else if(element < data[midIndex])
                highIndex = midIndex - 1;
            else
                lowIndex = midIndex + 1;
        }
        return -1;
    }
}
