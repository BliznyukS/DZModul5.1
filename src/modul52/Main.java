package modul52;

public class Main {
    public static void main(String[] args) {
        int [] sortArray = {83, -3, 14, 67, 74, 56, 87};

        for (int i = 0; i < sortArray.length - 1; i++){
            if (sortArray[i] > sortArray[i + 1]){
                int tmpVarArray = sortArray[i];

                sortArray[i] = sortArray[i + 1];
                sortArray[i + 1] = tmpVarArray;
            }
        }

        for (int masiv : sortArray){
            System.out.println(masiv);
        }
    }
}
