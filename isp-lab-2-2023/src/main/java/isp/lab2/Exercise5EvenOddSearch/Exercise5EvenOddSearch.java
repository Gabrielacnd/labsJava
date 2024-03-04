package isp.lab2.Exercise5EvenOddSearch;

public class Exercise5EvenOddSearch {

    public static int[] findEvenOdd(String input) {
        int par = 0, impar = 0, max = 0, i = 0, min = Integer.MAX_VALUE;
        String[] tokens = input.split(",");
        String[] res = new String[input.length()];
        for (String token : tokens) {
            int number = Integer.parseInt(token);
            ++i;
            if (number % 2 == 0 && number > max) {
                max = number;
                par = i;
            } else if (number % 2 == 1 && number < min) {

                min = number;
                impar = i;
            }

        }
        int[] MaxMin = new int[tokens.length + 1];
        MaxMin[par] = max;
        MaxMin[impar] = min;
        return MaxMin;
    }

    public static void main(String[] args) {
        String input = "1,2,3,4,5,6,7,8,9,10";
        int[] result = findEvenOdd(input);
        for (int i : result) {
            if(result.length==1)
            {
                if (result[i] != 0 && result[i] % 2 == 1)
                    System.out.println(result[i] + " index " + i + " In sir nu exista numere pare!!");
                else if (result[i] != 0 && result[i] % 2 == 0)
                    System.out.println(result[i] + " index " + i + " In sir nu exista numere impare!!");
            }
            else
            {

            if (result[i] != 0 &&i%2==0)
                System.out.println("Maxim par: "+result[i] + " index " + i );
            else if (result[i] != 0 &&i%2==1)
                System.out.println("Minim impar: "+result[i] + " index " + i );}


        }
    }
}
