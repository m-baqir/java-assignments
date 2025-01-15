/**
Author: Mohammad Baqir
Student ID: 239330870
Lab 5
Any and all work in this file is my own
 */
package COSC2006.Lab5;

public class ADTList {
    private int size;
    private String[] myList;

    ADTList(String[] myList, int size) throws ListException {
        if (size < 1 || myList.length > size) {
            throw new ListException("Invalid size for array" + size);
        } else {
            this.size = size;
            this.myList = new String[size];
            for (int i = 0; i < myList.length; i++) {
                this.myList[i] = myList[i];
            }
        }

    }

    public boolean isEmpty() {
        if (myList.length == 0)
            return true;
        else
            return false;
    }

    public int size() {
        int counter = 0;
        for (int i = 0; i < myList.length; i++) {
            if (myList[i] != null)
                counter++;
        }
        return counter;
    }

    public void add(String item, int i) throws ListException {
        if (i < 0 || i > size()) {
            throw new ListException("Invalid index for item addition " + i);
        } else {
            for (int j = size() - 1; j > i; j--) {
                myList[j] = myList[j - 1];
            }
            myList[i] = item;

        }

    }

    public String remove(int i) throws ListException {
        if (i < 0 || i >= size() || myList[i] == null) {
            throw new ListException("Invalid index for item removal " + i);
        } else {
            String current = myList[i];
            for (int j = i; j < myList.length - 1; j++) {
                myList[j] = myList[j + 1];
            }
            myList[myList.length - 1] = null;
            return current;
        }
    }

    public void removeAll() {
        myList = new String[size];
    }

    public String get(int i) {
        return myList[i];
    }

    public int find(String item) throws ListException {
        for (int i = 0; i < myList.length; i++) {
            if (myList[i] == item) {
                return i;
            }
        }
        throw new ListException("Item " + item + " does not exist.");
    }

    @Override
    public String toString() {
        if (isEmpty()) {
            return "Array is empty!";
        } else {
            String finalString = "";
            for (int i = 0; i < size(); i++) {
                finalString += myList[i] + ", ";
            }
            finalString = finalString.substring(0, finalString.length() - 2);
            return finalString;
        }
    }

}
