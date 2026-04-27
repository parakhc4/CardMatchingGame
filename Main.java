import model.*;
// import service.*;
import service.GameService;


public class Main {

    public static void main(String[] args) {
        GameService gameService = new GameService();
        gameService.startGame("Parakh",4);
        gameService.playTurn(2, 3);
        System.out.println(gameService.playTurn(3, 5));
        
    }

}
