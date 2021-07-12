package br.com.murielmagno.beerApi.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum BeerType {

    ALE("Ale"),
    IPA("Ipa"),
    LAGER("Lager"),
    PILSEN("Pilsen"),
    MALZBIER("Malzbier"),
    WITBIER("Witbier"),
    WEISS("Weiss"),
    STOUT("STOUT");

    private final String descricao;
}
