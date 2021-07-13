package ir.batna;
import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> unsortedArray = new ArrayList<>();
        unsortedArray.add(8);
        unsortedArray.add(7);
        unsortedArray.add(6);
        unsortedArray.add(5);
        unsortedArray.add(4);
        unsortedArray.add(0);
        unsortedArray.add(2);
        MergeSort ms = new MergeSort(unsortedArray);

        System.out.println("---------Initial Unsorted Array---------");
        for(int i:ms.getSortedArray()){
            System.out.print(i+" ");
        }
        ms.sortGivenArray();
        System.out.println("\n------------Sorted Array------------");
        for(int i:ms.getSortedArray()){
            System.out.print(i+" ");
        }

    }
}
