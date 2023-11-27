package Array;

import java.util.*;

public class ArraysCC {
    public static int linearsearch(int numbers[], int key) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                return i;
            }
        }

        return -1;

    }

    public static int linearsearch(String foods[], String key) {
        for (int i = 0; i < foods.length; i++) {
            if (foods[i].equalsIgnoreCase(key)) {
                return i;
            }
        }

        return -1;

    }

    public static void main(String args[]) {
        int numbers[] = { 2, 4, 6, 8, 10, 12, 14, 16 };
        // int key=10;
        String food[] = { "dosa", "momos", "rolls" };
        String key = "dosa";
        int index = linearsearch(food, key);
        if (index != -1) {
            System.out.println("key is at index = " + index);
        } else {
            System.out.println("key is not found = " + index);
        }

        /*
         * int index=linearsearch(numbers, key);
         * if(index!=-1){
         * System.out.println("key is at index = "+index);
         * }
         * else
         * {
         * System.out.println("key is not found = "+index);
         * }
         */
    }

}
