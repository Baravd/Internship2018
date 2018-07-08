/*
 * Copyright (c) 2018 7 8 Valentin Bara
 */

package com.accesa.Internship.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Entity
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Trophy extends BaseEntity<Long> {

    @NotNull
    private String name;

    @Column(name = "date_of_win", unique = true)
    @NotNull
    private LocalDate received;

    @ManyToOne
    @JoinColumn(name = "player_id")
    private Player player;


}
