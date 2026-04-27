package service;

import model.User;

public class UserService {
    public int viewScore(User user){
        return user.getBestScore();
    }
}
