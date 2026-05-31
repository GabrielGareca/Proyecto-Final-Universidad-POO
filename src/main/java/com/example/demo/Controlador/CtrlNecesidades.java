package com.example.demo.Controlador;

import com.example.demo.Modelo.Necesidades;
import com.example.demo.Servicios.NecesidadesServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/necesidades")
public class CtrlNecesidades extends BaseControllerImpl<Necesidades, NecesidadesServiceImpl, Long>{
    public CtrlNecesidades(NecesidadesServiceImpl servicio) {
        super(servicio);
    }
}
