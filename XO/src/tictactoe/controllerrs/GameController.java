package tictactoe.controllerrs;

import tictactoe.exceptions.InvalidBotCountException;
import tictactoe.exceptions.InvalidMoveException;
import tictactoe.exceptions.InvalidNumberOfPlayersException;
import tictactoe.models.Game;
import tictactoe.models.GameState;
import tictactoe.models.Player;
import tictactoe.strategies.winingstrategies.GameWinningStrategy;

import java.util.List;

public class GameController {
    //In the Controller class, we'll write all the methods which client needs from our System.
    public Game startGame(int dimension, List<Player> players, List<GameWinningStrategy> winningStrategies) throws InvalidBotCountException, InvalidNumberOfPlayersException {
        return Game.getBuilder()
                .setDimension(dimension)
                .setPlayers(players)
                .setWinningStrategies(winningStrategies)
                .build();
    }

    public void makeMove(Game game) throws InvalidMoveException {
        game.makeMove();
    }

    public GameState getGameState(Game game) {
        return game.getGameState();
    }

    public void undo(Game game) {
        game.undo();
    }

    public void displayBoard(Game game) {
        game.getBoard().displayBoard();
    }

    public Player getWinner(Game game) {
        return game.getWinnner();
    }
}