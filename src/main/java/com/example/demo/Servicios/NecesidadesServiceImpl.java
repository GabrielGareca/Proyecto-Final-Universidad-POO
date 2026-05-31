package com.example.demo.Servicios;

import com.example.demo.Modelo.Necesidades;
import com.example.demo.Repositorio.BaseRepository;
import com.example.demo.Repositorio.NecesidadesRepository;
import org.springframework.stereotype.Service;

@Service
public class NecesidadesServiceImpl extends BaseServiceImpl<Necesidades, Long> implements NecesidadesService {

    NecesidadesRepository necesidadesRepository;

    public NecesidadesServiceImpl(BaseRepository<Necesidades, Long> baseRepository, NecesidadesRepository necesidadesRepository) {
        super(baseRepository);
        this.necesidadesRepository = necesidadesRepository;
    }
    @Override
    public Object search(String filtro) throws Exception {
        return null;
    }
}
