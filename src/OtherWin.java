package src;
public class OtherWin implements IWinningStrategy {
    @Override
    public boolean isWinner(int newPosition, Board board) {
        return newPosition == board.getSize() || newPosition > board.getSize();
    }
    
}
