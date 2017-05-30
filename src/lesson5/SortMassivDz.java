package lesson5;

import java.util.Arrays;

/**
 * Created by vaha on 28.05.2017.
 */

//test testovich Git
public class SortMassivDz {



    public  static int[]  sortAscending(int[] array){


        for (int j = array.length -1 ; j > 0; j--)
        {

            for (int k = j -1; k > -1; k--)
            {
                if (array[j] < array[k])
                {
                    int temp = array[k];
                    array[k] = array[j];
                    array[j] = temp;
                }
            }

        }

        return array;

    }





    public  static int[]  sortDescending(int[] array){



        for (int j = 0; j < array.length - 1; j++)
        {
            for (int k = j + 1; k < array.length; k++)
            {
                if (array[j] < array[k])
                {
                    int temp = array[k];
                    array[k] = array[j];
                    array[j] = temp;
                }
            }
        }

        return array;

    }





    public static void main(String[] args) {
        int [] arr = {7,10,2,6,3,11,1};

        System.out.println(Arrays.toString(sortAscending(arr)));


        System.out.println(Arrays.toString(sortDescending(arr)));

    }
}
