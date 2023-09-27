package com.example.Corsa.Cavalli.model.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RequestDto {
    private Integer idCavallo;
    private String nameCavallo;
    private String sessoCavallo;
}
