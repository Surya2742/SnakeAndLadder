public class SnakeLadder {
    public static void main(String[] args) {
        int playerOneCurrentPosition = 0;
        int playerTwoCurrentPosition = 0;
        final int noPlay = 0;
        final int ladder = 1;
        final int snake = 2;
        int dieCounter = 0;
        System.out.println("Game starts:\nPlayer One is at Position : " + playerOneCurrentPosition + "\nPlayer Two is at Position : " + playerTwoCurrentPosition + "\n");
        while(playerOneCurrentPosition < 100 && playerTwoCurrentPosition < 100) {
            dieCounter++;
            int playerOneDice = (int) Math.floor(Math.random() * 6 + 1);
            System.out.println("The Number on Player One dice is " + playerOneDice);
            int playerTwoDice = (int) Math.floor(Math.random() * 6 + 1);
            System.out.println("The Number on Player Two dice is " + playerTwoDice);
            int playerAction = (int) (Math.random() * 3);
            if (playerAction == ladder) {
                System.out.println("Option: Ladder");
                playerOneCurrentPosition += playerOneDice;
                playerTwoCurrentPosition += playerTwoDice;
                if(playerOneCurrentPosition > 100) {
                    System.out.println("Player One cannot go above 100");
                    playerOneCurrentPosition -= playerOneDice;
                }
                System.out.println("Ladder moves the Player One at " + playerOneCurrentPosition);
                if(playerTwoCurrentPosition > 100) {
                    System.out.println("Player Two cannot go above 100");
                    playerTwoCurrentPosition -= playerTwoDice;
                }
                System.out.println("Ladder moves the Player Two at " + playerTwoCurrentPosition + "\n");
            }
            else if (playerAction == snake) {
                System.out.println("Option: Snake");
                playerOneCurrentPosition -= playerOneDice;
                playerTwoCurrentPosition -= playerTwoDice;
                if(playerOneCurrentPosition < 0) {
                    System.out.println("Player One cannot go below 0");
                    playerOneCurrentPosition = 0;
                }
                System.out.println("Snake moves the Player One at " + playerOneCurrentPosition);
                if(playerTwoCurrentPosition < 0) {
                    System.out.println("Player Two cannot go below 0");
                    playerTwoCurrentPosition = 0;
                }
                System.out.println("Snake moves the Player Two at " + playerTwoCurrentPosition + "\n");
            }
            else if (playerAction == noPlay) {
                System.out.println("Option: No Play");
                System.out.println("Player One stays at " + playerOneCurrentPosition);
                System.out.println("Player Two stays at " + playerTwoCurrentPosition + "\n");
            }
        }
        System.out.println("Die has been rolled for " + dieCounter + " times.");
        if(playerOneCurrentPosition == 100)
            System.out.println("Player One Wins the Game");
        else  if(playerTwoCurrentPosition == 100)
            System.out.println("Player Two Wins the Game");
    }
}
