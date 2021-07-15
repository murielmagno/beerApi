package br.com.murielmagno.beerApi.controller;

import br.com.murielmagno.beerApi.dto.BeerDTO;
import br.com.murielmagno.beerApi.exception.BeerAlreadyRegisteredException;
import br.com.murielmagno.beerApi.exception.BeerNotFoundException;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Api("Gerencia de cerveja")
public interface BeerControllerDocs {

    @ApiOperation(value = "Operação de criação da cerveja")
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Criação da cerveja efetuada com sucesso"),
            @ApiResponse(code = 400, message = "Campos obrigatórios ausentes ou valor de campo incorreto.")
    })
    BeerDTO createBeer(BeerDTO beerDTO) throws BeerAlreadyRegisteredException;

    @ApiOperation(value = "Retorna cerveja encontrada por nome")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Cerveja encontrada com sucesso."),
            @ApiResponse(code = 404, message = "Cerveja com o nome informado não foi encontrada.")
    })
    BeerDTO findByName(@PathVariable String name) throws BeerNotFoundException;

    @ApiOperation(value = "Retorna uma lista de todas as cervejas cadastradas no sistema")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "\n" +
                    "Lista de todas as cervejas cadastradas no sistema."),
    })
    List<BeerDTO> listBeers();

    @ApiOperation(value = "Exclua uma cerveja encontrada por um determinado ID válido")
    @ApiResponses(value = {
            @ApiResponse(code = 204, message = "Cerveja deletada com sucesso."),
            @ApiResponse(code = 404, message = "Cerveja com o ID informado não foi encontrada.")
    })
    void deleteById(@PathVariable Long id) throws BeerNotFoundException;
}
