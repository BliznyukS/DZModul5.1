package modul52;

public class Main {
    public static void main(String[] args) {
        int resultSort;
        int[] sortArray = {83, -3, 14, 67, 74, 56, 87};
        /*
        for (int i = sortArray.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (sortArray[j] > sortArray[j + 1]) {
                    int tmp = sortArray[j];
                    sortArray[j] = sortArray[j + 1];
                    sortArray[j + 1] = tmp;
                }
            }
        }
        */

        SortedArray getSortedArray = new SortedArray();
        resultSort = getSortedArray.sort(sortArray);


        for (int masiv : resultSort){
            System.out.println(resultSort);
        }
    }
}
