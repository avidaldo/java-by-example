package p03_data_structures.listas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayExample1 {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>(Arrays.asList(new String[]{"A", "B", "C"}));
        list.add("D");
        list.forEach(x -> System.out.println(x));

    }
}


//https://www.mkyong.com/java/java-convert-array-to-arraylist/?fbclid=IwAR3-f7vrNxE9ydsGpP6fGYfkmwpOVrB_3bko21VmrfozQneoVrIKCtMLHTw