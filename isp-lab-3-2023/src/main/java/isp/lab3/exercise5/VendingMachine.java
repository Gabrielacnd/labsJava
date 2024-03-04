package isp.lab3.exercise5;

import java.util.Scanner;


public class VendingMachine {
    private int credit = 0;

    public void displayProducts() {
        System.out.println("The available products are:coffee(5),tea(50),water(00),pepsi(2),snack(444)");
    }

    public int insertCoin(int value) {
        if (value >= 1 && value <= 20)
            credit = value;
        return credit;

    }

    public String selectProduct(int key) {
        if (key == 5) {
            return "coffee";
        } else if (key == 50) {
            return "tea";
        } else if (key == 00) {
            return "water";
        } else if ((key == 2)) {
            return "pepsi";
        } else if (key == 444) {
            return "snack";
        }
        return null;

    }

    public void displayCredit() {
        System.out.println("current available credit is:" + credit);
    }

    public void userMenu() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Alegeti id-ul corespunzator produsului dorit:");
        int id = scan.nextInt();
        switch (id) {
            case 00:
                System.out.println("Ati ales produsul:" + selectProduct(id));
                break;
            case 5:
                System.out.println("Ati ales produsul:" + selectProduct(id));
                break;
            case 50:
                System.out.println("Ati ales produsul:" + selectProduct(id));
                break;
            case 2:
                System.out.println("Ati ales produsul:" + selectProduct(id));
                break;
            case 444:
                System.out.println("Ati ales produsul:" + selectProduct(id));
                break;
            default:
                System.out.println("Id-ul introdus nu este corect.");
                break;


        }
    }

    public static void main(String[] args) {

        VendingMachine obj = new VendingMachine();

        obj.insertCoin(6);
        obj.displayCredit();
        obj.userMenu();
        System.out.println(obj);
    }
}

