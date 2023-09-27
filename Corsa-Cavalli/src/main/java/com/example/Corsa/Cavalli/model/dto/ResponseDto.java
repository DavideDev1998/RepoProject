package com.example.Corsa.Cavalli.model.dto;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseDto {

    private Integer idCavallo;
    private String nomeCavallo;
    private String sessoCavallo;
    private Integer punteggio;
    private Integer idClassifica;

    public ResponseDto(Integer idCavallo, String nomeCavallo, String sessoCavallo) {
        this.idCavallo = idCavallo;
        this.nomeCavallo = nomeCavallo;
        this.sessoCavallo = sessoCavallo;
    }
}
