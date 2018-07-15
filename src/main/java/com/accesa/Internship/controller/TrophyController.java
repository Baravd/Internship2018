/*
 * Copyright (c) 2018 7 8 Valentin Bara
 */

package com.accesa.Internship.controller;

import com.accesa.Internship.converter.TrophyConverter;
import com.accesa.Internship.model.Trophy;
import com.accesa.Internship.model.dto.TrophyDto;
import com.accesa.Internship.service.TrophyService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TrophyController {

    private final TrophyService trophyService;

    private final TrophyConverter trophyConverter;

    public TrophyController(TrophyService trophyService, TrophyConverter trophyConverter) {
        this.trophyService = trophyService;
        this.trophyConverter = trophyConverter;
    }

    @GetMapping("/trophies")
    public List<TrophyDto> getTrophies() {
        return trophyConverter.convertModelsToDtos(trophyService.findAll());
    }

    @PostMapping("/trophies")
    public Trophy save(@RequestBody Trophy trophyDto) {
        return trophyService.save(trophyDto);
    }
}
