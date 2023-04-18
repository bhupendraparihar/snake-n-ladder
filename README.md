# Snake & Ladder

[](https://cdn.shopify.com/s/files/1/0876/1176/files/i984_pimgpsh_fullsize_distr.png?v=1525140332)

## Class Diagram

```mermaid

classDiagram
    class Game {
        Board b
        ArrayList~Player~ players
        ArrayList~int~ playerPositions
        Dice d
        
        +addPlayer(Player p)
        +move(Player p, int playerIndex, int increment)
        +start()
    }

    class Board {
        +int size
        +addSnake()
        +addLadder()
        +isCurrentPositionSnakeOrLadder()
    }
    
    class Snake {
        int head
        int tail
    }

    class Ladder {
        int start
        int end
    }

    class Dice {
        +rollDice()
    }

    class Player {
        String name
    }

    class SnakeParameterException {

    }

    class LadderParameterException {

    }

    Game *-- Player
    Game <-- Board
    Game <-- Dice
    Board *-- Snake
    Board *-- Ladder
    Board --> SnakeParameterException : throws
    Board --> LadderParameterException : throws

```

## How to run
- Create the instance of Game class
```java
Game g = new Game(new Board(100));
```

- Add Players
```java
g.addPlayer(new Player("Arjun"));
g.addPlayer(new Player("Bheem"));
```

- Start the game by calling start method
```java
g.start()
```
