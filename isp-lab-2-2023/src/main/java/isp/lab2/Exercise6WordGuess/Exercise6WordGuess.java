package isp.lab2.Exercise6WordGuess;

import java.util.Scanner;
import java.util.Random;

public class Exercise6WordGuess {
    private static char[] ghicit;
    public static int ghicite = 0;

    public static void afiseazaM(char caracter) {
        System.out.println("Litera " + caracter + " nu se gaseste in cuvant.Mai incercati");
    }

    public static void afiseaza(char[] litereGhicite, int poz) {
        System.out.print("Litera " + litereGhicite[poz] + " se afla in cuvnat.");
        poz++;
        System.out.println("Pe pozitia:" + poz);
    }

    public static int countOccurence(char c, char[] word) {
        if (ghicit == null) {
            ghicit = new char[word.length];
        }
        int gasit = 0;
        for (char i = 0; i < word.length; i++) {
            if (c == word[i] && ghicit[i] == 0 && gasit == 0) {
                ghicit[i] = c;
                afiseaza(ghicit, i);
                ghicite++;
                gasit++;

            } else if (c == word[i] && ghicit[i] == 0 && gasit >= 1) {
                ghicit[i] = c;
                afiseaza(ghicit, i);
                ghicite++;
                gasit++;
            }

        }
        if (gasit != 0)
            return ghicite;
        else

            return 0;
    }

    public static void main(String[] args) {
        Random random = new Random();
        int nrIncercari = 0;
        String[] dictionary = {"elevator", "caine", "masina", "telefon", "casa", "munte"};
        char[] cuvant = dictionary[random.nextInt(dictionary.length)].toCharArray();
        System.out.println(cuvant);//afisarea cuvantului de ghicit
        ghicit = new char[cuvant.length];
        Scanner scanner = new Scanner(System.in);
        while (ghicite<cuvant.length) {

            System.out.println("Dati o litera:");
            String lit = scanner.nextLine();
            char litera = lit.charAt(0);
            nrIncercari++;
            if (countOccurence(litera, cuvant) == 0) {
                afiseazaM(litera);

            }

        }

        System.out.println("Ati castigat.Cuvantul este:");
        for (int i = 0; i < cuvant.length; i++) System.out.print(cuvant[i]);
        System.out.println("\nNumarul de incercari:" + nrIncercari);
        scanner.close();
    }

}
