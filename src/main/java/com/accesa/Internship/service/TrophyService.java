/*
 * Copyright (c) 2018 7 8 Valentin Bara
 */

package com.accesa.Internship.service;

import com.accesa.Internship.model.Trophy;
import com.accesa.Internship.repository.TrophyRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrophyService {

    private final TrophyRepository trophyRepository;

    public TrophyService(TrophyRepository trophyRepository) {
        this.trophyRepository = trophyRepository;
    }

    public Trophy save(Trophy trophy) {
        return trophyRepository.save(trophy);
    }

    public List<Trophy> findAll() {
        return trophyRepository.findAll();
    }
}
