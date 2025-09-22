package src;
public class DefaultWin implements IWinningStrategy {
    @Override
    public boolean isWinner(int newPosition, Board board) {
        return newPosition == board.getSize();
    }
    
}
