package org.snakenladder;

import org.snakenladder.exception.SnakeParameterException;
import org.snakenladder.exception.LadderParameterException;

import java.util.HashMap;

public class Board {
    int cells;
    private HashMap<Integer, Ladder> ladders = new HashMap<Integer, Ladder>();
    private HashMap<Integer, Snake> snakes = new HashMap<Integer, Snake>();

    public Board(int size) {
        this.cells = size;
        try {
            this.addSnakes(40, 20);
            this.addSnakes(99, 2);

            this.addLadder(10, 90);
            this.addLadder(5, 50);

        }catch(Exception ex) {
            System.out.println("Error: " + ex.toString());
        }
    }

    public void addSnakes(int head, int tail) throws SnakeParameterException {
        if(tail > head) {
            throw new SnakeParameterException("For Snake the head value should be higher than the tail value");
        }
        this.snakes.put(head, new Snake(head, tail));
    }

    public void addLadder(int start, int end) throws LadderParameterException {
        if ( start > end) {
            throw new LadderParameterException("For Ladder the start value should be smaller than end value");
        }

        this.ladders.put(start, new Ladder(start, end));
    }

    public int isCurrentPositionSnakeOrLadder(int position) {
        if(this.snakes.get(position) != null) {
            System.out.println("Snake found");
            return this.snakes.get(position).getTail();
        }

        if(this.ladders.get(position) != null) {
            System.out.println("Ladder found");
            return this.ladders.get(position).getEnd();
        }

        return -1;
    }
}
