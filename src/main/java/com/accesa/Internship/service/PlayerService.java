/*
 * Copyright (c) 2018 7 8 Valentin Bara
 */

package com.accesa.Internship.service;

import com.accesa.Internship.exception.MissingIdException;
import com.accesa.Internship.model.Player;
import com.accesa.Internship.repository.PlayerRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class PlayerService {

    private final PlayerRepository playerRepository;

    public PlayerService(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    public Player save(Player player) {
        return playerRepository.save(player);
    }

    public List<Player> findAll() {
        return playerRepository.findAll();
    }

    public boolean delete(Long id) {
        playerRepository.deleteById(id);
        return Boolean.TRUE;
    }

    @Transactional
    public Player update(Player player)
            throws MissingIdException {
        Player oldPlayer = findById(player.getId());
        oldPlayer.setDob(player.getDob());
        oldPlayer.setCurrentRanking(player.getCurrentRanking());
        oldPlayer.setName(player.getName());
        return oldPlayer;
    }

    public Player findById(Long id) {
        Optional<Player> player = playerRepository.findById(id);
        if (player.isPresent()) {
            return player.get();
        } else {
            throw new MissingIdException("Supplied id does not exist");
        }
    }

    public Player findByName(String name) {
        Optional<Player> player = playerRepository.findByName(name);
        player.orElseThrow(() -> new IllegalArgumentException("No such name"));
        return player.get();
    }
}
