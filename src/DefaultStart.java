package src;
public class DefaultStart implements IStartingStrategy {
    @Override
    public boolean canStart(int diceRoll) {
        return true;
    }
    
}
