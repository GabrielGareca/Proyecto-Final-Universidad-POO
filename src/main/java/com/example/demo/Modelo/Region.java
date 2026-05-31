package com.example.demo.Modelo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Basic;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.envers.Audited;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Audited
public class Region extends Base {

    @Basic
    private String nombre;
    private String aspectosSocioCulturales;
    private String nivelGrupal;
    private String nivelPersonal;
    private String parteEspecificaDelPais;

    @ManyToMany
    @JsonIgnore
    private List<Universidad>universidades = new ArrayList();

    @ManyToMany
    @JsonIgnore
    private List<Necesidades> necesidades = new ArrayList();

    @ManyToMany
    @JsonIgnore
    private List<Problemas>problemas = new ArrayList();

}
