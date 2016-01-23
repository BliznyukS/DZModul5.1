package modul52;

public class Main {
    public static void main(String[] args) {
        int[] resultSort;
        int[] resultSort1;
        int[] Array = {83, -3, 14, 67, 74, 56, 87};
        int[] NewArray = {45, -10, 34, 1, 6, 5, 839, -1};

        ArraySort_BubbleSort getSortedArray = new ArraySort_BubbleSort();
        resultSort = getSortedArray.sort(Array);
        resultSort1 = getSortedArray.sort(NewArray);


        for (int masiv : resultSort) {
            System.out.println(masiv);
        }
        System.out.println("-----------------");
        for (int masiv2 : resultSort1) {
            System.out.println(masiv2);
        }
    }
}
