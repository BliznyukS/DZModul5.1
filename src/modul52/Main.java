package modul52;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] resultSort;
        int[] array = {83, -3, 14, 67, 74, 56, 87};

        ArraySort getSortedArray = new ArraySort();
        resultSort = getSortedArray.bubbleSort(array);

        for (int masiv1 : array) {
            System.out.println(masiv1);
        }
        System.out.println("----------------------------");
        System.out.println(Arrays.toString(array));
        System.out.println("----------------------------");

        for (int masiv : resultSort) {
            System.out.println(masiv);
        }

    }
}
