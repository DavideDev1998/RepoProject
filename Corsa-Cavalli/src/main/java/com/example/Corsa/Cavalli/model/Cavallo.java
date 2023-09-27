package com.example.Corsa.Cavalli.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Table(name = "cavallo")
@Entity
@NoArgsConstructor
public class Cavallo implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "sesso")
    private String sesso;
    @OneToOne(mappedBy = "cavallo")
    private Classifica classifica;

    public Cavallo(Integer id, String name, String sesso) {
        this.id = id;
        this.name = name;
        this.sesso = sesso;
    }


}
