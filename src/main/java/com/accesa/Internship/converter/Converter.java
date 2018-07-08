/*
 * Copyright (c) 2018 7 8 Valentin Bara
 */

package com.accesa.Internship.converter;

public interface Converter<Model, Dto> {

    Dto convertModelToDto(Model model);

    Model convertDtoToModel(Dto dto);

}
