package modul52;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] resultSort;
        int[] resultSort1;
        int[] Array = {83, -3, 14, 67, 74, 56, 87};

        ArraySort getSortedArray = new ArraySort();
        resultSort = getSortedArray.bubbleSort(Array);

        for (int masiv1 : Array) {
            System.out.println(masiv1);
        }
        System.out.println("----------------------------");
        System.out.println(Arrays.toString(Array));
        System.out.println("----------------------------");

        for (int masiv : resultSort) {
            System.out.println(masiv);
        }

    }
}
