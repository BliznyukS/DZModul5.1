package modul51;

public class Main {
    public static void main(String[] args) {
        int resultMin;
        int resultMax;
        int[] array = {12, 1, 5, 7, 13, -1, -5};

        MinMaxAlgorithm getMin = new MinMaxAlgorithm();
        resultMin = getMin.getMinElement(array);

        MinMaxAlgorithm getMax = new MinMaxAlgorithm();
        resultMax = getMax.getMaxElement(array);

        System.out.println("Max: " + resultMin);
        System.out.println("Min:" + resultMax);
    }
}
