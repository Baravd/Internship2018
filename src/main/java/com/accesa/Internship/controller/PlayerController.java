/*
 * Copyright (c) 2018 7 7 Valentin Bara
 */

package com.accesa.Internship.controller;

import com.accesa.Internship.model.Player;
import com.accesa.Internship.service.PlayerService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class PlayerController {

    private final PlayerService playerService;

    public PlayerController(PlayerService playerService) {
        this.playerService = playerService;
    }

    @GetMapping("/players")
    public List<Player> getPlayers() {
        return playerService.findAll();
    }

    @PostMapping("/players")
    public Player save(@RequestBody Player player) {
        return playerService.save(player);
    }

    @GetMapping("/players/{id}")
    public Player findById(@PathVariable("id") Long id) {
        return playerService.findById(id);
    }

    @GetMapping("/player")
    public Player findByName(@RequestParam("name") String name) {
        return playerService.findByName(name);
    }

    @DeleteMapping("/players/{id}")
    public boolean delete(@PathVariable("id") long id) {
        return playerService.delete(id);
    }

    @PutMapping("/players/{id}")
    public Player update(@RequestBody Player player, @PathVariable("id") long id) {
        player.setId(id);
        return playerService.update(player);
    }
}
