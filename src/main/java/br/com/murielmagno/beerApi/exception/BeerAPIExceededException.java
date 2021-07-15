package br.com.murielmagno.beerApi.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class BeerAPIExceededException extends Exception {

    public BeerAPIExceededException(Long id, int quantityToIncrement) {
        super(String.format("Cerveja com %s ID informado excede a capacidade máxima de estoque: %s", id, quantityToIncrement));
    }
}
