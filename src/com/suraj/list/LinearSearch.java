package com.suraj.list;

public class LinearSearch extends List{

    public LinearSearch(){
        super();
    }

    /**
     * Search an element starting from 0th position & go upto the index where element is found
     * @param element Element to search in array
     * @return index of element if found & -1 if not found
     */
    public int search(int element){
        for(int i = 0; i < size; i++) {
            if(data[i] == element)
                return i;
        }
        return -1;
    }
}
