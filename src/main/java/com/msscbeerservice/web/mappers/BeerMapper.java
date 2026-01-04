package com.msscbeerservice.web.mappers;

import com.msscbeerservice.domain.Beer;
import com.msscbeerservice.web.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper(uses = DateMapper.class)
public interface BeerMapper {

    BeerDto beerToBeerDto(Beer beer);
    Beer beerDtotoBeer(BeerDto beerDto);
}
