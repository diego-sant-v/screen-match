package br.diego.screenmatch.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)//ignora oque não encontrar
//tudo oque não for title, totalSeasons ou imdbReating ele vai ignorar
public record DadosSerie(@JsonAlias("Title") String titulo,
                         @JsonAlias("totalSeasons") Integer totalTemporadas,
                         @JsonAlias("imdbRating") String avaliacao){
    //jsonProperty serve tanto para ler quanto para gravar
    //ou seja, ele le e grava com o nome da propriedade(em "")
    //o JsonAlias só lê mas na hora de usar ele coloca o nome original do atributo que defini
}
