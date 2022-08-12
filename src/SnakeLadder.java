public class SnakeLadder {

    private final static int playerOne = 1;
    private final static int playerTwo = 2;
    static int currentPlayer = playerOne;
    public static void main(String[] args) {
        int playerOneCurrentPosition = 0;
        int playerTwoCurrentPosition = 0;
        final int noPlay = 0;
        final int ladder = 1;
        final int snake = 2;
        int dieCounter = 0;

        while(playerOneCurrentPosition < 100 && playerTwoCurrentPosition < 100) {
            dieCounter++;
            int currentPlayerDice = (int) Math.floor(Math.random() * 6 + 1);
            System.out.println("\nThe Number on Player dice is " + currentPlayerDice);
            int playerAction = (int) (Math.random() * 3);

            if (playerAction == ladder) {
                System.out.println("Option: Ladder");
                if(currentPlayer == playerOne) {
                    playerOneCurrentPosition += currentPlayerDice;
                    if (playerOneCurrentPosition > 100) {
                        playerOneCurrentPosition -= currentPlayerDice;
                    }
                }
                else if(currentPlayer == playerTwo) {
                    playerTwoCurrentPosition += currentPlayerDice;
                    if (playerTwoCurrentPosition > 100) {
                        playerTwoCurrentPosition -= currentPlayerDice;
                    }
                }
            }
            else if (playerAction == snake) {
                System.out.println("Option: Snake");
                if(currentPlayer == playerOne) {
                    playerOneCurrentPosition -= currentPlayerDice;
                    if (playerOneCurrentPosition < 0) {
                        playerOneCurrentPosition = 0;
                    }
                }
                else if(currentPlayer == playerTwo) {
                    playerTwoCurrentPosition -= currentPlayerDice;
                    if (playerTwoCurrentPosition < 0) {
                        playerTwoCurrentPosition = 0;
                    }
                }
            }
            else if (playerAction == noPlay) {
                System.out.println("Option: No Play");
            }
            if(currentPlayer == playerOne)
                System.out.println("Current Position of Player " + currentPlayer + " is " + playerOneCurrentPosition);
            else if(currentPlayer == playerTwo)
                System.out.println("Current Position of Player " + currentPlayer + " is " + playerTwoCurrentPosition);
            playerCheck(playerAction);
        }
        if(playerOneCurrentPosition == 100)
            System.out.println("Winner is Player 1");
        else if(playerTwoCurrentPosition == 100)
            System.out.println("Winner is Player 2");
        System.out.println("Die has been rolled for " + dieCounter + " times.");
    }


    public static void playerCheck(int playerAction) {
        if(playerAction == 0 || playerAction == 2) {
            if(currentPlayer == playerOne) {
                currentPlayer = playerTwo;
            }else if(currentPlayer == playerTwo) {
                currentPlayer = playerOne;
            }
        }
        else if(playerAction == 1) {
            if(currentPlayer == playerOne) {
                currentPlayer = playerOne;
            }else if(currentPlayer == playerTwo) {
                currentPlayer = playerTwo;
            }
        }
    }
}
