package br.diego.screenmatch.service;

public interface IConverteDados {
   <T> T obterDados(String json, Class<T> classe);
       //<T> T Fala que o tipo de retorno será algo genérico
    //eu recebo uma string de json e uma classe e lá no cabeçalho eu tento converter isso
}
