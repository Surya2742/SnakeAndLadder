public class SnakeLadder {
    public static void main(String[] args) {
        int playerCurrentPosition = 0;
        final int noPlay = 0;
        final int ladder = 1;
        final int snake = 2;
        System.out.println("Game starts and Player is at Position : " + playerCurrentPosition + "\n");
        while(playerCurrentPosition < 100) {
            int dice = (int) Math.floor(Math.random() * 6 + 1);
            System.out.println("The Number on dice is " + dice);
            int playerAction = (int) (Math.random() * 3);
            if (playerAction == ladder) {
                System.out.println("Option: Ladder");
                playerCurrentPosition += dice;
                System.out.println("Ladder moves the player forward at " + playerCurrentPosition + "\n");
            }
            else if (playerAction == snake) {
                System.out.println("Option: Snake");
                playerCurrentPosition -= dice;
                if(playerCurrentPosition < 0)
                {
                    playerCurrentPosition = 0;
                }
                System.out.println("Snake moves the player backward at " + playerCurrentPosition + "\n");
            }
            else if (playerAction == noPlay) {
                System.out.println("Option: No Play");
                System.out.println("Player is on " + playerCurrentPosition + "\n");
            }
        }
    }
}
