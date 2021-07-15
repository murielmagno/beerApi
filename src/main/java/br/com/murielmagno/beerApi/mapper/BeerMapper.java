package br.com.murielmagno.beerApi.mapper;

import br.com.murielmagno.beerApi.dto.BeerDTO;
import br.com.murielmagno.beerApi.entity.Beer;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BeerMapper {

    BeerMapper INSTANCE = Mappers.getMapper(BeerMapper.class);

    Beer toModel(BeerDTO beerDTO);

    BeerDTO toDTO(Beer beer);
}
