package com.example.Corsa.Cavalli.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Table(name = "classifica")
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Classifica implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @OneToOne
    @JoinColumn(name = "cavallo_id")
    private Cavallo cavallo;

    private Integer punteggio;

    public Classifica(Cavallo cavallo, Integer punteggio) {
        this.cavallo = cavallo;
        this.punteggio = punteggio;
    }


}
