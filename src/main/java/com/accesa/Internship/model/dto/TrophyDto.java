/*
 * Copyright (c) 2018 7 8 Valentin Bara
 */

package com.accesa.Internship.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDate;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TrophyDto extends BaseDto implements Serializable {

    private Long id;

    private String name;

    private Long playerId;

    private LocalDate received;

    private Long prize;

}
