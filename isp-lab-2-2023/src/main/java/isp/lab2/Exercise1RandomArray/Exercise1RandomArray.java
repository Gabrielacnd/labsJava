package isp.lab2.Exercise1RandomArray;

import java.util.Random;

public class Exercise1RandomArray {

    public static int[] getArrayOfRandomNumbers(int n) {
        int[] array = new int[n];
        Random random = new Random();
        for(int i=0;i<array.length;i++)
        {

            array[i]=random.nextInt(100);

        }

        return array;
    }

    public static int[] findMaxAndMin(int[] array) {

        int[ ] maxMin= new int[2];
        maxMin[0] = 0;
        maxMin[1] = Integer.MAX_VALUE;
        for(int i=0;i<array.length;i++)
            if(array[i]>maxMin[0])
                maxMin[0]=array[i];
        else
            if(array[i]<maxMin[1])
             maxMin[1]=array[i];
        return maxMin;
    }

    public static void main(String[] args) {

        Random random = new Random();

        //genereaza numar random intre 10 si 100
        int size = random.nextInt(91) + 10;
        int[] a = getArrayOfRandomNumbers(size);
        int[] mm = findMaxAndMin(a);
        System.out.println(" the Array is:");
        for(int i=0;i<a.length;i++)
            System.out.print(a[i]+" ");
        System.out.println();
        System.out.println("Max is:"+mm[0]+" Min is:"+mm[1] );
    }
}
