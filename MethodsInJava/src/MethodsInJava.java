public class MethodsInJava {

    public static void main(String[] args) {
        /*boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        calculateScore(true, 800, 5, 100);
        calculateScore(true, 10000, 8, 200);

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score was " + finalScore);
        }

        score = 10000;
        levelCompleted = 8;
        bonus = 200;
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was" + finalScore);
        }*/

        //tot ce e mai sus este o metoda, aici se numeste main.

        displayHighScorePosition("Ion", 6);




    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        boolean gameOver = true;
        int score;
        int levelCompleted = 5;
        int bonus = 100;

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            System.out.println("Your final score was " + finalScore);
            return finalScore;
        }
        return -1;


    }

    public static void displayHighScorePosition(String playerName, int highScorePosition) {
        String name = "Ingrid";
        int highScore = 4;


        System.out.println(name + "managed to get into position " + highScore + " on the highscore table.");
    }


// Create a method called displayHighScorePosition
    //It should a players name as a parameter, and a 2nd parameter as a position in the high score table
    //you should display the players name along with the message like "managed to get into position" and the position
    //they got and a further message " on th high score table".
    //
    //create a 2nd method called calculateHighScorePosition
    //it should be sent one argument onl, the player score
    //it should return an int
    //the return data should be
    //1 if the score is > 1000
    //2 if the score is > 500 and < 1000
    //3 if the score is > 100 and <500
    //4 in all other cases
    //call both methods and display the results of the following
    //a score of 1500, 900, 400, and 50


}
