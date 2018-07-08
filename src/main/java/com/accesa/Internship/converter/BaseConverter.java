/*
 * Copyright (c) 2018 7 8 Valentin Bara
 */

package com.accesa.Internship.converter;

import com.accesa.Internship.model.BaseEntity;
import com.accesa.Internship.model.dto.BaseDto;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public abstract class BaseConverter<Model extends BaseEntity<Long>, Dto extends BaseDto>
        implements Converter<Model, Dto> {

    public List<Model> convertDtosToModels(Collection<Dto> dtos) {
        return dtos.stream().map(this::convertDtoToModel).collect(Collectors.toList());

    }

    public List<Dto> convertModelsToDtos(Collection<Model> models) {
        return models.stream().map(this::convertModelToDto).collect(Collectors.toList());
    }
}
