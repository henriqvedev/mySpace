package com.myspace.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_players")
public class Players {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // N precisa setar o id com essa strategy
    private Long id;
    private String name;

    @OneToOne
    @JoinColumn (name = "armario_id") //nome da chave estrangeira do banco "Armario"
    private Armarios armarios;//usando a classe Armario como atributo - composicao de objetos - associacao entre as entidades

    public Players(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Armarios getArmarios() {
        return armarios;
    }

    public void setArmarios(Armarios armarios) {
        this.armarios = armarios;
    }
}
