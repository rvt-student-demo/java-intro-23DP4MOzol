package lv.rvt;

public class LatvianFlag {
    public static void printFlag(int width, int height) {

        int middleStripeHeight = height / 3;


        for (int i = 0; i < height - middleStripeHeight * 2; i++) {
            System.out.println(ConsoleColors.RED_BACKGROUND + " ".repeat(width) + ConsoleColors.RESET);
        }

        for (int i = 0; i < middleStripeHeight; i++) {
            System.out.println(ConsoleColors.WHITE_BACKGROUND + " ".repeat(width) + ConsoleColors.RESET);
        }

        for (int i = 0; i < height - middleStripeHeight * 2; i++) {
            System.out.println(ConsoleColors.RED_BACKGROUND + " ".repeat(width) + ConsoleColors.RESET);
        }
    }

    public static void main(String[] args) {
        int width = 50; 
        int height = 15;    
        printFlag(width, height);
    }
}
