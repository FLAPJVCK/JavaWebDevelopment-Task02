package by.epamtc.VaskevichArtsiom.task02;

public class Basket {
    public Ball ballBasket[];

    public Basket(Ball balls[]) {
        this.ballBasket = balls;
    }

    public double countBallsWeight() {
        double weight = 0;
        for (Ball ball : ballBasket) {
            weight += ball.getWeight();
        }
        return weight;
    }

    public int countBallsOfGivenColor(String color) {
        int count = 0;
        for (Ball ball : ballBasket) {
            if (color == ball.getColor()) {
                count++;
            }
        }
        return count;
    }
}
