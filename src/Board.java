package src;
import java.util.HashMap;


public class Board {
    HashMap<Integer,BoardEntity> cells;
    int size;
    public Board(int dimension) {
        this.size = dimension*dimension;
		cells = new HashMap<Integer, BoardEntity>();
		for(int i=0; i<dimension; i++) {
			int min = 2;
			int max = size - 1;
			int start = (int) Math.floor(Math.random()*(max-min+1)+min);
			max = start - 1;
			int end = (int) Math.floor(Math.random()*(max-min+1)+min);
			if(!hasSnakeOrLadder(start)) {
				setEntity(start, new Snake(start, end));
			}
			max = size - 1;
			end = (int) Math.floor(Math.random()*(max-min+1)+min);
			max = end - 1;
			start = (int) Math.floor(Math.random()*(max-min+1)+min);;
			if(!hasSnakeOrLadder(start)) {
				setEntity(start, new Ladder(start, end));
			}
			
		}
    }
    public int getSize() {
        return size;
    }
    
    private void setEntity(int index, BoardEntity e) {
		cells.put(index, e);
	}
	
	public BoardEntity getEntity(int index) {
		if(hasSnakeOrLadder(index)) {
			return this.cells.get(index);
		}
		return null;
	}
	
	public boolean hasSnakeOrLadder(int cellIndex) {
		return cells.containsKey(cellIndex);
	}
    
}
