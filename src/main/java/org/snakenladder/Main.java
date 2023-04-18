package org.snakenladder;

public class Main {
    public static void main(String[] args) {

        Game g = new Game(new Board(100));
        g.addPlayer(new Player("Arjun"));
        g.addPlayer(new Player("Bheem"));

        g.start();
    }
}