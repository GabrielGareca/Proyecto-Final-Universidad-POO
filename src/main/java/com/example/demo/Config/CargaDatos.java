package com.example.demo.Config;

import com.example.demo.Modelo.*;
import com.example.demo.Repositorio.*;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class CargaDatos implements CommandLineRunner {

    private final EstudianteRepository estudianteRepository;
    private final UniversidadRepository universidadRepository;
    private final NecesidadesRepository necesidadesRepository;
    private final ProyectoDeGradoRepository proyectoRepository;
    private final PersonalDocenteRepository docenteRepository;

    @Override
    public void run(String... args) {


        if (estudianteRepository.count() > 0) {
            return;
        }

        ProyectoDeGrado proyecto = new ProyectoDeGrado();
        proyecto.setTitulo("Sistema de Gestión Universitaria");
        proyecto.setAlcance("Resultado exitoso");
        proyecto.setCosto(50000);
        proyecto.setObjetivo("Digitalizar procesos académicos");
        proyecto.setPlanDelProyecto("Análisis, diseño e implementación");
        proyecto.setTiempoDeRealizacion(12);
        proyecto.setViabilidad(1);

        proyecto = proyectoRepository.save(proyecto);

        Universidad universidad = new Universidad();
        universidad.setNombre("Universidad Nacional de Cuyo");
        universidad.setCunaDelConocimiento("Mendoza");
        universidad.setDiferentesCarreras("Ingeniería, Salud, Economía");
        universidad.setPublica("SI");
        universidad.setPrivada("NO");

        universidad = universidadRepository.save(universidad);

        Necesidades necesidad1 = new Necesidades();
        necesidad1.setDefinir("Automatizar la gestión de proyectos");

        Necesidades necesidad2 = new Necesidades();
        necesidad2.setDefinir("Centralizar la información académica");

        necesidad1 = necesidadesRepository.save(necesidad1);
        necesidad2 = necesidadesRepository.save(necesidad2);

        Estudiante estudiante = new Estudiante();
        estudiante.setNombre("Gabriel");
        estudiante.setApellido("Gareca");
        estudiante.setDni(40123456);
        estudiante.setAspiranteAGrado(1);
        estudiante.setProyectoDeGrado(proyecto);

        estudiante = estudianteRepository.save(estudiante);

        universidad.getEstudiante().add(estudiante);
        universidadRepository.save(universidad);
        
        PersonalDocente docente1 = new PersonalDocente();
        docente1.setDni(30111222);
        docente1.setNombre("Juan");
        docente1.setApellido("Pérez");
        docente1.setConocimiento("Bases de Datos");
        docente1.setExperiencia("10 años en sistemas de información");
        docente1.setTrayectoria(10);
        docente1.setEstudiante(estudiante);

        docente1 = docenteRepository.save(docente1);

        PersonalDocente docente2 = new PersonalDocente();
        docente2.setDni(28999888);
        docente2.setNombre("Ana");
        docente2.setApellido("Gómez");
        docente2.setConocimiento("Ingeniería de Software");
        docente2.setExperiencia("8 años en desarrollo de software");
        docente2.setTrayectoria(8);
        docente2.setEstudiante(estudiante);

        docente2 = docenteRepository.save(docente2);

        System.out.println("Datos iniciales cargados correctamente.");
    }
}