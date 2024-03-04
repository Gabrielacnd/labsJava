package isp.lab2.Exercise2PrimeProduct;
import java.util.Scanner;
public class Exercise2PrimeProduct {


    public static boolean verify(long nr)
    {
        if(nr==1)
            return false;
        for(int i=2;i*i<=nr;i++)
            if(nr%i==0)
                return false;
        return true;
    }
    public static void afiseazaNrPrime(int n, long[ ] a){
        for(int i=0;i<n;i++)
            System.out.println(a[i]);
    }
    public static long getPrimeProduct(int n, int m) {
         long [] prime=new long[10];
         long cautat=n;
         long prod=1;
        int sizeP=0;

                while(cautat<=m) {

                    if (verify(cautat)) {
                        prime[sizeP++] = cautat;
                        prod = prod * cautat;
                    }
                    cautat++;
                }
        afiseazaNrPrime(sizeP,prime);
     return prod;


    }


    /**
     * This method should read from the console a number
     * @return the number read from the console
     */
    public static int readfromConsoleInt() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        return number;
    }

    public static void main(String[] args) {
        System.out.println("The product of the first 10 prime numbers is: " + getPrimeProduct(10, 20));
        System.out.println("The product of prime numbers between m and n: " + getPrimeProduct(readfromConsoleInt(), readfromConsoleInt()));
    }

}
