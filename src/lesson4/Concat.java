package lesson4;

/**
 * Created by vaha on 26.05.2017.
 */
public class Concat {

    public static String concat (String val1, String val2, String val3){
        String concat="";
        concat= val1+val2+val3;

        return concat;
    }

    public static void main(String[] args) {

        System.out.println(concat("mama","mila","ramu"));

    }
}
