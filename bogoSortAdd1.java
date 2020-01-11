// Based on code from an idea Alan Yao had / created before. 
// Uses the godly bogo sort alg but adds a random value to the array list if not sorted.

import java.util.*;
public class bogoSortAdd1 {
   public static void main(String[] args) {
      Random rand = new Random();
      ArrayList<Integer> list = new ArrayList<Integer>();
      for(int i = 0; i < 5; i++) {
         list.add(rand.nextInt(101));
      }
      bogoSort(list,rand);
   }
   
   public static void bogoSort(ArrayList<Integer> array, Random rand) {
        int counter = 0;
        while (!isSorted(array,rand)) {
            for (int i = 0; i < array.size(); i++) {
                shuffle(array);
            }
            System.out.println(array + " Attempt: " + counter + " Size: " + array.size());
            counter++;
        }
        System.out.println(array);
        System.out.println("This sort took " + counter + " attempts");
    }
    
   private static boolean isSorted(ArrayList<Integer> array, Random rand) {
        for (int i = 0; i < array.size() - 1; i++) {
            if (array.get(i) > array.get(i + 1)) {
               array.add(rand.nextInt(101));
               return false;
            } 
        }
        return true;
    }

    private static void swap(ArrayList<Integer> array, int index1, int index2) {
        int temp = array.get(index1);
        array.set(index1, array.get(index2));
        array.set(index2, temp);
    }

    private static void shuffle(ArrayList<Integer> list) {
        int n = list.size();
        for (int i = 0; i < n; i++) {
            swap(list, i, (int)(Math.random() * (n - i) + i));
        }
    }
}