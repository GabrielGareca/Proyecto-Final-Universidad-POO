package com.example.demo.Modelo;

import jakarta.persistence.Basic;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.envers.Audited;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Audited
public class InterfazIngresoInformacion extends Base {

    @Basic
    protected String comentariosAbiertosEnLinea;
    protected String formularioEnLinea;
    protected String plataformaDeSoftware;

}
