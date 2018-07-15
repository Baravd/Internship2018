/*
 * Copyright (c) 2018 7 8 Valentin Bara
 */

package com.accesa.Internship.converter;

import com.accesa.Internship.model.Player;
import com.accesa.Internship.model.Trophy;
import com.accesa.Internship.model.dto.TrophyDto;
import com.accesa.Internship.service.PlayerService;
import org.springframework.stereotype.Component;

@Component
public class TrophyConverter extends BaseConverter<Trophy, TrophyDto> {

    private static final long DEFAULT_PRIZE = 1000;

    private final PlayerService playerService;

    public TrophyConverter(PlayerService playerService) {
        this.playerService = playerService;
    }


    @Override
    public TrophyDto convertModelToDto(Trophy trophy) {
        return TrophyDto.builder()
                        .playerId(trophy.getId())
                        .name(trophy.getName())
                        .received(trophy.getReceived())
                        .prize(DEFAULT_PRIZE)
                        .id(trophy.getId())
                        .build();
    }

    @Override
    public Trophy convertDtoToModel(TrophyDto trophyDto) {
        return Trophy.builder().name(trophyDto.getName()).received(trophyDto.getReceived()).build();
    }
}
