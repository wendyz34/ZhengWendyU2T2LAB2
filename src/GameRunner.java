/*public class GameRunner {
    public static void main(String[] args) {
        // ----- THIS CLIENT CLASS CONTAINS TEST CODE! -----
        // Run this code after you have implemented the methods to test your solutions!
        // FEEL FREE TO COMMENT OUT CERTAIN LINES TO TEST INDIVIDUAL METHODS AS YOU WORK
        Game game = new Game("Dodge Ball", 5);
        System.out.println("Game name: " + game.getGameName());
        System.out.println("Players: " + game.getPlayers());
        System.out.println("Score: " + game.getScore());
        System.out.println("Is game over? " + game.isGameOver());

        System.out.println("----- UPDATING STATE OF GAME -----");
        game.addPlayer();
        game.addPlayer();
        game.addPlayer();
        game.increaseScore(8);
        game.increaseScore(3);
        System.out.println("Game name: " + game.getGameName());
        System.out.println("Players: " + game.getPlayers());
        System.out.println("Score: " + game.getScore());
        System.out.println("Avg score per player: " + game.averageScorePerPlayer());
        System.out.println("Is game over? " + game.isGameOver());

       /* Game game2 = new Game("Race",2);
        game.miles(2);
        System.out.println("Miles: " +game2.getMiles());
        game2.someoneWins();*/

    //}
//}


