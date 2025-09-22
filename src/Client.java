package src;
public class Client {
    public static void main(String[] args) {
        Player player1 = new Player("Alice");
        Player player2 = new Player("Bob");
        Player player3 = new Player("Charlie");
        Player[] players = {player1, player2,player3};
        Board board = new Board(5);
        Dice dice = new Dice(6);
        Game game = new Game.GameBuilder()
            .setPlayers(players)
            .setBoard(board)
            .setDice(dice)
            .setWinningStrategy(new DefaultWin())
            .setStartingStrategy(new DefaultStart())
            .build();
        game.play();
    }
}
