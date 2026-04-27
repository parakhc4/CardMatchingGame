# Card Matching Game


# # Functional Requirements:

FR1: The system should allow the user to play the game wherein they first select a Card, from a variable grid, which gets revealed. Then they have another chance to select one more card in that turn. If the second card matches the first card, they both stay revealed and users score increases. If not, the cards are hidden again. The system should not allow the user to click on a pre-revealed card. The user wins once all cards are revealed.


FR2: System should manage the user score and keep a record of the best score.


FR3: The system should manage the game and make sure the cards are reset once a game is over, and the pattern is not repeated.



# # Entities

User: id, name, bestScore

Card: id, cardFace (Int), cardStatus (ENUM)

Grid: cards (List<List<Card>>), gridSize

Game: gameStatus (ENUM), currentScore, user, grid, firstFlippedCard

TurnResult: flippedCard, isMatch, isGameComplete


# # Services

UserService: getBestScore()

GameService: startGame(), playTurn(), checkMatch(), checkWin(), resetGame()