package algorithms.squareRoot;

public class SquareRoot {
    public static double getSquareRoot(int number) {
        double temp;

        double sqrt = number / 2;

        do {
            temp = sqrt;
            sqrt = (temp + (number / temp)) / 2;
        } while ((temp - sqrt) != 0);

        return sqrt;
    }
}
