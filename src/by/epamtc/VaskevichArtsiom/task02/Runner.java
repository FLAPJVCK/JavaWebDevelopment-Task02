package by.epamtc.VaskevichArtsiom.task02;

public class Runner {
    public static void main(String[] args) {
        Ball balls[] = new Ball[]{
                new Ball(2, "red"),
                new Ball(3, "blue"),
                new Ball(2, "yellow"),
                new Ball(3, "blue"),
                new Ball(2, "green"),
                new Ball(3, "blue"),
                new Ball(2, "red")
        };
        Basket basket = new Basket(balls);
        System.out.println("Weight of all balls: " + basket.countBallsWeight());
        System.out.println("There are " + basket.countBallsOfGivenColor("blue") + " balls of blue color");
    }
}
