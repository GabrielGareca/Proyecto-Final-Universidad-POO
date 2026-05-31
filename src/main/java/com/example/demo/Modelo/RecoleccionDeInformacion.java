package com.example.demo.Modelo;

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
public class RecoleccionDeInformacion extends InterfazIngresoInformacion{
    protected String datosDeLosAfectados;
    protected String datosDeLosDirectamenteInterezados;

}
