package modul52;

public class Main {
    public static void main(String[] args) {
        int[] resultSort;
        int[] resultSort1;
        int[] Array = {83, -3, 14, 67, 74, 56, 87};
        int[] NewArray = {45, -10, 34, 1, 6, 5, 839, -1};

        ArraySort getSortedArray = new ArraySort();
        resultSort = getSortedArray.bubbleSort(Array);
        resultSort1 = getSortedArray.bubbleSort(NewArray);


        for (int masiv : resultSort) {
            System.out.println(masiv);
        }
        System.out.println("-----------------");
        for (int masiv2 : resultSort1) {
            System.out.println(masiv2);
        }
    }
}
