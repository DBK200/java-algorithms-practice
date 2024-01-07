package org.example.arrays;

public class Arrays {
    public static void main(String[] args) {
        int[] intArray = new int[7];

        intArray[0] = 20;
        intArray[1] = 35;
        intArray[2] = -15;
        intArray[3] = 7;
        intArray[4] = 55;
        intArray[5] = 1;
        intArray[6] = -22;

        //retrieving with index O(1) - contant time

        //finding element without knowing the index O(n) - linear time
        int index = -1;
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] == 7) {
                index = i;
                break;
            }
        }

        System.out.println(index);

        //adding new elements O(n) - linear time, we have to create a new array, loop through the initial one
        //adding new element to the end of array (has space) O(1) - constant time
        //insert/update element at index O(1) - constant time
        //delete element by setting it to null O(1) - constant time
        //delete element by shifting elements O(n) - linear time

    }
}
