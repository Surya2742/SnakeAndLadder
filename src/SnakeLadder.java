public class SnakeLadder {
    public static void main(String[] args) {
        int playerCurrentPosition = 0;
        final int noPlay = 0;
        final int ladder = 1;
        final int snake = 2;
        int dieCounter = 0;
        System.out.println("Game starts and Player is at Position : " + playerCurrentPosition + "\n");
        while(playerCurrentPosition < 100) {
            dieCounter++;
            int dice = (int) Math.floor(Math.random() * 6 + 1);
            System.out.println("The Number on dice is " + dice);
            int playerAction = (int) (Math.random() * 3);
            if (playerAction == ladder) {
                System.out.println("Option: Ladder");
                playerCurrentPosition += dice;
                if(playerCurrentPosition > 100) {
                    System.out.println("Player cannot go above 100");
                    playerCurrentPosition -= dice;
                }
                System.out.println("Ladder moves the player at " + playerCurrentPosition + "\n");
            }
            else if (playerAction == snake) {
                System.out.println("Option: Snake");
                playerCurrentPosition -= dice;
                if(playerCurrentPosition < 0) {
                    System.out.println("Player cannot go below 0");
                    playerCurrentPosition = 0;
                }
                System.out.println("Snake moves the player at " + playerCurrentPosition + "\n");
            }
            else if (playerAction == noPlay) {
                System.out.println("Option: No Play");
                System.out.println("Player stays on " + playerCurrentPosition + "\n");
            }
        }
        System.out.println("Die has been rolled for " + dieCounter + " times.");
    }
}
