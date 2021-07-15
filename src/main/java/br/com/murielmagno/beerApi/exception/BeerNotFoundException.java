package br.com.murielmagno.beerApi.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class BeerNotFoundException extends Exception {

    public BeerNotFoundException(String beerName) {
        super(String.format("Cerveja com o nome %s não foi encontrada.", beerName));
    }

    public BeerNotFoundException(Long id) {
        super(String.format("Cerveja com id %s não foi encontrada.", id));
    }
}
