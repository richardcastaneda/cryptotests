package com.cryptocommunitytest.test.services;


import com.cryptocommunitytest.test.models.Coin;
import com.cryptocommunitytest.test.repositories.CoinRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CoinService {

  @Autowired
  CoinRepository repository;

  public Coin addCoinToUser(Coin genereatedCoin) {
    return repository.save(genereatedCoin);
  }

  public Integer removeCoinFromUser(String userId, String coinName) {
    return repository.removeCoinFromUser(coinName, userId);
  }

  public List<Coin> findCoinsForUser(String userId) {
    return repository.findCoinsForUser(userId);
  }

  public List<Coin> findUsersForCoin(String coinId) {
    return repository.findUsersForCoin(coinId);
  }
}
