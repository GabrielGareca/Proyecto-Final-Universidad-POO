package com.example.demo.Controlador;

import com.example.demo.Modelo.ProyectoDeGrado;
import com.example.demo.Servicios.ProyectoDeGradoServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/proyectos")
public class CtrlProyectoDeGrado extends BaseControllerImpl<ProyectoDeGrado, ProyectoDeGradoServiceImpl, Long> {
    public CtrlProyectoDeGrado(ProyectoDeGradoServiceImpl servicio) {
        super(servicio);
    }
}
