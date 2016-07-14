package dz5_1;

public class Sorter {

    public static int[] BubbleSort(int [] rezerMassort){

        for (int i=1; i<rezerMassort.length  ;i++) {
            for (int j=rezerMassort.length-1; j>=i; j--) {
                if (rezerMassort[j - 1] > rezerMassort[j]) {
                    int bobble = rezerMassort[j-1];
                    rezerMassort[j-1]=rezerMassort[j];
                    rezerMassort[j]=bobble;
                }
            }

        }
        return rezerMassort;
    }



}
