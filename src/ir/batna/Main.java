package ir.batna;
import java.util.ArrayList;
import java.util.Random;


public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> unsortedArray = new ArrayList<>();
        for (int i=0;i<20;i++){
            Random random=new Random();
            unsortedArray.add(random.nextInt(20));
        }


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
