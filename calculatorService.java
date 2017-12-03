package hu.helixlab;

import java.util.Scanner;

public class calculatorService {
    public static void main(String args[]) {
        int x, y, operation;

        System.out.println("1- összeadás");
        System.out.println("2- kivonás");
        System.out.println("3- osztás");
        System.out.println("4- szorzás");
        System.out.print("Válassz műveleti jelet -");
        Scanner var = new Scanner(System.in);

        operation = var.nextInt();
        System.out.print("Add meg az első számot -");
        x = var.nextInt();
        System.out.print("Add meg a második számot -");
        y = var.nextInt();
        calc(x, y);
        public static void calc(int x, int y) {
            int c;

            switch (operation) {
                case 1:
                    c = x + y;
                    System.out.print("Output-" + c);
                    break;

                case 2:
                    c = x - y;
                    System.out.print("Output-" + c);
                    break;

                case 3:
                    c = x / y;
                    System.out.print("Output-" + c);
                    break;

                case 4:
                    c = x * y;
                    System.out.print("Output-" + c);
                    break;
            }
        }
    }






}
