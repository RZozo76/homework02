package hu.helixlab;

import java.util.Scanner;

public class calculatorService {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.println("Kérek két számot: ");

        double first = reader.nextDouble();
        double second = reader.nextDouble();

        System.out.println("Kérek egy műveleti jelet (+, -, *, /): ");
        char operator = reader.next().charAt(0);

        double result;

        switch(operator)
        {
            case '+':
                result = first + second;
                break;

            case '-':
                result = first - second;
                break;

            case '*':
                result = first * second;
                break;

            case '/':
                result = first / second;
                break;

            default:
                System.out.println("Hiba! nincs ilyen műveleti jel");
                return;
        }

        System.out.println(result);
    }
    }
