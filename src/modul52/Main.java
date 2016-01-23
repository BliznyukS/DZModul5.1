package modul52;

public class Main {
    public static void main(String[] args) {
        int[] resultSort;
        int[] resultSort1;
        int[] Array = {83, -3, 14, 67, 74, 56, 87};

        ArraySort getSortedArray = new ArraySort();
        resultSort = getSortedArray.bubbleSort(Array);
        System.out.println(Array);

        for (int masiv : resultSort) {
            System.out.println(masiv);
        }

    }
}
