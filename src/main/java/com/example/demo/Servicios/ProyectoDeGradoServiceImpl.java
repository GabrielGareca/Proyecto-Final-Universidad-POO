package com.example.demo.Servicios;

import com.example.demo.Modelo.ProyectoDeGrado;
import com.example.demo.Repositorio.BaseRepository;
import com.example.demo.Repositorio.ProyectoDeGradoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProyectoDeGradoServiceImpl extends BaseServiceImpl<ProyectoDeGrado,Long> implements ProyectoDeGradoService{

    @Autowired
    ProyectoDeGradoRepository proyectoDeGradoRepository;

    public ProyectoDeGradoServiceImpl(BaseRepository<ProyectoDeGrado, Long> baseRepository, ProyectoDeGradoRepository proyectoDeGradoRepository) {
        super(baseRepository);
        this.proyectoDeGradoRepository = proyectoDeGradoRepository;
    }

    @Override
    public Object search(String filtro) throws Exception {
        return null;
    }
}
