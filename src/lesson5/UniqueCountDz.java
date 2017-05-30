package lesson5;



/**
 * Created by vaha on 28.05.2017.
 */
public class UniqueCountDz {

    // test commit

    public static int uniqueCount(int[] array) {

        boolean mask[] = new boolean[array.length];
        int removeCount = 0;

        for (int i = 0; i < array.length; i++) {
            if (!mask[i]) {
                int tmp = array[i];

                for (int j = i + 1; j < array.length; j++) {
                    if (tmp == array[j]) {
                        mask[j] = true;
                        removeCount++;
                    }
                }
            }
        }

        int[] result = new int[array.length - removeCount];

        for (int i = 0, j = 0; i < array.length; i++) {
            if (!mask[i]) {
                result[j++] = array[i];
            }
        }


        return result.length;

    }










    public static void main(String[] args) {


        int [] arr = {11, 12, 10, 5, 4, 44, 100, 44, 11, 10, 11};


        System.out.println(uniqueCount(arr));

    }

}
