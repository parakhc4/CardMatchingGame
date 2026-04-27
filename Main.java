import model.*;
// import service.*;
import service.GameService;


public class Main {

    public static void main(String[] args) {
        GameService gameService = new GameService();
        gameService.startGame("Parakh",4);
        
        
    }

}
