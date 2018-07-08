/*
 * Copyright (c) 2018 7 8 Valentin Bara
 */

package com.accesa.Internship.repository;

import com.accesa.Internship.model.Trophy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrophyRepository extends JpaRepository<Trophy, Long> {


}
