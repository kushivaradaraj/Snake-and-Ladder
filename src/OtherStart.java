package src;
public class OtherStart implements IStartingStrategy {
    @Override
    public boolean canStart(int diceRoll) {
        return diceRoll == 6;
    }
    
}
