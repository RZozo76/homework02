package hu.helixlab;

public class calculatorService {
    private boolean isItEven = true;

    public boolean isItEven(int number) {
        if ((number%2)== 0) {
            isItEven = true;
            System.out.println( " A szám " + number + " páros");
        }
        else {
            isItEven = false;
            System.out.println( " A szám " + number + " nem páros");
        }
        return isItEven;
    }



}
