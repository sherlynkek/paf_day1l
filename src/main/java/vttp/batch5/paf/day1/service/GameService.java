package vttp.batch5.paf.day1.service;

import org.springframework.stereotype.Service;

import vttp.batch5.paf.day1.model.Game;
import vttp.batch5.paf.day1.repo.GameRepo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

@Service
public class GameService {
    
    @Autowired
    private GameRepo gameRepo;
    
    public List<Game> getGames() {
        return gameRepo.getGames(5);
    }

    public List<Game> getGames(int count) {
        return gameRepo.getGames(count);
    }
}
