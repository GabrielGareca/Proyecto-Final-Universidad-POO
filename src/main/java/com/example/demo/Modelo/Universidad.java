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
public class Universidad extends Base{



    @Basic
    private String nombre;
    private String cunaDelConocimiento;
    private String diferentesCarreras;
    private String privada;
    private String publica;

    @ManyToMany
    @JsonIgnore
    private List<RecoleccionDeInformacion>recoleccionDeInformacion = new ArrayList();

    @ManyToMany(mappedBy = "universidades")
    @JsonIgnore
    private List<Region> region = new ArrayList();

    @ManyToMany
    @JsonIgnore
    private List<Estudiante> estudiante = new ArrayList();

    @ManyToMany
    @JsonIgnore
    private List<PersonalDocente>personalDocente = new ArrayList();
    
}
