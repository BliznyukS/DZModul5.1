package modul51;

public class MinMaxAlgorithm {
    public int getMinElement(int[] array) {
        int min = 0;
        for (int i = 0; i < array.length; i++) {
            if (min > array[i])
                min = array[i];
        }
        return min;
    }

    public int getMaxElement(int[] array) {
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (max < array[i])
                max = array[i];
        }
        return max;
    }

}
