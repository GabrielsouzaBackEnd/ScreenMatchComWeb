package br.com.alura.screenmatch.dto;

import br.com.alura.screenmatch.model.Categoria;
//Aqui é os dados que serão apresentado na página
public record SerieDTO(Long id,
                       String titulo,
                       Integer totalTemporadas,
                       Double  avaliacao,
                       Categoria genero,
                       String atores,
                       String poster,
                       String sinopse) {
}
